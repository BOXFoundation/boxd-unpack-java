package one.contentbox.boxd.protocol.core.response;

/**
 * describe: TokenTag
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TokenTag {

    private String name;
    private String symbol;
    private long supply;
    private int decimal;

    public TokenTag() {
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public long getSupply() {
        return this.supply;
    }

    public int getDecimal() {
        return this.decimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSupply(long supply) {
        this.supply = supply;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenTag)) return false;
        final TokenTag other = (TokenTag) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        if (this.getSupply() != other.getSupply()) return false;
        if (this.getDecimal() != other.getDecimal()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        final long $supply = this.getSupply();
        result = result * PRIME + (int) ($supply >>> 32 ^ $supply);
        result = result * PRIME + this.getDecimal();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TokenTag;
    }

    public String toString() {
        return "TokenTag(name=" + this.getName() + ", symbol=" + this.getSymbol() + ", supply=" + this.getSupply() + ", decimal=" + this.getDecimal() + ")";
    }
}
