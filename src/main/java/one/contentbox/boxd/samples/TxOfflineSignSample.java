package one.contentbox.boxd.samples;

import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.core.response.Utxo;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxOfflineSignSample {

    public static void main(String[] args) throws Exception{

        BoxdClient client = SampleHelper.getBoxdClient();

        // param
        String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";
        Map<String, Long> to =  new HashMap<>();
        to.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        to.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        to.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        to.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 600L);
        long fee = 100;
        long amount = to.values().stream().mapToLong(Long::longValue).sum();


        // getBalance
        long balance = client.getBalance(address);
        if(balance <= 1000) {
            throw new BoxdException(-1, "Balance < 0");
        }

        // fetch utxo
        List<Utxo> utxos = client.fetchUtxos(address, amount);

        // create transaction
        UnsignedTx unsignedTx = client.createRawTransaction(address, to, fee, utxos);

        // sign transaction
        Transaction transaction  = client.signTransaction(unsignedTx, privKey);

        // send transaction
        String hash = client.sendTransaction(transaction);

        Thread.sleep(1000);

        // check transaction on chain
        ExtendTxDetail extendTxDetail = client.viewTxDetail(hash, false);
        System.out.println(SampleHelper.formatJavaObject(extendTxDetail));
    }

}