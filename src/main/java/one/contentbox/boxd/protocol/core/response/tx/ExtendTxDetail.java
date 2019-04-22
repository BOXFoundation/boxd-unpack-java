package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: ExtendTxDetail
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/19
 */

public class ExtendTxDetail{

    private int version;
    private long blockTime;
    private int blockHeight;
    private String status;
    private TxDetail detail;

    public ExtendTxDetail() {
    }

    public int getVersion() {
        return this.version;
    }

    public long getBlockTime() {
        return this.blockTime;
    }

    public int getBlockHeight() {
        return this.blockHeight;
    }

    public String getStatus() {
        return this.status;
    }

    public TxDetail getDetail() {
        return this.detail;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setBlockTime(long blockTime) {
        this.blockTime = blockTime;
    }

    public void setBlockHeight(int blockHeight) {
        this.blockHeight = blockHeight;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDetail(TxDetail detail) {
        this.detail = detail;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ExtendTxDetail)) return false;
        final ExtendTxDetail other = (ExtendTxDetail) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getVersion() != other.getVersion()) return false;
        if (this.getBlockTime() != other.getBlockTime()) return false;
        if (this.getBlockHeight() != other.getBlockHeight()) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !this$detail.equals(other$detail)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getVersion();
        final long $blockTime = this.getBlockTime();
        result = result * PRIME + (int) ($blockTime >>> 32 ^ $blockTime);
        result = result * PRIME + this.getBlockHeight();
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ExtendTxDetail;
    }

    public String toString() {
        return "ExtendTxDetail(version=" + this.getVersion() + ", blockTime=" + this.getBlockTime() + ", blockHeight=" + this.getBlockHeight() + ", status=" + this.getStatus() + ", detail=" + this.getDetail() + ")";
    }
}
