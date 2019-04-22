package one.contentbox.boxd.protocol.core.response.tx;

import java.util.List;

/**
 * describe: TxDetail
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TxDetail {
    private String hash;
    private List<TxInDetail> vin;
    private List<TxOutDetail> vout;

    public TxDetail() {
    }

    public String getHash() {
        return this.hash;
    }

    public List<TxInDetail> getVin() {
        return this.vin;
    }

    public List<TxOutDetail> getVout() {
        return this.vout;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setVin(List<TxInDetail> vin) {
        this.vin = vin;
    }

    public void setVout(List<TxOutDetail> vout) {
        this.vout = vout;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TxDetail)) return false;
        final TxDetail other = (TxDetail) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hash = this.getHash();
        final Object other$hash = other.getHash();
        if (this$hash == null ? other$hash != null : !this$hash.equals(other$hash)) return false;
        final Object this$vin = this.getVin();
        final Object other$vin = other.getVin();
        if (this$vin == null ? other$vin != null : !this$vin.equals(other$vin)) return false;
        final Object this$vout = this.getVout();
        final Object other$vout = other.getVout();
        if (this$vout == null ? other$vout != null : !this$vout.equals(other$vout)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hash = this.getHash();
        result = result * PRIME + ($hash == null ? 43 : $hash.hashCode());
        final Object $vin = this.getVin();
        result = result * PRIME + ($vin == null ? 43 : $vin.hashCode());
        final Object $vout = this.getVout();
        result = result * PRIME + ($vout == null ? 43 : $vout.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TxDetail;
    }

    public String toString() {
        return "TxDetail(hash=" + this.getHash() + ", vin=" + this.getVin() + ", vout=" + this.getVout() + ")";
    }
}
