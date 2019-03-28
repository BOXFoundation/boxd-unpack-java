package one.contentbox.boxd;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.Account;
import one.contentbox.boxd.account.DefaultAccount;
import one.contentbox.boxd.constant.DebugLevel;
import one.contentbox.boxd.proto.*;
import one.contentbox.boxd.proto.FetchUtxosResp;
import one.contentbox.boxd.proto.ViewTxDetailResp;
import one.contentbox.boxd.request.*;
import one.contentbox.boxd.response.*;
import one.contentbox.boxd.rpc.ContorlCommandGrpc;
import one.contentbox.boxd.rpc.FaucetGrpc;
import one.contentbox.boxd.rpc.TransactionCommandGrpc;
import one.contentbox.boxd.rpc.WebApiGrpc;
import one.contentbox.boxd.script.Opcode;
import one.contentbox.boxd.util.AddressUtils;
import one.contentbox.boxd.util.OutPointHashParserUtils;
import one.contentbox.boxd.util.TxUtils;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *  Boxd client implemention
 */
@Slf4j
public class BoxdClientImpl implements BoxdClient {

    private String host = "localhost";
    private int port = 19111;

    ManagedChannel managedChannel = null;

    ContorlCommandGrpc.ContorlCommandBlockingStub contorlCommandBlockingStub;
    TransactionCommandGrpc.TransactionCommandBlockingStub transactionCommandBlockingStub;
    WebApiGrpc.WebApiBlockingStub webApiBlockingStub;
    FaucetGrpc.FaucetBlockingStub faucetBlockingStub;

    Account account = new DefaultAccount();

    public BoxdClientImpl(String host, int port) {
        if (host != null && !"".equalsIgnoreCase(host)) {
            this.host = host;
        }
        this.port = port;

        this.managedChannel = ManagedChannelBuilder
                .forAddress(this.host, this.port)
                .usePlaintext()
                .enableRetry()
                .maxRetryAttempts(1)
                .build();

        this.contorlCommandBlockingStub = ContorlCommandGrpc
                .newBlockingStub(this.managedChannel).withWaitForReady();
        this.transactionCommandBlockingStub = TransactionCommandGrpc
                .newBlockingStub(this.managedChannel).withWaitForReady();
        this.webApiBlockingStub = WebApiGrpc.newBlockingStub(this.managedChannel).withWaitForReady();
        this.faucetBlockingStub = FaucetGrpc.newBlockingStub(this.managedChannel).withWaitForReady();
    }

    @Override
    public ManagedChannel getManagedChannel() {
        return managedChannel;
    }

    @Override
    public String dumpPrivKeyFromKeyStore(File file, String passphrase) throws FileNotFoundException,  BoxdException {
        return account.dumpPrivKeyFromKeyStore(file, passphrase);
    }

    @Override
    public String dumpAddrFromPrivKey(String privKey) throws BoxdException {
        return account.dumpAddrFromPrivKey(privKey);
    }

    @Override
    public String dumpPubKeyFromPrivKey(String privKey) throws BoxdException {
        return account.dumpPubKeyFromPrivKey(privKey);
    }

    @Override
    public String dumpPubKeyHashFromPrivKey(String privKey) throws BoxdException {
        return account.dumpPubKeyHashFromPrivKey(privKey);
    }

    @Override
    public String dumpAddrFromPrivKey(byte[] privKeyBytes) throws BoxdException {
        return null;
    }

    @Override
    public String dumpPubKeyFromPrivKey(byte[] privKeyBytes) throws BoxdException {
        return account.dumpPubKeyFromPrivKey(privKeyBytes);
    }

    @Override
    public String dumpPubKeyHashFromPrivKey(byte[] privKeyBytes) throws BoxdException, Exception {
        return account.dumpPubKeyFromPrivKey(privKeyBytes);
    }

    @Override
    public byte[] sign(byte[] txBytes, byte[] privKeyBytes) throws BoxdException {
        return account.sign(txBytes, privKeyBytes);
    }

