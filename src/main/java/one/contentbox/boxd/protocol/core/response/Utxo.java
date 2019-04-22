package one.contentbox.boxd.protocol.core.response;

import one.contentbox.boxd.protocol.rpc.protobuf.generated.OutPoint;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOut;

/**
 * describe: Utxo
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class Utxo {

    private OutPoint outPoint;
    private TxOut txOut;
    private int blockHeight;

    public Utxo() {
    }

    public OutPoint getOutPoint() {
        return this.outPoint;
    }

    public TxOut getTxOut() {
        return this.txOut;
    }

    public int getBlockHeight() {
        return this.blockHeight;
    }

    public void setOutPoint(OutPoint outPoint) {
        this.outPoint = outPoint;
    }

    public void setTxOut(TxOut txOut) {
        this.txOut = txOut;
    }

    public void setBlockHeight(int blockHeight) {
        this.blockHeight = blockHeight;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Utxo)) return false;
        final Utxo other = (Utxo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$outPoint = this.getOutPoint();
        final Object other$outPoint = other.getOutPoint();
        if (this$outPoint == null ? other$outPoint != null : !this$outPoint.equals(other$outPoint)) return false;
        final Object this$txOut = this.getTxOut();
        final Object other$txOut = other.getTxOut();
        if (this$txOut == null ? other$txOut != null : !this$txOut.equals(other$txOut)) return false;
        if (this.getBlockHeight() != other.getBlockHeight()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $outPoint = this.getOutPoint();
        result = result * PRIME + ($outPoint == null ? 43 : $outPoint.hashCode());
        final Object $txOut = this.getTxOut();
        result = result * PRIME + ($txOut == null ? 43 : $txOut.hashCode());
        result = result * PRIME + this.getBlockHeight();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Utxo;
    }

    public String toString() {
        return "Utxo(outPoint=" + this.getOutPoint() + ", txOut=" + this.getTxOut() + ", blockHeight=" + this.getBlockHeight() + ")";
    }
}
