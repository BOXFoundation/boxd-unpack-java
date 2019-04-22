package one.contentbox.boxd.protocol.core.response.tx;

import one.contentbox.boxd.protocol.core.response.TokenTag;

/**
 * describe: TokenIssueInfo
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TokenIssueInfo {

    private TokenTag tokenTag;

    public TokenIssueInfo() {
    }

    public TokenTag getTokenTag() {
        return this.tokenTag;
    }

    public void setTokenTag(TokenTag tokenTag) {
        this.tokenTag = tokenTag;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenIssueInfo)) return false;
        final TokenIssueInfo other = (TokenIssueInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tokenTag = this.getTokenTag();
        final Object other$tokenTag = other.getTokenTag();
        if (this$tokenTag == null ? other$tokenTag != null : !this$tokenTag.equals(other$tokenTag)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tokenTag = this.getTokenTag();
        result = result * PRIME + ($tokenTag == null ? 43 : $tokenTag.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TokenIssueInfo;
    }

    public String toString() {
        return "TokenIssueInfo(tokenTag=" + this.getTokenTag() + ")";
    }
}
