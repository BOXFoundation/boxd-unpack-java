package one.contentbox.boxd.protocol.core.response;

import one.contentbox.boxd.protocol.core.response.block.BlockHeader;
import one.contentbox.boxd.protocol.core.response.block.IrreversibleInfo;

import java.util.List;

/**
 * describe: Block
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class Block {

    private BlockHeader header;
    private List<Transaction> txs;
    private int height;
    private String signature;
    private IrreversibleInfo irreversibleInfo;

    public Block() {
    }

    public BlockHeader getHeader() {
        return this.header;
    }

    public List<Transaction> getTxs() {
        return this.txs;
    }

    public int getHeight() {
        return this.height;
    }

    public String getSignature() {
        return this.signature;
    }

    public IrreversibleInfo getIrreversibleInfo() {
        return this.irreversibleInfo;
    }

    public void setHeader(BlockHeader header) {
        this.header = header;
    }

    public void setTxs(List<Transaction> txs) {
        this.txs = txs;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setIrreversibleInfo(IrreversibleInfo irreversibleInfo) {
        this.irreversibleInfo = irreversibleInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Block)) return false;
        final Block other = (Block) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$header = this.getHeader();
        final Object other$header = other.getHeader();
        if (this$header == null ? other$header != null : !this$header.equals(other$header)) return false;
        final Object this$txs = this.getTxs();
        final Object other$txs = other.getTxs();
        if (this$txs == null ? other$txs != null : !this$txs.equals(other$txs)) return false;
        if (this.getHeight() != other.getHeight()) return false;
        final Object this$signature = this.getSignature();
        final Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        final Object this$irreversibleInfo = this.getIrreversibleInfo();
        final Object other$irreversibleInfo = other.getIrreversibleInfo();
        if (this$irreversibleInfo == null ? other$irreversibleInfo != null : !this$irreversibleInfo.equals(other$irreversibleInfo))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $header = this.getHeader();
        result = result * PRIME + ($header == null ? 43 : $header.hashCode());
        final Object $txs = this.getTxs();
        result = result * PRIME + ($txs == null ? 43 : $txs.hashCode());
        result = result * PRIME + this.getHeight();
        final Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        final Object $irreversibleInfo = this.getIrreversibleInfo();
        result = result * PRIME + ($irreversibleInfo == null ? 43 : $irreversibleInfo.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Block;
    }

    public String toString() {
        return "Block(header=" + this.getHeader() + ", txs=" + this.getTxs() + ", height=" + this.getHeight() + ", signature=" + this.getSignature() + ", irreversibleInfo=" + this.getIrreversibleInfo() + ")";
    }
}
