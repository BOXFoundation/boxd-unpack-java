package one.contentbox.boxd.protocol;

import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.exception.BoxdException;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.*;
import one.contentbox.boxd.protocol.subscribe.BlockListener;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Boxd Daemon class will listen the new block info from rpc node
 */

@Slf4j
public class BoxdDaemon extends  Thread{

    ManagedChannel managedChannel = null;

    WebApiGrpc.WebApiBlockingStub webApiBlockingStub;

    private BlockListener blockListener;

    private String host;
    private int port;

    /**
     * Init boxdDaemon
     */
    public BoxdDaemon(String host, int port) {
        if (host != null && !"".equalsIgnoreCase(host)) {
            this.host = host;
        }
        this.port = port;

        this.managedChannel = ManagedChannelBuilder
            .forAddress(this.host, this.port)
            .usePlaintext()
                .enableRetry()
                .maxRetryAttempts(1)
                .build();
        this.webApiBlockingStub = WebApiGrpc.newBlockingStub(this.managedChannel).withWaitForReady();
    }

    /**
     * Add Listener class to the listener group, Now it only supports BlockListener
     *
     * @param listener
     */
    public void setBlockListener(BlockListener listener){
        this.blockListener = listener;
    }

    @Override
    public void run() {
        listenAndReadNewBlock();
    }

    /**
     * Listen new blocks
     */
    private void listenAndReadNewBlock(){
        Iterator<BlockDetail> blockDetails = this.webApiBlockingStub
                .listenAndReadNewBlock(ListenBlocksReq.newBuilder().build());
        while (blockDetails.hasNext()){
            try {
                blockListener.blockDetected(blockDetails.next());
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    /**
     * Await termination
     *
     * @param timeout
     * @param unit
     * @return
     * @throws InterruptedException
     */
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.managedChannel.awaitTermination(timeout, unit);
    }

    /**
     * Get rpc connection state
     *
     * @param requestConnection
     * @return
     */
    public ConnectivityState getState(boolean requestConnection) {
        return this.managedChannel.getState(requestConnection);
    }

    /**
     * Notify when rpc connection state changed
     *
     * @param connectivityState
     * @param runnable
     */
    public void notifyWhenStateChanged(ConnectivityState connectivityState, Runnable runnable) {
        this.managedChannel.notifyWhenStateChanged(connectivityState, runnable);
    }
}
