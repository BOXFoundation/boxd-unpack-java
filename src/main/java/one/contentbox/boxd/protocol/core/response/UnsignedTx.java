package one.contentbox.boxd.protocol.core.response;

import com.google.protobuf.ByteString;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp;
import one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction;

import java.util.List;

/**
 * describe: UnsignedTx
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */


public class UnsignedTx {
    private Transaction tx;
    private List<ByteString> rawMsgs;


    public UnsignedTx(MakeTxResp txResp){
        this(txResp.getTx(), txResp.getRawMsgsList());
    }

    public UnsignedTx(Transaction transaction, List<ByteString> rawMsgs){
        this.tx = transaction;
        this.rawMsgs = rawMsgs;
    }

    public Transaction getTx() {
        return this.tx;
    }

    public List<ByteString> getRawMsgs() {
        return this.rawMsgs;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }

    public void setRawMsgs(List<ByteString> rawMsgs) {
        this.rawMsgs = rawMsgs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UnsignedTx)) return false;
        final UnsignedTx other = (UnsignedTx) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tx = this.getTx();
        final Object other$tx = other.getTx();
        if (this$tx == null ? other$tx != null : !this$tx.equals(other$tx)) return false;
        final Object this$rawMsgs = this.getRawMsgs();
        final Object other$rawMsgs = other.getRawMsgs();
        if (this$rawMsgs == null ? other$rawMsgs != null : !this$rawMsgs.equals(other$rawMsgs)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tx = this.getTx();
        result = result * PRIME + ($tx == null ? 43 : $tx.hashCode());
        final Object $rawMsgs = this.getRawMsgs();
        result = result * PRIME + ($rawMsgs == null ? 43 : $rawMsgs.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnsignedTx;
    }

    public String toString() {
        return "UnsignedTx(tx=" + this.getTx() + ", rawMsgs=" + this.getRawMsgs() + ")";
    }
}