    @Override
    public byte[] sign(byte[] txBytes, String privKey) throws BoxdException {
        return account.sign(txBytes, privKey);
    }

    @Override
    public byte[] dumpPubKey(String privKey) throws BoxdException {
        return account.dumpPubKey(privKey);
    }

    @Override
    public byte[] dumpPubKeyHash(String privKey) throws BoxdException {
        return account.dumpPubKeyHash(privKey);
    }

    @Override
    public boolean newAccount(String passphrase, String keyStoreFilePath)
            throws BoxdException, FileAlreadyExistsException, Exception {
        return account.newAccount(passphrase, keyStoreFilePath);
    }

    @Override
    public String faucet(String addr, long amount) throws BoxdException {
        ClaimReq.Builder builder = ClaimReq.newBuilder();
        builder.setAddr(addr);
        builder.setAmount(amount);
        ClaimResp claimResp = faucetBlockingStub.claim(builder.build());
        if (claimResp.getCode() != 0) {
            throw new BoxdException(claimResp.getCode(), claimResp.getMessage());
        }
        return claimResp.getHash();
    }


    @Override
    public String addNode(String nodeId) throws BoxdException {
        BaseResponse baseResponse = contorlCommandBlockingStub
                .addNode(AddNodeRequest.newBuilder().setNode(nodeId).build());
        if (baseResponse.getCode() != 0) {
            throw new BoxdException(baseResponse.getCode(), baseResponse.getMessage());
        }
        return nodeId;
    }

    @Override
    public Block getBlock(String blockHash) throws BoxdException {
        GetBlockResponse blockResponse = contorlCommandBlockingStub
                .getBlock(GetBlockRequest.newBuilder().setBlockHash(blockHash).build());
        if (blockResponse.getCode() != 0) {
            throw new BoxdException(blockResponse.getCode(), blockResponse.getMessage());
        }
        return blockResponse.getBlock();
    }

    @Override
    public String getBlockHash(int blockHeight) throws BoxdException {
        GetBlockHashResponse blockHashResponse = contorlCommandBlockingStub
                .getBlockHash(GetBlockHashRequest.newBuilder().setHeight(0).build());
        if (blockHashResponse.getCode() != 0) {
            throw new BoxdException(blockHashResponse.getCode(), blockHashResponse.getMessage());
        }
        return blockHashResponse.getHash();
    }

    @Override
    public int getNetworkId() throws BoxdException {
        GetNetworkIDResponse networkIDResponse = contorlCommandBlockingStub
                .getNetworkID(GetNetworkIDRequest.newBuilder().build());
        return networkIDResponse.getId();
    }

    @Override
    public int updateNetworkId(int id) throws BoxdException {
        BaseResponse baseResponse = contorlCommandBlockingStub
                .updateNetworkID(UpdateNetworkIDRequest.newBuilder()
                        .setId(id).build());
        if (baseResponse.getCode() != 0) {
            throw new BoxdException(baseResponse.getCode(), baseResponse.getMessage());
        }
        return id;
    }

    @Override
    public String setDebugLevel(String level) throws BoxdException {
        if(!DebugLevel.levels.contains(level)){
            throw new BoxdException(-1, "Debug level not supported");
        }

        BaseResponse baseResponse = contorlCommandBlockingStub
                .setDebugLevel(DebugLevelRequest.newBuilder().setLevel(level).build());
        if (baseResponse.getCode() != 0) {
            throw new BoxdException(baseResponse.getCode(), baseResponse.getMessage());
        }
        return level;
    }

    @Override
    public BlockHeader getBlockHeader(String hash) throws BoxdException {
        GetBlockHeaderResponse blockHeaderResponse = contorlCommandBlockingStub
                .getBlockHeader(GetBlockRequest.newBuilder().setBlockHash(hash).build());
        if (blockHeaderResponse.getCode() != 0) {
            throw new BoxdException(blockHeaderResponse.getCode(), blockHeaderResponse.getMessage());
        }
        return blockHeaderResponse.getHeader();
    }

