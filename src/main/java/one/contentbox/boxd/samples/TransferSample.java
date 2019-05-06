package one.contentbox.boxd.samples;

import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.HashMap;
import java.util.Map;

public class TransferSample {



    public static void main(String args[]) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new RpcBoxdClientImpl(host, port);

        long fee = 100L;
        Map<String, Long> to =  new HashMap<>();
        to.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        to.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        to.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        to.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);

        String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";

        UnsignedTx unsignedTx = client.makeUnsignedTx(address, to, fee);
        System.out.println(unsignedTx);

        Transaction transaction = client.signTransaction(unsignedTx, privKey);
        System.out.println(transaction);

        String hash  = client.sendTransaction(transaction);
        System.out.println(hash);

        Thread.sleep(2000);

        ExtendTxDetail viewTxDetailResp = client.viewTxDetail(hash, false);
        System.out.println(SampleHelper.formatJavaObject(viewTxDetailResp));
    }
}
