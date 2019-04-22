package one.contentbox.boxd.protocol.core.response;

/**
 * describe: NetworkID
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class NetworkID {
    private int id;
    private String literal;

    public NetworkID() {
    }

    public int getId() {
        return this.id;
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof NetworkID)) return false;
        final NetworkID other = (NetworkID) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$literal = this.getLiteral();
        final Object other$literal = other.getLiteral();
        if (this$literal == null ? other$literal != null : !this$literal.equals(other$literal)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $literal = this.getLiteral();
        result = result * PRIME + ($literal == null ? 43 : $literal.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof NetworkID;
    }

    public String toString() {
        return "NetworkID(id=" + this.getId() + ", literal=" + this.getLiteral() + ")";
    }
}
