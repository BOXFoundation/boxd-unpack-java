package one.contentbox.boxd.protocol.core.response;

import one.contentbox.boxd.protocol.core.response.tx.Data;
import one.contentbox.boxd.protocol.core.response.tx.TxIn;
import one.contentbox.boxd.protocol.core.response.tx.TxOut;

import java.util.List;

/**
 * describe: Transaction
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class Transaction {

    private int version;
    private List<TxIn> vin;
    private List<TxOut> vout;
    private Data data;
    private int magic;
    private long lockTime;

    public Transaction() {
    }

    public int getVersion() {
        return this.version;
    }

    public List<TxIn> getVin() {
        return this.vin;
    }

    public List<TxOut> getVout() {
        return this.vout;
    }

    public Data getData() {
        return this.data;
    }

    public int getMagic() {
        return this.magic;
    }

    public long getLockTime() {
        return this.lockTime;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setVin(List<TxIn> vin) {
        this.vin = vin;
    }

    public void setVout(List<TxOut> vout) {
        this.vout = vout;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setLockTime(long lockTime) {
        this.lockTime = lockTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Transaction)) return false;
        final Transaction other = (Transaction) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getVersion() != other.getVersion()) return false;
        final Object this$vin = this.getVin();
        final Object other$vin = other.getVin();
        if (this$vin == null ? other$vin != null : !this$vin.equals(other$vin)) return false;
        final Object this$vout = this.getVout();
        final Object other$vout = other.getVout();
        if (this$vout == null ? other$vout != null : !this$vout.equals(other$vout)) return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        if (this.getMagic() != other.getMagic()) return false;
        if (this.getLockTime() != other.getLockTime()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getVersion();
        final Object $vin = this.getVin();
        result = result * PRIME + ($vin == null ? 43 : $vin.hashCode());
        final Object $vout = this.getVout();
        result = result * PRIME + ($vout == null ? 43 : $vout.hashCode());
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        result = result * PRIME + this.getMagic();
        final long $lockTime = this.getLockTime();
        result = result * PRIME + (int) ($lockTime >>> 32 ^ $lockTime);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Transaction;
    }

    public String toString() {
        return "Transaction(version=" + this.getVersion() + ", vin=" + this.getVin() + ", vout=" + this.getVout() + ", data=" + this.getData() + ", magic=" + this.getMagic() + ", lockTime=" + this.getLockTime() + ")";
    }
}
