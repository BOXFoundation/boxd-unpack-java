package one.contentbox.boxd.samples;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.BoxdClient;
import one.contentbox.boxd.protocol.BoxdDaemon;
import one.contentbox.boxd.protocol.rpc.RpcBoxdClientImpl;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail;
import one.contentbox.boxd.protocol.subscribe.BlockListener;
import one.contentbox.boxd.util.ProtobufSerdeUtils;

@Slf4j
public class BoxdDaemonSample {

    public static void main(String args[]) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;

        BoxdDaemon boxdDaemon = new BoxdDaemon(host, port);
        boxdDaemon.setBlockListener(new BlockListener() {
            @Override
            public void blockDetected(BlockDetail blockDetail) {
                try {
                    one.contentbox.boxd.protocol.core.response.block.BlockDetail bd = ProtobufSerdeUtils
                            .protobufToJavaBean(blockDetail, one.contentbox.boxd.protocol.core.response.block.BlockDetail.class);

                    System.out.println(JSON.toJSONString(bd, true));
                }catch (BoxdException e){
                    e.printStackTrace();
                }
            }
        });

        boxdDaemon.start();
    }
}
