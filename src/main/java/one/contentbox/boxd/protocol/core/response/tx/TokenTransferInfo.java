package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: TokenTransferInfo
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TokenTransferInfo {

    private String tokenId;

    public TokenTransferInfo() {
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenTransferInfo)) return false;
        final TokenTransferInfo other = (TokenTransferInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tokenId = this.getTokenId();
        final Object other$tokenId = other.getTokenId();
        if (this$tokenId == null ? other$tokenId != null : !this$tokenId.equals(other$tokenId)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tokenId = this.getTokenId();
        result = result * PRIME + ($tokenId == null ? 43 : $tokenId.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TokenTransferInfo;
    }

    public String toString() {
        return "TokenTransferInfo(tokenId=" + this.getTokenId() + ")";
    }
}
