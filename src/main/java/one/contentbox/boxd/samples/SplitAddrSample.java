package one.contentbox.boxd.samples;

import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.request.SplitAddrTx;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.core.response.tx.UnsignedSplitAddrTx;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.HashMap;
import java.util.Map;

public class SplitAddrSample {
    public static void main(String[] args) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new RpcBoxdClientImpl(host, port);

        long fee = 100L;
        Map<String, Long> splitAddrInfo =  new HashMap<>();
        splitAddrInfo.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 4L);
        splitAddrInfo.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 6L);

        String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
        String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";


        SplitAddrTx splitAddrTxReq = new SplitAddrTx();
        splitAddrTxReq.setFee(fee);
        splitAddrTxReq.setFrom(address);
        splitAddrTxReq.setDetail(splitAddrInfo);
        UnsignedSplitAddrTx unsignedSplitAddrTx = client.makeUnsignedSplitAddrTx(splitAddrTxReq);
        Transaction transaction = client.signTransaction(unsignedSplitAddrTx, privKey);
        String hash  = client.sendTransaction(transaction);

        Thread.sleep(2000);


        Map<String, Long> to =  new HashMap<>();
        to.put(unsignedSplitAddrTx.getSplitAddr(), 1000L);
        UnsignedTx unsignedTx = client.makeUnsignedTx(address, to,  fee);

        Transaction signedTx = client.signTransaction(unsignedTx, privKey);
        String hash2 = client.sendTransaction(signedTx);

        Thread.sleep(2000);

        ExtendTxDetail extendTxDetail = client.viewTxDetail(hash2);
        System.out.println(SampleHelper.formatJavaObject(extendTxDetail));
    }
}
