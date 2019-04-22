package one.contentbox.boxd.protocol.rpc;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.account.AccountManager;
import one.contentbox.boxd.account.AccountManagerImpl;
import one.contentbox.boxd.crypto.hash.Sha256Hash;
import one.contentbox.boxd.crypto.secp256k1.Secp256k1;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.request.SplitAddrTx;
import one.contentbox.boxd.protocol.core.request.TokenIssueTx;
import one.contentbox.boxd.protocol.core.request.TokenTransferTx;
import one.contentbox.boxd.protocol.core.request.UnsignedTxReq;
import one.contentbox.boxd.protocol.core.response.Block;
import one.contentbox.boxd.protocol.core.response.*;
import one.contentbox.boxd.protocol.core.response.Node;
import one.contentbox.boxd.protocol.core.response.Utxo;
import one.contentbox.boxd.protocol.core.response.block.BlockDetail;
import one.contentbox.boxd.protocol.core.response.block.BlockHeader;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedSplitAddrTx;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedTokenIssueTx;
import one.contentbox.boxd.protocol.core.script.Opcode;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.*;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.TokenTag;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;
import one.contentbox.boxd.util.AddressUtils;
import one.contentbox.boxd.util.ProtobufSerdeUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;
import java.util.*;

/**
 * Boxd client implemention
 */
@Slf4j
public class RpcBoxdClientImpl implements BoxdClient {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private String host = "localhost";
    private int port = 19111;

    ManagedChannel managedChannel = null;

    ContorlCommandGrpc.ContorlCommandBlockingStub contorlCommandBlockingStub;
    TransactionCommandGrpc.TransactionCommandBlockingStub transactionCommandBlockingStub;
    WebApiGrpc.WebApiBlockingStub webApiBlockingStub;
    FaucetGrpc.FaucetBlockingStub faucetBlockingStub;

    AccountManager account = new AccountManagerImpl();

    public RpcBoxdClientImpl(String host, int port) {
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
    }

    @Override
    public ManagedChannel getManagedChannel() {
        return managedChannel;
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
        return ProtobufSerdeUtils.protobufToJavaBean(blockResponse.getBlock(), Block.class);
    }

    @Override
    public Block getBlock(int height) throws BoxdException {
        String hash = getBlockHash(height);
        return getBlock(hash);
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
    public BlockHeader getBlockHeader(String hash) throws BoxdException {
        GetBlockHeaderResponse blockHeaderResponse = contorlCommandBlockingStub
                .getBlockHeader(GetBlockRequest.newBuilder().setBlockHash(hash).build());
        if (blockHeaderResponse.getCode() != 0) {
            throw new BoxdException(blockHeaderResponse.getCode(), blockHeaderResponse.getMessage());
        }
        return ProtobufSerdeUtils.protobufToJavaBean(blockHeaderResponse.getHeader(), BlockHeader.class);
    }

    @Override
    public BlockHeader getBlockHeader(int height) throws BoxdException {
        String hash = getBlockHash(height);
        return getBlockHeader(hash);
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
    public NetworkID getNetworkId() throws BoxdException {
        GetNetworkIDResponse networkIDResponse = contorlCommandBlockingStub
                .getNetworkID(GetNetworkIDRequest.newBuilder().build());
        return ProtobufSerdeUtils.protobufToJavaBean(networkIDResponse, NetworkID.class);
    }

    @Override
    public List<Node> getNodeInfo() throws BoxdException {
        GetNodeInfoResponse nodeInfoResponse = contorlCommandBlockingStub
                .getNodeInfo(GetNodeInfoRequest.newBuilder().build());

        List<Node> result = new ArrayList<>();
        for(int i = 0; i < nodeInfoResponse.getNodesCount(); i ++){
            result.add(ProtobufSerdeUtils.protobufToJavaBean(nodeInfoResponse.getNodes(i), Node.class));
        }
        return result;
    }

    @Override
    public Long getBalance(String addr) throws BoxdException {
        GetBalanceReq.Builder builder = GetBalanceReq.newBuilder();
        builder.addAllAddrs(Arrays.asList(new String[]{addr}));
        GetBalanceResp balanceResp = transactionCommandBlockingStub.getBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }
        if (balanceResp.getBalancesCount() != 1) {
            throw new BoxdException(balanceResp.getCode(), "GetBalance result count does not match addr count");
        }
        return balanceResp.getBalances(0);
    }

    @Override
    public Map<String, Long> getBalances(List<String> addrs) throws BoxdException {
        GetBalanceReq.Builder builder = GetBalanceReq.newBuilder();
        builder.addAllAddrs(addrs);
        GetBalanceResp balanceResp = transactionCommandBlockingStub.getBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }
        if (balanceResp.getBalancesCount() != addrs.size()) {
            throw new BoxdException(-1, "Balance size doesn't match addrs size");
        }
        Map<String, Long> result = new HashMap<>();
        for (int i = 0; i < addrs.size(); i++) {
            result.put(addrs.get(i), balanceResp.getBalances(i));
        }
        return result;
    }

