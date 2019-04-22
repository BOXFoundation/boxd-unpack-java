package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: TxInDetail
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TxInDetail {

    private TxOutDetail prevOutDetail;
    private String scriptSig;
    private int sequence;
    private String prevOutPoint;

    public TxInDetail() {
    }

    public TxOutDetail getPrevOutDetail() {
        return this.prevOutDetail;
    }

    public String getScriptSig() {
        return this.scriptSig;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getPrevOutPoint() {
        return this.prevOutPoint;
    }

    public void setPrevOutDetail(TxOutDetail prevOutDetail) {
        this.prevOutDetail = prevOutDetail;
    }

    public void setScriptSig(String scriptSig) {
        this.scriptSig = scriptSig;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setPrevOutPoint(String prevOutPoint) {
        this.prevOutPoint = prevOutPoint;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TxInDetail)) return false;
        final TxInDetail other = (TxInDetail) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$prevOutDetail = this.getPrevOutDetail();
        final Object other$prevOutDetail = other.getPrevOutDetail();
        if (this$prevOutDetail == null ? other$prevOutDetail != null : !this$prevOutDetail.equals(other$prevOutDetail))
            return false;
        final Object this$scriptSig = this.getScriptSig();
        final Object other$scriptSig = other.getScriptSig();
        if (this$scriptSig == null ? other$scriptSig != null : !this$scriptSig.equals(other$scriptSig)) return false;
        if (this.getSequence() != other.getSequence()) return false;
        final Object this$prevOutPoint = this.getPrevOutPoint();
        final Object other$prevOutPoint = other.getPrevOutPoint();
        if (this$prevOutPoint == null ? other$prevOutPoint != null : !this$prevOutPoint.equals(other$prevOutPoint))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $prevOutDetail = this.getPrevOutDetail();
        result = result * PRIME + ($prevOutDetail == null ? 43 : $prevOutDetail.hashCode());
        final Object $scriptSig = this.getScriptSig();
        result = result * PRIME + ($scriptSig == null ? 43 : $scriptSig.hashCode());
        result = result * PRIME + this.getSequence();
        final Object $prevOutPoint = this.getPrevOutPoint();
        result = result * PRIME + ($prevOutPoint == null ? 43 : $prevOutPoint.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TxInDetail;
    }

    public String toString() {
        return "TxInDetail(prevOutDetail=" + this.getPrevOutDetail() + ", scriptSig=" + this.getScriptSig() + ", sequence=" + this.getSequence() + ", prevOutPoint=" + this.getPrevOutPoint() + ")";
    }
}
