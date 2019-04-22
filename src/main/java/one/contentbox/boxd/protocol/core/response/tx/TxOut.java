package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: TxOut
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TxOut {
    private long value;
    private String scriptPubKey;

    public TxOut() {
    }

    public long getValue() {
        return this.value;
    }

    public String getScriptPubKey() {
        return this.scriptPubKey;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TxOut)) return false;
        final TxOut other = (TxOut) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getValue() != other.getValue()) return false;
        final Object this$scriptPubKey = this.getScriptPubKey();
        final Object other$scriptPubKey = other.getScriptPubKey();
        if (this$scriptPubKey == null ? other$scriptPubKey != null : !this$scriptPubKey.equals(other$scriptPubKey))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $value = this.getValue();
        result = result * PRIME + (int) ($value >>> 32 ^ $value);
        final Object $scriptPubKey = this.getScriptPubKey();
        result = result * PRIME + ($scriptPubKey == null ? 43 : $scriptPubKey.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TxOut;
    }

    public String toString() {
        return "TxOut(value=" + this.getValue() + ", scriptPubKey=" + this.getScriptPubKey() + ")";
    }
}