    @Override
    public long getTokenbalance(String addr, String tokenHash, int tokenIndex) throws BoxdException {
        GetTokenBalanceReq.Builder builder = GetTokenBalanceReq.newBuilder();
        builder.addAllAddrs(Arrays.asList(new String[]{addr}));
        builder.setTokenHash(tokenHash);
        builder.setTokenIndex(tokenIndex);

        GetBalanceResp balanceResp = transactionCommandBlockingStub.getTokenBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }

        if (balanceResp.getBalancesCount() != 1) {
            throw new BoxdException(balanceResp.getCode(), "Balance size doesn't match addrs size");
        }
        return balanceResp.getBalances(0);
    }

    @Override
    public Map<String, Long> getTokenbalances(List<String> addrs, String tokenHash, int tokenIndex) throws BoxdException {
        GetTokenBalanceReq.Builder builder = GetTokenBalanceReq.newBuilder();
        builder.addAllAddrs(addrs);
        builder.setTokenHash(tokenHash);
        builder.setTokenIndex(tokenIndex);

        GetBalanceResp balanceResp = transactionCommandBlockingStub.getTokenBalance(builder.build());
        if (balanceResp.getCode() != 0) {
            throw new BoxdException(balanceResp.getCode(), balanceResp.getMessage());
        }

        if (balanceResp.getBalancesCount() != addrs.size()) {
            throw new BoxdException(-1, "Balance size doesn't match addrs size");
        }
        Map<String, Long> result = new HashMap<>();
        for (int i = 0; i < addrs.size(); i++) {
            result.put(addrs.get(i), balanceResp.getBalances(i));
        }
        return result;
    }

    @Override
    public List<Utxo> fetchUtxos(String address, long amount) throws BoxdException {
        FetchUtxosReq.Builder builder = FetchUtxosReq.newBuilder();
        builder.setAddr(address)
                .setAmount(amount);

        FetchUtxosResp fetchUtxosResp = transactionCommandBlockingStub
                .fetchUtxos(builder.build());
        if (fetchUtxosResp.getCode() != 0) {
            throw new BoxdException(fetchUtxosResp.getCode(), fetchUtxosResp.getMessage());
        }

        List<Utxo> result = new ArrayList<>();
        for(one.contentbox.boxd.protocol.rpc.protobuf.generated.Utxo utxo: fetchUtxosResp.getUtxosList()){
            Utxo tmpUtxo = new Utxo();
            tmpUtxo.setTxOut(utxo.getTxOut());
            tmpUtxo.setOutPoint(utxo.getOutPoint());
            tmpUtxo.setBlockHeight(utxo.getBlockHeight());
            result.add(tmpUtxo);
        }
        return result;
    }

    @Override
    public List<Utxo> fetchTokenUtxos(String address, long amount, String tokenHash, int tokenIndex)
            throws BoxdException {
        FetchUtxosReq.Builder builder = FetchUtxosReq.newBuilder();
        builder.setAddr(address)
                .setAmount(amount)
                .setTokenHash(tokenHash)
                .setTokenIndex(tokenIndex);

        FetchUtxosResp fetchUtxosResp = transactionCommandBlockingStub
                .fetchUtxos(builder.build());
        if (fetchUtxosResp.getCode() != 0) {
            throw new BoxdException(fetchUtxosResp.getCode(), fetchUtxosResp.getMessage());
        }

        List<Utxo> result = new ArrayList<>();
        for (int i = 0; i < fetchUtxosResp.getUtxosCount(); i ++){
            result.add(ProtobufSerdeUtils.protobufToJavaBean(fetchUtxosResp.getUtxos(i), Utxo.class));
        }
        return result;
    }

    @Override
    public UnsignedTx makeUnsignedTx(UnsignedTxReq unsignedTxReq) throws BoxdException {

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

        return new UnsignedTx(makeTxResp);
    }

    @Override
    public UnsignedTx makeUnsignedTx(String from, Map<String, Long> to, long fee) throws BoxdException {
        UnsignedTxReq unsignedTxReq = new UnsignedTxReq();
        unsignedTxReq.setFee(fee);
        unsignedTxReq.setFrom(from);
        unsignedTxReq.setTo(to);

        return makeUnsignedTx(unsignedTxReq);
    }


    @Override
    public UnsignedSplitAddrTx makeUnsignedSplitAddrTx(SplitAddrTx splitAddrTxReq) throws BoxdException {
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
        return new UnsignedSplitAddrTx(splitAddrTxResp);
    }

    @Override
    public UnsignedTokenIssueTx makeUnsignedTokenIssueTx(TokenIssueTx tokenIssueTxReq) throws BoxdException {
        MakeTokenIssueTxReq.Builder builder = MakeTokenIssueTxReq.newBuilder();
        builder.setFee(tokenIssueTxReq.getFee());
        builder.setIssuee(tokenIssueTxReq.getIssuee());
        builder.setIssuer(tokenIssueTxReq.getIssuer());

        one.contentbox.boxd.protocol.core.response.TokenTag token = tokenIssueTxReq.getToken();
        builder.setTag(TokenTag.newBuilder()
                .setName(token.getName())
                .setDecimal(token.getDecimal())
                .setSupply(token.getSupply())
                .setSymbol(token.getSymbol()).build());

        MakeTokenIssueTxResp tokenIssueTxResp = transactionCommandBlockingStub.makeUnsignedTokenIssueTx(builder.build());
        if (tokenIssueTxResp.getCode() != 0) {
            throw new BoxdException(tokenIssueTxResp.getCode(), tokenIssueTxResp.getMessage());
        }
        return new UnsignedTokenIssueTx(tokenIssueTxResp);
    }

    @Override
    public UnsignedTx makeUnsignedTokenTransferTx(TokenTransferTx tokenTransferTxReq) throws BoxdException {
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
        return new UnsignedTx(makeTxResp);
    }

    @Override
    public String sendRawTransaction(String rawTransaction) throws BoxdException {
        return null;
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
        }

        return ProtobufSerdeUtils.protobufToJavaBean(viewBlockDetailResp.getDetail(), BlockDetail.class);
    }

    @Override
    public ExtendTxDetail viewTxDetail(String hash) throws BoxdException {
        ViewTxDetailResp viewTxDetailResp = webApiBlockingStub
                .viewTxDetail(ViewTxDetailReq.newBuilder().setHash(hash).build());
        if (viewTxDetailResp.getCode() != 0) {
            throw new BoxdException(viewTxDetailResp.getCode(), viewTxDetailResp.getMessage());
        }
        return ProtobufSerdeUtils.protobufToJavaBean(viewTxDetailResp, ExtendTxDetail.class);
    }

    @Override
    public UnsignedTx createRawTransaction(String address, Map<String, Long> to, long fee, List<Utxo> utxoList)
            throws BoxdException {
        long total = to.values().stream().mapToLong(Long::longValue).sum() + fee;

        long balanceOnChain = 0L;
        for (Utxo utxo : utxoList) {
            balanceOnChain += utxo.getTxOut().getValue();
        }

        // Check real balance again
        if (utxoList.size() < 1) {
            throw new BoxdException(-1, "Parse utxo err");
        }

        if (balanceOnChain < total) {
            throw new BoxdException(-1, "The Balance of " + address + " is too low");
        }

        // create transaction
        Transaction.Builder txBuilder = Transaction.newBuilder();

        // add vin
        List<TxIn> vinsList = new ArrayList<>();
        for (Utxo utxo : utxoList) {

            OutPoint.Builder outPoint = OutPoint.newBuilder();
            outPoint.setHash(utxo.getOutPoint().getHash());
            outPoint.setIndex(utxo.getOutPoint().getIndex());

            TxIn tx = TxIn.newBuilder()
                    .setPrevOutPoint(outPoint.build())
                    .setScriptSig(utxo.getTxOut().getScriptPubKey()).build();
            vinsList.add(tx);
        }

        // add vout
        List<TxOut> vouts = new ArrayList<>();
        for (String addr : to.keySet()) {

            byte[] tmp = AddressUtils.getPubKeyHashFromAddr(addr);

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
        if (balanceOnChain > total) {
            long charge = balanceOnChain - total;

            byte[] tmp = AddressUtils.getPubKeyHashFromAddr(address);

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


        return new UnsignedTx(unsignedTx, null);
    }

    @Override
    public String signRawTransaction(String unsignedRawTx, String privateKey) throws BoxdException {
        return null;
    }

    @Override
    public Transaction signTransaction(UnsignedTx unsignedTx, String privateKey) throws BoxdException {
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getTx().getVoutList());

        List<TxIn> inList = new ArrayList<>();
        for (int i = 0; i < unsignedTx.getTx().getVinCount(); i++) {
            one.contentbox.boxd.protocol.rpc.protobuf.generated.TxIn txIn = unsignedTx.getTx().getVin(i);

            byte[] rawMsg = null;
            if(unsignedTx.getRawMsgs() == null) {
                byte[] scriptPubBytes = txIn.getScriptSig().toByteArray();
                rawMsg = calcTxHashForSig(scriptPubBytes, unsignedTx.getTx(), i);
            }else {
                rawMsg = unsignedTx.getRawMsgs().get(i).toByteArray();
            }

            if( rawMsg == null) {
                throw new BoxdException(-1, "Raw msg can't be empty");
            }

            // sig hash
            byte[] sigHashBytes = Sha256Hash.hashTwice(rawMsg);
            if (sigHashBytes == null){
                throw new BoxdException(-1, "SigHash can't be empty");
            }

            // sig
            byte[] sigBytes = Secp256k1.sign(sigHashBytes, privateKey);
            if(sigBytes == null) {
                throw new BoxdException(-1, "Sign sig hash error");
            }

            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKeyFromPrivKey(privateKey));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();

            TxIn.Builder txInBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash())
                            .setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txInBuilder.build());
        }
        builder.addAllVin(inList);

        Transaction tx = builder.build();
        return tx;
    }


    private byte[] calcTxHashForSig(byte[] scriptPubKey, Transaction transaction, int txInIdx) {
        // CalcTxHashForSig
        Transaction.Builder builder = Transaction.newBuilder();
        List<TxIn> vins = new ArrayList<>();
        for (int i = 0; i < transaction.getVinCount(); i++) {
            TxIn txIn = transaction.getVin(i);

            TxIn.Builder txInBuilder = TxIn.newBuilder();
            txInBuilder.setPrevOutPoint(OutPoint.newBuilder()
                    .setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());

            if (i != txInIdx) {
            } else {
                txInBuilder.setScriptSig(ByteString.copyFrom(scriptPubKey));
            }

            vins.add(txInBuilder.build());
        }
        builder.addAllVin(vins);
        builder.addAllVout(transaction.getVoutList());
        Transaction newTx = builder.build();

        // CalcTxHash
        byte[] data = newTx.toByteArray();

        return data;
    }

}