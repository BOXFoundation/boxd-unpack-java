package one.contentbox.boxd.event;

import lombok.Getter;
import one.contentbox.boxd.proto.BlockDetail;

import java.util.Observable;
import java.util.Observer;

public abstract class BlockListener implements Listener {

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
