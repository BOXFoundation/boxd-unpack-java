package one.contentbox.boxd;

import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.event.BlockListener;
import one.contentbox.boxd.event.Listener;
import one.contentbox.boxd.proto.BlockDetail;
import one.contentbox.boxd.proto.ListenBlocksReq;
import one.contentbox.boxd.rpc.WebApiGrpc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Boxd Daemon class will listen the new block info from rpc node
 */

@Slf4j
public class BoxdDaemon extends  Thread{

    ManagedChannel managedChannel = null;

    WebApiGrpc.WebApiBlockingStub webApiBlockingStub;

    private List<Listener>  listeners = new ArrayList<>();

    /**
     * Init boxdDaemon
     *
     * @param boxdClient
     */
    public BoxdDaemon(BoxdClient boxdClient) throws BoxdException{
        this.managedChannel = boxdClient.getManagedChannel();
        if (this.managedChannel.isShutdown()){
            log.error("Rpc connect is already shutdown");
            throw new BoxdException(-1, "Rpc connect is already shutdown");
        }
        this.webApiBlockingStub = WebApiGrpc.newBlockingStub(this.managedChannel).withWaitForReady();
    }

    /**
     * Get all listeners
     *
     * @return
     */
    public List<Listener> getListeners() {
        return this.listeners;
    }

    /**
     * Get all listener's count
     *
     * @return
     */
    public int getListenerCount() {
        return this.listeners.size();
    }

    /**
     * Add Listener class to the listener group, Now it only supports BlockListener
     *
     * @param listener
     */
    public void AddListener(Listener listener){
        this.listeners.add(listener);
    }


    /**
     * Remove Listener class from the listener group
     *
     * @param listener
     */
    public void deleteListener(Listener listener) {
        if(listeners.contains(listener)){
            listeners.remove(listener);
        }
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
           for(Listener listener: this.listeners){
               if(listener instanceof BlockListener) {
                   BlockListener blockListener = (BlockListener) listener;
                   blockListener.blockDetected(blockDetails.next());
               }
           }
        }
    }

    /**
     * Get the result if the rpc connection is shutdown
     *
     * @return
     */
    public boolean isShutdown() {
        return this.managedChannel.isShutdown();
    }

    /**
     * Get the result if the rpc connection is terminated or not
     *
     * @return
     */
    public boolean isTerminated() {
        return this.managedChannel.isTerminated();
    }

    /**
     * Shutdown the rpc connection
     */
    public void  shutdown() {
        this.managedChannel.shutdown();
    }

    /**
     * Shutdown the rpc connection now
     */
    public void shutdownNow() {
        this.managedChannel.shutdownNow();
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
