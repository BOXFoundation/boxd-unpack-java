package one.contentbox.boxd.samples;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.core.response.tx.ExtendTxDetail;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;


/**
 * describe: SampleUtils
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/17
 */
public class SampleHelper {

    public static BoxdClient getBoxdClient() {
        String host = "39.97.169.1";
        int port = 19111;
        BoxdClient client = new RpcBoxdClientImpl(host, port);
        return client;
    }

    public static String formatJavaObject(Object object){
        return JSON.toJSONString(object, true);
    }

    public static String formatProtobufObject(MessageOrBuilder messageOrBuilder) throws BoxdException{
        try {
            return JsonFormat.printer().print(messageOrBuilder);
        }catch (InvalidProtocolBufferException e){
            throw new BoxdException(-1, e.getMessage());
        }
    }

    public static void viewTx(String hash, BoxdClient client) throws Exception {
        Thread.sleep(1000);
        ExtendTxDetail txDetail = client.viewTxDetail(hash, false);
        System.out.println(txDetail);
    }

}
