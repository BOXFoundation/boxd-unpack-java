package one.contentbox.boxd.protocol.core.response.block;

/**
 * describe: BlockHeader
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class BlockHeader {
    private int version;
    private String prevBlockHash;
    private String txsRoot;
    private long timestamp;
    private int magic;
    private String periodHash;
    private String candidatesHash;

    public BlockHeader() {
    }

    public int getVersion() {
        return this.version;
    }

    public String getPrevBlockHash() {
        return this.prevBlockHash;
    }

    public String getTxsRoot() {
        return this.txsRoot;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getMagic() {
        return this.magic;
    }

    public String getPeriodHash() {
        return this.periodHash;
    }

    public String getCandidatesHash() {
        return this.candidatesHash;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setPrevBlockHash(String prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    public void setTxsRoot(String txsRoot) {
        this.txsRoot = txsRoot;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setPeriodHash(String periodHash) {
        this.periodHash = periodHash;
    }

    public void setCandidatesHash(String candidatesHash) {
        this.candidatesHash = candidatesHash;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BlockHeader)) return false;
        final BlockHeader other = (BlockHeader) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getVersion() != other.getVersion()) return false;
        final Object this$prevBlockHash = this.getPrevBlockHash();
        final Object other$prevBlockHash = other.getPrevBlockHash();
        if (this$prevBlockHash == null ? other$prevBlockHash != null : !this$prevBlockHash.equals(other$prevBlockHash))
            return false;
        final Object this$txsRoot = this.getTxsRoot();
        final Object other$txsRoot = other.getTxsRoot();
        if (this$txsRoot == null ? other$txsRoot != null : !this$txsRoot.equals(other$txsRoot)) return false;
        if (this.getTimestamp() != other.getTimestamp()) return false;
        if (this.getMagic() != other.getMagic()) return false;
        final Object this$periodHash = this.getPeriodHash();
        final Object other$periodHash = other.getPeriodHash();
        if (this$periodHash == null ? other$periodHash != null : !this$periodHash.equals(other$periodHash))
            return false;
        final Object this$candidatesHash = this.getCandidatesHash();
        final Object other$candidatesHash = other.getCandidatesHash();
        if (this$candidatesHash == null ? other$candidatesHash != null : !this$candidatesHash.equals(other$candidatesHash))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getVersion();
        final Object $prevBlockHash = this.getPrevBlockHash();
        result = result * PRIME + ($prevBlockHash == null ? 43 : $prevBlockHash.hashCode());
        final Object $txsRoot = this.getTxsRoot();
        result = result * PRIME + ($txsRoot == null ? 43 : $txsRoot.hashCode());
        final long $timestamp = this.getTimestamp();
        result = result * PRIME + (int) ($timestamp >>> 32 ^ $timestamp);
        result = result * PRIME + this.getMagic();
        final Object $periodHash = this.getPeriodHash();
        result = result * PRIME + ($periodHash == null ? 43 : $periodHash.hashCode());
        final Object $candidatesHash = this.getCandidatesHash();
        result = result * PRIME + ($candidatesHash == null ? 43 : $candidatesHash.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BlockHeader;
    }

    public String toString() {
        return "BlockHeader(version=" + this.getVersion() + ", prevBlockHash=" + this.getPrevBlockHash() + ", txsRoot=" + this.getTxsRoot() + ", timestamp=" + this.getTimestamp() + ", magic=" + this.getMagic() + ", periodHash=" + this.getPeriodHash() + ", candidatesHash=" + this.getCandidatesHash() + ")";
    }
}
