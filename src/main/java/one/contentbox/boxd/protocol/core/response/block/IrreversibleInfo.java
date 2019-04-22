package one.contentbox.boxd.protocol.core.response.block;

import java.util.List;

/**
 * describe: IrreversibleInfo
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class IrreversibleInfo {

    private String hash;
    private List<String> signatures;

    public IrreversibleInfo() {
    }

    public String getHash() {
        return this.hash;
    }

    public List<String> getSignatures() {
        return this.signatures;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IrreversibleInfo)) return false;
        final IrreversibleInfo other = (IrreversibleInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hash = this.getHash();
        final Object other$hash = other.getHash();
        if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) return false;
        final Object this$signatures = this.getSignatures();
        final Object other$signatures = other.getSignatures();
        if (this$signatures == null ? other$signatures != null : !this$signatures.equals(other$signatures))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hash = this.getHash();
        result = result * PRIME + ($hash == null ? 43 : $hash.hashCode());
        final Object $signatures = this.getSignatures();
        result = result * PRIME + ($signatures == null ? 43 : $signatures.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof IrreversibleInfo;
    }

    public String toString() {
        return "IrreversibleInfo(hash=" + this.getHash() + ", signatures=" + this.getSignatures() + ")";
    }
}