    @Override
    public NodeInfoResp getNodeInfo() throws BoxdException {
        GetNodeInfoResponse nodeInfoResponse = contorlCommandBlockingStub
                .getNodeInfo(GetNodeInfoRequest.newBuilder().build());
        return new NodeInfoResp(nodeInfoResponse);
    }

    @Override
    public int getBlockHeight() throws BoxdException {
        GetBlockHeightResponse blockHeightResponse = contorlCommandBlockingStub
                .getBlockHeight(GetBlockHeightRequest.newBuilder().build());
        if (blockHeightResponse.getCode() != 0) {
            throw new BoxdException(blockHeightResponse.getCode(), blockHeightResponse.getMessage());
        }
        return blockHeightResponse.getHeight();
    }

    @Override
    public BalanceResp getBalance(List<String> addrs) throws BoxdException {
        GetBalanceReq.Builder builder = GetBalanceReq.newBuilder();
        builder.addAllAddrs(addrs);
        GetBalanceResp balanceResp = transactionCommandBlockingStub.getBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }
        return new BalanceResp(balanceResp);
    }

    @Override
    public one.contentbox.boxd.response.FetchUtxosResp fetchUtxos(String address, long amount, String tokenHash, int tokenIndex) throws BoxdException {
        FetchUtxosReq.Builder builder = FetchUtxosReq.newBuilder();
        builder.setAddr(address)
                .setAmount(amount)
                .setTokenIndex(tokenIndex);
        if (tokenHash != null && !"".equalsIgnoreCase(tokenHash)) {
            builder.setTokenHash(tokenHash);
        }

        FetchUtxosResp fetchUtxosResp = transactionCommandBlockingStub
                .fetchUtxos(builder.build());
        if (fetchUtxosResp.getCode() != 0) {
            throw new BoxdException(fetchUtxosResp.getCode(), fetchUtxosResp.getMessage());
        }
        return new one.contentbox.boxd.response.FetchUtxosResp(fetchUtxosResp);
    }

    @Override
    public long getFeePrice() throws BoxdException {
        GetFeePriceResponse feePriceResponse = transactionCommandBlockingStub
                .getFeePrice(GetFeePriceRequest.newBuilder().build());

        if (!feePriceResponse.isInitialized()) {
            throw new BoxdException(-1, "");
        }
        return feePriceResponse.getBoxPerByte();
    }

    @Override
    public BalanceResp getTokenbalance(List<String> addrs, String tokenHash, int tokenIndex) throws BoxdException {
        GetTokenBalanceReq.Builder builder = GetTokenBalanceReq.newBuilder();
        builder.addAllAddrs(addrs);
        builder.setTokenHash(tokenHash);
        builder.setTokenIndex(tokenIndex);

        GetBalanceResp balanceResp = transactionCommandBlockingStub.getTokenBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }
        return new BalanceResp(balanceResp);
    }

    @Override
    public Transaction getRawTransaction(String txHash) throws BoxdException {
        ByteString txHashBs = ByteString.copyFromUtf8(txHash);
        GetRawTransactionResponse rawTransactionResponse = transactionCommandBlockingStub
                .getRawTransaction(GetRawTransactionRequest.newBuilder().setHash(txHashBs).build());
        if (!rawTransactionResponse.hasTx()) {
            throw new BoxdException(-1, "Get raw transaction err");
        }
        return rawTransactionResponse.getTx();
    }

    @Override
    public TransactionResp makeUnsignedTx(UnsignedTxReq unsignedTxReq) throws BoxdException {

        MakeTxReq.Builder builder = MakeTxReq.newBuilder();
        builder.setFee(unsignedTxReq.getFee());
        builder.setFrom(unsignedTxReq.getFrom());

        List<String> toes = new ArrayList<>();
        List<Long> amounts = new ArrayList<>();
        Map<String, Long> to = unsignedTxReq.getTo();
        for (String addr : to.keySet()) {
            toes.add(addr);
            amounts.add(to.get(addr));
        }
        builder.addAllAmounts(amounts);
        builder.addAllTo(toes);

        MakeTxResp makeTxResp = transactionCommandBlockingStub
                .makeUnsignedTx(builder.build());
        if (makeTxResp.getCode() != 0) {
            throw new BoxdException(makeTxResp.getCode(), makeTxResp.getMessage());
        }
        return new TransactionResp(makeTxResp);
    }

    @Override
    public String sendTokenToAdddresses(long fee, Map<String, Long> to, String tokenHash, int tokenIndex, String privKeyHex)
            throws BoxdException {
        long transferValue = to.values().stream().mapToLong(Long::longValue).sum();
        if (transferValue <= 0) {
            throw new BoxdException(-1, "Transfer amount must > 0");
        }

        if (transferValue < fee) {
            throw new BoxdException(-1, "Transfer amount must > fee");
        }

        TokenTransferTxReq tokenTransferTxReq = new TokenTransferTxReq();
        tokenTransferTxReq.setFee(fee);
        tokenTransferTxReq.setTo(to);
        tokenTransferTxReq.setTokenHash(tokenHash);
        tokenTransferTxReq.setTokenIndex(tokenIndex);

        String address = dumpAddrFromPrivKey(privKeyHex);
        tokenTransferTxReq.setFrom(address);

        TransactionResp transactionResp = makeUnsignedTokenTransferTx(tokenTransferTxReq);
        Transaction unsignedTx = transactionResp.getTx();

        List<ByteString> rawMsgs = transactionResp.getRawMsgs();

        // calcTxHashForSig
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getVoutList());

        List<TxIn> inList = new ArrayList<>();
        for (int i = 0; i < unsignedTx.getVinCount(); i++) {
            TxIn txIn = unsignedTx.getVin(i);

            byte[] rawMsg = rawMsgs.get(i).toByteArray();
            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg));
            // sig
            byte[] sigBytes = account.sign(sigHashBytes, privKeyHex);
            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKey(privKeyHex));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();

            TxIn.Builder txInBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txInBuilder.build());
        }
        builder.addAllVin(inList);

        Transaction tx = builder.build();
        String hash = sendTransaction(tx);

        return hash;
    }

    @Override
    public SplitAddrTxResp makeUnsignedSplitAddrTx(SplitAddrTxReq splitAddrTxReq) throws BoxdException {
        MakeSplitAddrTxReq.Builder builder = MakeSplitAddrTxReq.newBuilder();
        builder.setFee(splitAddrTxReq.getFee());
        builder.setFrom(splitAddrTxReq.getFrom());

        Map<String, Long> to = splitAddrTxReq.getDetail();
        builder.addAllWeights(to.values());
        builder.addAllAddrs(to.keySet());

        MakeSplitAddrTxResp splitAddrTxResp = transactionCommandBlockingStub.makeUnsignedSplitAddrTx(builder.build());
        if (splitAddrTxResp.getCode() != 0) {
            throw new BoxdException(splitAddrTxResp.getCode(), splitAddrTxResp.getMessage());
        }
        return new SplitAddrTxResp(splitAddrTxResp);
    }

    @Override
    public TokenIssueTxResp makeUnsignedTokenIssueTx(TokenIssueTxReq tokenIssueTxReq) throws BoxdException {
        MakeTokenIssueTxReq.Builder builder = MakeTokenIssueTxReq.newBuilder();
        builder.setFee(tokenIssueTxReq.getFee());
        builder.setIssuee(tokenIssueTxReq.getIssuee());
        builder.setIssuer(tokenIssueTxReq.getIssuer());

        Token token = tokenIssueTxReq.getToken();
        builder.setTag(TokenTag.newBuilder()
                .setName(token.getName())
                .setDecimal(token.getDecimal())
                .setSupply(token.getSupply())
                .setSymbol(token.getSymbol()).build());

        MakeTokenIssueTxResp tokenIssueTxResp = transactionCommandBlockingStub.makeUnsignedTokenIssueTx(builder.build());
        if (tokenIssueTxResp.getCode() != 0) {
            throw new BoxdException(tokenIssueTxResp.getCode(), tokenIssueTxResp.getMessage());
        }
        return new TokenIssueTxResp(tokenIssueTxResp);
    }

    @Override
    public TransactionResp makeUnsignedTokenTransferTx(TokenTransferTxReq tokenTransferTxReq) throws BoxdException {
        MakeTokenTransferTxReq.Builder builder = MakeTokenTransferTxReq.newBuilder();
        builder.setFee(tokenTransferTxReq.getFee());
        builder.setFrom(tokenTransferTxReq.getFrom());
        builder.setTokenHash(tokenTransferTxReq.getTokenHash());
        builder.setTokenIndex(tokenTransferTxReq.getTokenIndex());

        Map<String, Long> to = tokenTransferTxReq.getTo();
        builder.addAllTo(to.keySet());
        builder.addAllAmounts(to.values());

        MakeTxResp makeTxResp = transactionCommandBlockingStub.makeUnsignedTokenTransferTx(builder.build());
        if (makeTxResp.getCode() != 0) {
            throw new BoxdException(makeTxResp.getCode(), makeTxResp.getMessage());
        }
        return new TransactionResp(makeTxResp);
    }

    @Override
    public String sendTransaction(Transaction transaction) throws BoxdException {
        SendTransactionResp sendTransactionResp = transactionCommandBlockingStub
                .sendTransaction(SendTransactionReq.newBuilder().setTx(transaction).build());
        if (sendTransactionResp.getCode() != 0) {
            throw new BoxdException(sendTransactionResp.getCode(), sendTransactionResp.getMessage());
        }
        return sendTransactionResp.getHash();
    }

    @Override
    public BlockDetail viewBlockDetail(String hash) throws BoxdException {
        ViewBlockDetailResp viewBlockDetailResp = webApiBlockingStub
                .viewBlockDetail(ViewBlockDetailReq.newBuilder().setHash(hash).build());
        if (viewBlockDetailResp.getCode() != 0) {
            throw new BoxdException(viewBlockDetailResp.getCode(), viewBlockDetailResp.getMessage());
        } else {
            return viewBlockDetailResp.getDetail();
        }
    }

    @Override
    public one.contentbox.boxd.response.ViewTxDetailResp viewTxDetail(String hash) throws BoxdException {
        ViewTxDetailResp viewTxDetailResp = webApiBlockingStub
                .viewTxDetail(ViewTxDetailReq.newBuilder().setHash(hash).build());
        if (viewTxDetailResp.getCode() != 0) {
            throw new BoxdException(viewTxDetailResp.getCode(), viewTxDetailResp.getMessage());
        } else {
            return new one.contentbox.boxd.response.ViewTxDetailResp(viewTxDetailResp);
        }
    }

    @Override
    public String sendToAdddresses(long fee, Map<String, Long> to, String privKeyHex) throws BoxdException {

        long transferValue = to.values().stream().mapToLong(Long::longValue).sum();
        if (transferValue <= 0) {
            throw new BoxdException(-1, "Transfer amount must > 0");
        }

        if (transferValue < fee) {
            throw new BoxdException(-1, "Transfer amount must > fee");
        }

        // Get address
        String address = account.dumpAddrFromPrivKey(privKeyHex);

        // Check balance
        long balance = 0;
        BalanceResp balanceResp = this.getBalance(new ArrayList<String>() {{
            add(address);
        }});
        if (balanceResp == null || balanceResp.getCount() != 1) {
            throw new BoxdException(-1, "Get balance err");
        }
        balance = balanceResp.getBalances().get(0).longValue();
        if (balance < transferValue + fee) {
            throw new BoxdException(-1, "The Balance of " + address + "is too low for this tx");
        }

        // fetch Utxo
        List<Utxo> utxoList = new ArrayList<>();

        long total = transferValue + fee;

        one.contentbox.boxd.response.FetchUtxosResp fetchUtxosResp = fetchUtxos(address, total, null, 0);
        if (fetchUtxosResp == null || fetchUtxosResp.getCount() < 1) {
            throw new BoxdException(-1, "No utxo found");
        }
        List<Utxo> utxos = fetchUtxosResp.getUtxos();

        long balanceOnChain = 0L;
        for (Utxo utxo : utxos) {
            utxoList.add(utxo);
            balanceOnChain += utxo.getTxOut().getValue();
        }

        // Check real balance again
        if (utxoList.size() < 1) {
            throw new BoxdException(-1, "Parse utxo err");
        }

        if(balanceOnChain < total){
            throw new BoxdException(-1, "The Balance of " + address + "is too low for this tx");
        }

        // create transaction
        Transaction.Builder txBuilder = Transaction.newBuilder();
        // add vin
        List<TxIn> vinsList = new ArrayList<>();
        for (Utxo utxo : utxoList) {
            TxIn tx = TxIn.newBuilder()
                    .setPrevOutPoint(utxo.getOutPoint())
                    .setScriptSig(utxo.getTxOut().getScriptPubKey()).build();
            vinsList.add(tx);
        }

        // add vout
        List<TxOut> vouts = new ArrayList<>();
        for (String addr : to.keySet()) {

            byte[] tmp = AddressUtils.getPkh(addr);

            Opcode opcode = new Opcode();
            opcode.adddOpCode((byte) Opcode.OPDUP).adddOpCode((byte) Opcode.OPHASH160).addOperand(tmp)
                    .adddOpCode((byte) Opcode.OPEQUALVERIFY).adddOpCode((byte) Opcode.OPCHECKSIG);
            byte[] addrScript = opcode.getResult();
            opcode.reset();

            TxOut txOut = TxOut.newBuilder()
                    .setScriptPubKey(ByteString.copyFrom(addrScript))
                    .setValue(to.get(addr)).build();

            vouts.add(txOut);
        }

        // process charge
        if(balanceOnChain > total){
            long charge = balanceOnChain - total;

            byte[] tmp = AddressUtils.getPkh(address);

            Opcode opcode = new Opcode();
            opcode.adddOpCode((byte) Opcode.OPDUP).adddOpCode((byte) Opcode.OPHASH160).addOperand(tmp)
                    .adddOpCode((byte) Opcode.OPEQUALVERIFY).adddOpCode((byte) Opcode.OPCHECKSIG);
            byte[] addrScript = opcode.getResult();
            opcode.reset();

            TxOut txOut = TxOut.newBuilder()
                    .setScriptPubKey(ByteString.copyFrom(addrScript))
                    .setValue(charge).build();

            vouts.add(txOut);
        }

        txBuilder.addAllVin(vinsList);
        txBuilder.addAllVout(vouts);
        Transaction unsignedTx = txBuilder.build();

        // calcTxHashForSig
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getVoutList());

        List<TxIn> inList = new ArrayList<>();
        for (int i = 0; i < unsignedTx.getVinCount(); i++) {
            TxIn txIn = unsignedTx.getVin(i);

            byte[] scriptPubBytes = txIn.getScriptSig().toByteArray();
            byte[] rawMsg = TxUtils.calcTxHashForSig(scriptPubBytes, unsignedTx, i);
            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg));
            // sig
            byte[] sigBytes = account.sign(sigHashBytes, privKeyHex);
            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKey(privKeyHex));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();

            TxIn.Builder txInBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txInBuilder.build());
        }
        builder.addAllVin(inList);

        Transaction tx = builder.build();
        String hash = sendTransaction(tx);
        return hash;
    }


    @Override
    public SplitAddrTxResp createSplitAddr(long fee, Map<String, Long> addrsAndWeights, String privKeyHex) throws BoxdException {
        String address = dumpAddrFromPrivKey(privKeyHex);

        SplitAddrTxReq splitAddrTxReq = new SplitAddrTxReq();
        splitAddrTxReq.setFee(100);
        splitAddrTxReq.setFrom(address);
        splitAddrTxReq.setDetail(addrsAndWeights);

        SplitAddrTxResp splitAddrTxResp = makeUnsignedSplitAddrTx(splitAddrTxReq);
        Transaction unsignedTx = splitAddrTxResp.getTransaction();

        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getVoutList());

        List<ByteString> rawMsgs = splitAddrTxResp.getRawMsgs();
        List<TxIn> inList = new ArrayList<>();
        for(int i = 0; i< unsignedTx.getVinCount(); i ++){
            TxIn txIn = unsignedTx.getVin(i);
            byte[] rawMsg = rawMsgs.get(i).toByteArray();
            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg));
            System.out.println("sig hash:" + Hex.toHexString(sigHashBytes));

            // sig
            byte[] sigBytes = account.sign(sigHashBytes, privKeyHex);
            System.out.println("sig: " + Hex.toHexString(sigBytes));

            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKey(privKeyHex));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();

            TxIn.Builder txInBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txInBuilder.build());
        }
        builder.addAllVin(inList);

        Transaction tx = builder.build();
        String txHash = sendTransaction(tx);
        splitAddrTxResp.setHash(txHash);

        return splitAddrTxResp;
    }

    @Override
    public TokenIssueTxResp tokenIssue(long fee, String owner, Token token, String privKeyHex) throws BoxdException {
        return tokenIssue(fee, owner, token.getName(), token.getSymbol(), token.getDecimal(), token.getSupply(), privKeyHex);
    }

    @Override
    public TokenIssueTxResp tokenIssue(long fee, String owner, String tokenName, String tokenSymbol, int tokenDecimals, int tokenSupply, String privKeyHex) throws BoxdException {
        String address = dumpAddrFromPrivKey(privKeyHex);

        TokenIssueTxReq tokenIssueTxReq = new TokenIssueTxReq();
        tokenIssueTxReq.setFee(100L);
        tokenIssueTxReq.setIssuee(owner);
        tokenIssueTxReq.setIssuer(address);
        Token token = new Token();
        token.setDecimal(tokenDecimals);
        token.setName(tokenName);
        token.setSupply(tokenSupply);
        token.setSymbol(tokenSymbol);
        tokenIssueTxReq.setToken(token);
        TokenIssueTxResp tokenIssueTxResp = makeUnsignedTokenIssueTx(tokenIssueTxReq);

        Transaction unsignedTx = tokenIssueTxResp.getTransaction();
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getVoutList());

        List<ByteString> rawMsgs = tokenIssueTxResp.getRawMsgs();

        List<TxIn> inList = new ArrayList<>();
        for(int i = 0; i< unsignedTx.getVinCount(); i ++){
            TxIn txIn = unsignedTx.getVin(i);
            byte[] rawMsg = rawMsgs.get(i).toByteArray();
            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg));
            // sig
            byte[] sigBytes = account.sign(sigHashBytes, privKeyHex);
            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKey(privKeyHex));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();

            TxIn.Builder txInBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txInBuilder.build());
        }
        builder.addAllVin(inList);

        Transaction tx = builder.build();
        String txHash = sendTransaction(tx);
        tokenIssueTxResp.setHash(txHash);
        tokenIssueTxResp.setTokenAddress(OutPointHashParserUtils.encodeTokenId(txHash, tokenIssueTxResp.getIssueOutIndex()));
        return tokenIssueTxResp;
    }
}