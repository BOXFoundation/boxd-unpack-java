package one.contentbox.boxd.protocol.core.response.tx;

import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp;

/**
 * describe: UnsignedTokenIssueTx
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class UnsignedTokenIssueTx extends UnsignedTx {

    private int issueOutIndex;

    public UnsignedTokenIssueTx(MakeTokenIssueTxResp txResp){
        super(txResp.getTx(), txResp.getRawMsgsList());
        this.issueOutIndex = txResp.getIssueOutIndex();
    }

    public int getIssueOutIndex() {
        return this.issueOutIndex;
    }

    public void setIssueOutIndex(int issueOutIndex) {
        this.issueOutIndex = issueOutIndex;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UnsignedTokenIssueTx)) return false;
        final UnsignedTokenIssueTx other = (UnsignedTokenIssueTx) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getIssueOutIndex() != other.getIssueOutIndex()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getIssueOutIndex();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnsignedTokenIssueTx;
    }

    public String toString() {
        return "UnsignedTokenIssueTx(issueOutIndex=" + this.getIssueOutIndex() + ")";
    }
}
