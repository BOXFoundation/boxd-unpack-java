package one.contentbox.boxd.protocol.core.response.block;

import one.contentbox.boxd.protocol.core.response.tx.TxDetail;

import java.util.List;

/**
 * describe: BlockDetail
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class BlockDetail {

    private int version;
    private int height;
    private long timeStamp;
    private int size;
    private String hash;
    private String prevBlockHash;
    private String coinBase;
    private boolean confirmed;
    private String signature;
    private List<TxDetail> txs;

    public BlockDetail() {
    }

    public int getVersion() {
        return this.version;
    }

    public int getHeight() {
        return this.height;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getSize() {
        return this.size;
    }

    public String getHash() {
        return this.hash;
    }

    public String getPrevBlockHash() {
        return this.prevBlockHash;
    }

    public String getCoinBase() {
        return this.coinBase;
    }

    public boolean isConfirmed() {
        return this.confirmed;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<TxDetail> getTxs() {
        return this.txs;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setPrevBlockHash(String prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    public void setCoinBase(String coinBase) {
        this.coinBase = coinBase;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setTxs(List<TxDetail> txs) {
        this.txs = txs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BlockDetail)) return false;
        final BlockDetail other = (BlockDetail) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getVersion() != other.getVersion()) return false;
        if (this.getHeight() != other.getHeight()) return false;
        if (this.getTimeStamp() != other.getTimeStamp()) return false;
        if (this.getSize() != other.getSize()) return false;
        final Object this$hash = this.getHash();
        final Object other$hash = other.getHash();
        if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) return false;
        final Object this$prevBlockHash = this.getPrevBlockHash();
        final Object other$prevBlockHash = other.getPrevBlockHash();
        if (this$prevBlockHash == null ? other$prevBlockHash != null : !this$prevBlockHash.equals(other$prevBlockHash))
            return false;
        final Object this$coinBase = this.getCoinBase();
        final Object other$coinBase = other.getCoinBase();
        if (this$coinBase == null ? other$coinBase != null : !this$coinBase.equals(other$coinBase)) return false;
        if (this.isConfirmed() != other.isConfirmed()) return false;
        final Object this$signature = this.getSignature();
        final Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        final Object this$txs = this.getTxs();
        final Object other$txs = other.getTxs();
        if (this$txs == null ? other$txs != null : !this$txs.equals(other$txs)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getVersion();
        result = result * PRIME + this.getHeight();
        final long $timeStamp = this.getTimeStamp();
        result = result * PRIME + (int) ($timeStamp >>> 32 ^ $timeStamp);
        result = result * PRIME + this.getSize();
        final Object $hash = this.getHash();
        result = result * PRIME + ($hash == null ? 43 : $hash.hashCode());
        final Object $prevBlockHash = this.getPrevBlockHash();
        result = result * PRIME + ($prevBlockHash == null ? 43 : $prevBlockHash.hashCode());
        final Object $coinBase = this.getCoinBase();
        result = result * PRIME + ($coinBase == null ? 43 : $coinBase.hashCode());
        result = result * PRIME + (this.isConfirmed() ? 79 : 97);
        final Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        final Object $txs = this.getTxs();
        result = result * PRIME + ($txs == null ? 43 : $txs.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BlockDetail;
    }

    public String toString() {
        return "BlockDetail(version=" + this.getVersion() + ", height=" + this.getHeight() + ", timeStamp=" + this.getTimeStamp() + ", size=" + this.getSize() + ", hash=" + this.getHash() + ", prevBlockHash=" + this.getPrevBlockHash() + ", coinBase=" + this.getCoinBase() + ", confirmed=" + this.isConfirmed() + ", signature=" + this.getSignature() + ", txs=" + this.getTxs() + ")";
    }
}
