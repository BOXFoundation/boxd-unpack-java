package one.contentbox.boxd.protocol.core.response.tx;

import one.contentbox.boxd.protocol.core.response.UnsignedTx;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp;

/**
 * describe: UnsignedSplitAddrTx
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class UnsignedSplitAddrTx extends UnsignedTx {

    private String splitAddr;

    public UnsignedSplitAddrTx(MakeSplitAddrTxResp txResp){
        super(txResp.getTx(), txResp.getRawMsgsList());
        this.splitAddr = txResp.getSplitAddr();
    }

    public String getSplitAddr() {
        return this.splitAddr;
    }

    public void setSplitAddr(String splitAddr) {
        this.splitAddr = splitAddr;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UnsignedSplitAddrTx)) return false;
        final UnsignedSplitAddrTx other = (UnsignedSplitAddrTx) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$splitAddr = this.getSplitAddr();
        final Object other$splitAddr = other.getSplitAddr();
        if (this$splitAddr == null ? other$splitAddr != null : !this$splitAddr.equals(other$splitAddr)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $splitAddr = this.getSplitAddr();
        result = result * PRIME + ($splitAddr == null ? 43 : $splitAddr.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnsignedSplitAddrTx;
    }

    public String toString() {
        return "UnsignedSplitAddrTx(splitAddr=" + this.getSplitAddr() + ")";
    }
}
