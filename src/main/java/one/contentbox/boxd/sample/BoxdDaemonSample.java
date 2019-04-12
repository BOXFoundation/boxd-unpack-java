package one.contentbox.boxd.sample;

import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdDaemon;
import one.contentbox.boxd.event.BlockListener;
import one.contentbox.boxd.proto.BlockDetail;

public class BoxdDaemonSample {

    public static void main(String args[]) throws Exception{
        String host = "39.97.169.1";
        int port = 19111;

        BoxdClient client = new BoxdClientImpl(host, port);
        BoxdDaemon boxdDaemon = new BoxdDaemon(client);
        boxdDaemon.AddListener(new BlockListener() {
            @Override
            public void blockDetected(BlockDetail blockDetail) {
                System.out.println("-------------------------------------\n\n");
                System.out.println(blockDetail);
            }
        });

        boxdDaemon.start();
        boolean it = boxdDaemon.isTerminated();
        System.out.println(it);
    }

}
