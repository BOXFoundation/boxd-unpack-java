package one.contentbox.boxd.account;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdException;
import one.contentbox.boxd.proto.OutPoint;
import one.contentbox.boxd.proto.Transaction;
import one.contentbox.boxd.proto.TxIn;
import one.contentbox.boxd.request.UnsignedTxReq;
import one.contentbox.boxd.response.BalanceResp;
import one.contentbox.boxd.response.TransactionResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import one.contentbox.boxd.script.Opcode;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxdClientOnlineSignTest {

    public static void main(String[] args) throws BoxdException, Exception{
        String host = "localhost";
        int port = 19111;

        // create new account
        Account account = new DefaultAccount();
        ECKey ecKey = new ECKey();
        String privKeyHex =  ecKey.getPrivateKeyAsHex();
        String address = account.dumpAddrFromPrivKey(privKeyHex);
        System.out.println("address:" + address);

        long transferAmount = 100L;
        long fee = 100L;
        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        targets.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        targets.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);

        BoxdClient client = new BoxdClientImpl(host, port);

        // get test box by faucet
        long amount = 1200;
        String txHash =  client.faucet(address, amount);
        System.out.println("faucet tx Hash:" + txHash);
        Thread.sleep(5000);

        // getBalance
        long balance = 0;
        BalanceResp balanceResp = client.getBalance(new ArrayList<String>(){{add(address);}});
        if(balanceResp == null || balanceResp.getCount() != 1){
            throw new BoxdException(-1, "Get balance err");
        }
        balance = balanceResp.getBalances().get(0).longValue();
        if(balance <= 0) {
            throw new BoxdException(-1, "Balance < 0");
        }
        System.out.println(balance);

        // create transaction
        UnsignedTxReq unsignedTxReq = new UnsignedTxReq();
        unsignedTxReq.setFee(fee);
        unsignedTxReq.setFrom(address);
        unsignedTxReq.setTo(targets);
        TransactionResp transactionResp = client.makeUnsignedTx(unsignedTxReq);
        System.out.println(transactionResp.toString());

        // calcTxHashForSig transaction
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(transactionResp.getTx().getVoutList());

        List<ByteString> rawMsgs = transactionResp.getRawMsgs();
        List<TxIn> inList = new ArrayList<>();
        for(int i = 0; i< transactionResp.getCount(); i ++){
            TxIn txIn = transactionResp.getTx().getVin(i);
            ByteString rawMsg = rawMsgs.get(i);

            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg.toByteArray()));
            System.out.println("sig hash: " + Hex.toHexString(sigHashBytes));

            // sig
            byte[] sigBytes = account.sign(sigHashBytes, privKeyHex);
            System.out.println("sig: " + Hex.toHexString(sigBytes));

            // script sig
            Opcode opcode = new Opcode();
            opcode.addOperand(sigBytes).addOperand(account.dumpPubKey(privKeyHex));
            byte[] scriptSig = opcode.getResult();
            opcode.reset();
            System.out.println("script sig: " + Hex.toHexString(scriptSig));

            TxIn.Builder txBuilder = TxIn.newBuilder().setScriptSig(ByteString.copyFrom(scriptSig))
                    .setPrevOutPoint(OutPoint.newBuilder().setHash(txIn.getPrevOutPoint().getHash()).setIndex(txIn.getPrevOutPoint().getIndex()).build());
            inList.add(txBuilder.build());
        }
        builder.addAllVin(inList);
        Transaction tx = builder.build();
        System.out.println("tx: " + Hex.toHexString(tx.toByteArray()));

        // send transaction
        String hash = client.sendTransaction(tx);
        System.out.println("hash: " + hash);

        Thread.sleep(1000);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(hash);
        System.out.println("height: " + viewTxDetailResp.getBlockHeight());
        System.out.println("timestamp: " + viewTxDetailResp.getBlockTime());
        System.out.println("tx detail: " + viewTxDetailResp.getTxDetail());
    }
}
