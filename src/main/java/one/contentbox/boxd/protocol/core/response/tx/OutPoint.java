package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: OutPoint
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class OutPoint {

    private String hash;
    private long index;

    public OutPoint() {
    }

    public String getHash() {
        return this.hash;
    }

    public long getIndex() {
        return this.index;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OutPoint)) return false;
        final OutPoint other = (OutPoint) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hash = this.getHash();
        final Object other$hash = other.getHash();
        if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) return false;
        if (this.getIndex() != other.getIndex()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hash = this.getHash();
        result = result * PRIME + ($hash == null ? 43 : $hash.hashCode());
        final long $index = this.getIndex();
        result = result * PRIME + (int) ($index >>> 32 ^ $index);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OutPoint;
    }

    public String toString() {
        return "OutPoint(hash=" + this.getHash() + ", index=" + this.getIndex() + ")";
    }
}
