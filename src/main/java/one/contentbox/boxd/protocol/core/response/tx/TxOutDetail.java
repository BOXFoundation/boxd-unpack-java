package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: TxOutDetail
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class TxOutDetail {

    private String addr;
    private long value;
    private String scriptPubKey;
    private String scriptDisasm;
    private String type;
    private TokenIssueInfo tokenIssueInfo;
    private TokenTransferInfo tokenTransferInfo;
    private SplitContractInfo splitContractInfo;

    public TxOutDetail() {
    }

    public String getAddr() {
        return this.addr;
    }

    public long getValue() {
        return this.value;
    }

    public String getScriptPubKey() {
        return this.scriptPubKey;
    }

    public String getScriptDisasm() {
        return this.scriptDisasm;
    }

    public String getType() {
        return this.type;
    }

    public TokenIssueInfo getTokenIssueInfo() {
        return this.tokenIssueInfo;
    }

    public TokenTransferInfo getTokenTransferInfo() {
        return this.tokenTransferInfo;
    }

    public SplitContractInfo getSplitContractInfo() {
        return this.splitContractInfo;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public void setScriptDisasm(String scriptDisasm) {
        this.scriptDisasm = scriptDisasm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTokenIssueInfo(TokenIssueInfo tokenIssueInfo) {
        this.tokenIssueInfo = tokenIssueInfo;
    }

    public void setTokenTransferInfo(TokenTransferInfo tokenTransferInfo) {
        this.tokenTransferInfo = tokenTransferInfo;
    }

    public void setSplitContractInfo(SplitContractInfo splitContractInfo) {
        this.splitContractInfo = splitContractInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TxOutDetail)) return false;
        final TxOutDetail other = (TxOutDetail) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$addr = this.getAddr();
        final Object other$addr = other.getAddr();
        if (this$addr == null ? other$addr != null : !this$addr.equals(other$addr)) return false;
        if (this.getValue() != other.getValue()) return false;
        final Object this$scriptPubKey = this.getScriptPubKey();
        final Object other$scriptPubKey = other.getScriptPubKey();
        if (this$scriptPubKey == null ? other$scriptPubKey != null : !this$scriptPubKey.equals(other$scriptPubKey))
            return false;
        final Object this$scriptDisasm = this.getScriptDisasm();
        final Object other$scriptDisasm = other.getScriptDisasm();
        if (this$scriptDisasm == null ? other$scriptDisasm != null : !this$scriptDisasm.equals(other$scriptDisasm))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$tokenIssueInfo = this.getTokenIssueInfo();
        final Object other$tokenIssueInfo = other.getTokenIssueInfo();
        if (this$tokenIssueInfo == null ? other$tokenIssueInfo != null : !this$tokenIssueInfo.equals(other$tokenIssueInfo))
            return false;
        final Object this$tokenTransferInfo = this.getTokenTransferInfo();
        final Object other$tokenTransferInfo = other.getTokenTransferInfo();
        if (this$tokenTransferInfo == null ? other$tokenTransferInfo != null : !this$tokenTransferInfo.equals(other$tokenTransferInfo))
            return false;
        final Object this$splitContractInfo = this.getSplitContractInfo();
        final Object other$splitContractInfo = other.getSplitContractInfo();
        if (this$splitContractInfo == null ? other$splitContractInfo != null : !this$splitContractInfo.equals(other$splitContractInfo))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $addr = this.getAddr();
        result = result * PRIME + ($addr == null ? 43 : $addr.hashCode());
        final long $value = this.getValue();
        result = result * PRIME + (int) ($value >>> 32 ^ $value);
        final Object $scriptPubKey = this.getScriptPubKey();
        result = result * PRIME + ($scriptPubKey == null ? 43 : $scriptPubKey.hashCode());
        final Object $scriptDisasm = this.getScriptDisasm();
        result = result * PRIME + ($scriptDisasm == null ? 43 : $scriptDisasm.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $tokenIssueInfo = this.getTokenIssueInfo();
        result = result * PRIME + ($tokenIssueInfo == null ? 43 : $tokenIssueInfo.hashCode());
        final Object $tokenTransferInfo = this.getTokenTransferInfo();
        result = result * PRIME + ($tokenTransferInfo == null ? 43 : $tokenTransferInfo.hashCode());
        final Object $splitContractInfo = this.getSplitContractInfo();
        result = result * PRIME + ($splitContractInfo == null ? 43 : $splitContractInfo.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TxOutDetail;
    }

    public String toString() {
        return "TxOutDetail(addr=" + this.getAddr() + ", value=" + this.getValue() + ", scriptPubKey=" + this.getScriptPubKey() + ", scriptDisasm=" + this.getScriptDisasm() + ", type=" + this.getType() + ", tokenIssueInfo=" + this.getTokenIssueInfo() + ", tokenTransferInfo=" + this.getTokenTransferInfo() + ", splitContractInfo=" + this.getSplitContractInfo() + ")";
    }
}
