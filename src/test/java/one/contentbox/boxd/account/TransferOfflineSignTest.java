package one.contentbox.boxd.account;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdException;
import one.contentbox.boxd.proto.*;
import one.contentbox.boxd.response.BalanceResp;
import one.contentbox.boxd.response.FetchUtxosResp;
import one.contentbox.boxd.response.ViewTxDetailResp;
import one.contentbox.boxd.script.Opcode;
import one.contentbox.boxd.util.AddressUtils;
import one.contentbox.boxd.util.TxUtils;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bouncycastle.util.encoders.Hex;

import java.util.*;

public class TransferOfflineSignTest {

    public static void main(String[] args) throws BoxdException, Exception{

        String host = "39.97.169.1";
        int port = 19111;
        host = "localhost";
        port = 19111;


        // create new account
        Account account = new DefaultAccount();
        ECKey ecKey = new ECKey();
        String privKeyHex =  ecKey.getPrivateKeyAsHex();
        String address = account.dumpAddrFromPrivKey(privKeyHex);
        System.out.println("address:" + address);

        Map<String, Long> targets =  new HashMap<>();
        targets.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        targets.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        targets.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        targets.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);


        BoxdClient client = new BoxdClientImpl(host, port);

//        // get test box by faucet
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


        // fetch Utxo
        List<Utxo> utxoList = new ArrayList<>();

        FetchUtxosResp fetchUtxosResp  =  client.fetchUtxos(address, 1100, null, 0);
        if(fetchUtxosResp != null){
            if(fetchUtxosResp.getCount() < 1){
               throw new BoxdException(-1, "No utxo found");
            }
            List<Utxo> utxos = fetchUtxosResp.getUtxos();
            for(Utxo utxo: utxos) {
                utxoList.add(utxo);
            }
        }
        if(utxoList.size() < 1){
            throw new BoxdException(-1, "low balance");
        }
        System.out.println("utxo:" + utxoList.size());


        // create transaction
        Transaction.Builder txBuilder = Transaction.newBuilder();
        List<TxIn> vinsList = new ArrayList<>();


        for(Utxo utxo: utxoList){
            TxIn tx = TxIn.newBuilder()
                    .setPrevOutPoint(utxo.getOutPoint())
                    .setScriptSig(utxo.getTxOut().getScriptPubKey()).build();
            vinsList.add(tx);
        }
        List<TxOut> vouts = new ArrayList<>();
        for(String addr: targets.keySet()){

            byte[] tmp = AddressUtils.getPkh(addr);

            Opcode opcode = new Opcode();
            opcode.adddOpCode((byte)Opcode.OPDUP).adddOpCode((byte) Opcode.OPHASH160).addOperand(tmp)
                    .adddOpCode((byte) Opcode.OPEQUALVERIFY).adddOpCode((byte) Opcode.OPCHECKSIG);
            byte[] addrScript = opcode.getResult();
            opcode.reset();

            TxOut txOut = TxOut.newBuilder()
                    .setScriptPubKey(ByteString.copyFrom(addrScript))
                    .setValue(targets.get(addr)).build();

            vouts.add(txOut);
        }
        txBuilder.addAllVin(vinsList);
        txBuilder.addAllVout(vouts);
        Transaction unsignedTx = txBuilder.build();
        System.out.println("rawt x:" + unsignedTx);
        System.out.println("create raw tx: " + Hex.toHexString(unsignedTx.toByteArray()));


        // calcTxHashForSig
        Transaction.Builder builder = Transaction.newBuilder();
        builder.addAllVout(unsignedTx.getVoutList());

        List<TxIn> inList = new ArrayList<>();
        for(int i = 0; i< unsignedTx.getVinCount(); i ++){
            TxIn txIn = unsignedTx.getVin(i);

            byte[] scriptPubBytes  =  txIn.getScriptSig().toByteArray();

            byte[] rawMsg = TxUtils.calcTxHashForSig(scriptPubBytes, unsignedTx, i);
            System.out.println("rawMsg:" + Hex.toHexString(rawMsg));

            // sig hash
            byte[] sigHashBytes = Sha256Hash.hash(Sha256Hash.hash(rawMsg));
            System.out.println("sig hash:" +Hex.toHexString(sigHashBytes));

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
        System.out.println("script sig: " + Hex.toHexString(tx.toByteArray()));

        String hash = client.sendTransaction(tx);
        System.out.println("hash:" +hash);


        Thread.sleep(1000);

        ViewTxDetailResp viewTxDetailResp = client.viewTxDetail(hash);
        System.out.println("height: " + viewTxDetailResp.getBlockHeight());
        System.out.println("timestamp: " + viewTxDetailResp.getBlockTime());
        System.out.println("tx detail: " + viewTxDetailResp.getTxDetail());
    }

}