package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: TxIn
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TxIn {

    private OutPoint prevOutPoint;
    private String scriptSig;
    private long sequence;

    public TxIn() {
    }

    public OutPoint getPrevOutPoint() {
        return this.prevOutPoint;
    }

    public String getScriptSig() {
        return this.scriptSig;
    }

    public long getSequence() {
        return this.sequence;
    }

    public void setPrevOutPoint(OutPoint prevOutPoint) {
        this.prevOutPoint = prevOutPoint;
    }

    public void setScriptSig(String scriptSig) {
        this.scriptSig = scriptSig;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TxIn)) return false;
        final TxIn other = (TxIn) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$prevOutPoint = this.getPrevOutPoint();
        final Object other$prevOutPoint = other.getPrevOutPoint();
        if (this$prevOutPoint == null ? other$prevOutPoint != null : !this$prevOutPoint.equals(other$prevOutPoint))
            return false;
        final Object this$scriptSig = this.getScriptSig();
        final Object other$scriptSig = other.getScriptSig();
        if (this$scriptSig == null ? other$scriptSig != null : !this$scriptSig.equals(other$scriptSig)) return false;
        if (this.getSequence() != other.getSequence()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $prevOutPoint = this.getPrevOutPoint();
        result = result * PRIME + ($prevOutPoint == null ? 43 : $prevOutPoint.hashCode());
        final Object $scriptSig = this.getScriptSig();
        result = result * PRIME + ($scriptSig == null ? 43 : $scriptSig.hashCode());
        final long $sequence = this.getSequence();
        result = result * PRIME + (int) ($sequence >>> 32 ^ $sequence);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TxIn;
    }

    public String toString() {
        return "TxIn(prevOutPoint=" + this.getPrevOutPoint() + ", scriptSig=" + this.getScriptSig() + ", sequence=" + this.getSequence() + ")";
    }
}
