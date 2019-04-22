package one.contentbox.boxd.protocol.subscribe;

import lombok.Getter;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail;

import java.util.Observable;
import java.util.Observer;

public abstract class BlockListener {

    @Getter
    private Observer observer;

    public BlockListener() {
        observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                BlockDetail blockDetail = (BlockDetail) arg;
                blockDetected(blockDetail);
            }
        };
    }

    public abstract void blockDetected(BlockDetail blockDetail);
}
