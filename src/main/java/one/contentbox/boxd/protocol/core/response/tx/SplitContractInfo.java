package one.contentbox.boxd.protocol.core.response.tx;

import java.util.List;

/**
 * describe: SplitContractInfo
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class SplitContractInfo {

    private List<String> addrs;
    private List<Integer> weights;

    public SplitContractInfo() {
    }

    public List<String> getAddrs() {
        return this.addrs;
    }

    public List<Integer> getWeights() {
        return this.weights;
    }

    public void setAddrs(List<String> addrs) {
        this.addrs = addrs;
    }

    public void setWeights(List<Integer> weights) {
        this.weights = weights;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SplitContractInfo)) return false;
        final SplitContractInfo other = (SplitContractInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$addrs = this.getAddrs();
        final Object other$addrs = other.getAddrs();
        if (this$addrs == null ? other$addrs != null : !this$addrs.equals(other$addrs)) return false;
        final Object this$weights = this.getWeights();
        final Object other$weights = other.getWeights();
        if (this$weights == null ? other$weights != null : !this$weights.equals(other$weights)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $addrs = this.getAddrs();
        result = result * PRIME + ($addrs == null ? 43 : $addrs.hashCode());
        final Object $weights = this.getWeights();
        result = result * PRIME + ($weights == null ? 43 : $weights.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SplitContractInfo;
    }

    public String toString() {
        return "SplitContractInfo(addrs=" + this.getAddrs() + ", weights=" + this.getWeights() + ")";
    }
}
