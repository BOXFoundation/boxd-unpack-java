package one.contentbox.boxd.account;

import one.contentbox.boxd.BoxdClient;
import one.contentbox.boxd.BoxdClientImpl;
import one.contentbox.boxd.BoxdDaemon;
import one.contentbox.boxd.event.BlockListener;
import one.contentbox.boxd.proto.BlockDetail;

public class BoxdDaemonTest {

    public static void main(String args[]) {
        String host = "localhost";
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
