package one.contentbox.boxd.samples;

import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.core.response.Utxo;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * describe: Test
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/19
 */
public class CreateTransactionSample {

    String host = "39.97.169.1";
    int port = 19111;
    BoxdClient client = new RpcBoxdClientImpl(host, port);

    static long fee = 100L;
    static Map<String, Long> to = new HashMap<>();
    static {
        to.put("b1Tvej4G8Lma86pgYpWqv4fUFJcEyDdeGst",100L);
        to.put("b1USvtdkLrXXtzTfz8R5tpicJYobDbwuqeT",200L);
    }

    static String address = "b1fc1Vzz73WvBtzNQNbBSrxNCUC1Zrbnq4m";
    static String privKey = "29fbf01166fc31c941cadc1659a5f684f81c22c1113e5aa5b0af28b7dd453269";

    public UnsignedTx  createTx(String addr, Map<String, Long> to, long fee) throws Exception {
        long amount = to.values().stream().mapToLong(Long::longValue).sum();
        List<Utxo> utxos = client.fetchUtxos(addr, amount);
        UnsignedTx unsignedTx = client.createRawTransaction(addr, to, fee, utxos);
        return unsignedTx;
    }


    public static void main(String args[])  throws Exception{
        CreateTransactionSample createTransactionSample = new CreateTransactionSample();
        UnsignedTx unsignedTx = createTransactionSample.createTx(address, to, fee);
    }
}
