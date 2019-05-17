package one.contentbox.boxd.samples;

import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;
import org.bouncycastle.util.encoders.Hex;

import java.util.HashMap;
import java.util.Map;

public class TransferSample {

    static String host = "39.97.169.1";
    static int port = 19111;
    static BoxdClient client = new RpcBoxdClientImpl(host, port);

    static long fee = 100L;
    static Map<String, Long> to =  new HashMap<>();
    static {
        to.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst", 100L);
        to.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT", 200L);
        to.put("b1dSx5FTXEpzB7hWZAydY5N4A5PtFJb57V1", 300L);
        to.put("b1Vc6vBWzjSp71c3c49hx3pENPL1TwU1Exy", 400L);
    }

    static String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
    static String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";


    public static String createRawTx(String address, Long fee, Map<String, Long> to, String privKey) throws Exception {
        UnsignedTx unsignedTx = client.makeUnsignedTx(address, to, fee);
        System.out.println(unsignedTx);

        Transaction transaction = client.signTransaction(unsignedTx, privKey);
        System.out.println(transaction);

        String rawTx = Hex.toHexString(transaction.toByteArray());
        return rawTx;
    }

    public static String sendRawTransaction(String rawTx) throws Exception {
        return client.sendRawTransaction(rawTx);
    }


    public static String transfer(String address, Long fee, Map<String, Long> to, String privKey) throws Exception {
        UnsignedTx unsignedTx = client.makeUnsignedTx(address, to, fee);
        System.out.println(unsignedTx);

        Transaction transaction = client.signTransaction(unsignedTx, privKey);
        System.out.println(transaction);

        String hash  = client.sendTransaction(transaction);
        return hash;
    }


    public static void main(String args[]) throws Exception{
        String hash = transfer(address, fee, to, privKey);
        SampleHelper.viewTx(hash, client);

        String rawTx = createRawTx(address, fee, to, privKey);
        hash = sendRawTransaction(rawTx);
        SampleHelper.viewTx(hash, client);

    }
}
