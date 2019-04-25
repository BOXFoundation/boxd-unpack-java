package one.contentbox.boxd.protocol.core.request;

import java.util.Map;

public class TokenTransferTx {

    private String from;
    private long fee;
    private String tokenHash;
    private int  tokenIndex;
    private Map<String, Long> to;

    public TokenTransferTx() {
    }

    public String getFrom() {
        return this.from;
    }

    public long getFee() {
        return this.fee;
    }

    public String getTokenHash() {
        return this.tokenHash;
    }

    public int getTokenIndex() {
        return this.tokenIndex;
    }

    public Map<String, Long> getTo() {
        return this.to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public void setTokenHash(String tokenHash) {
        this.tokenHash = tokenHash;
    }

    public void setTokenIndex(int tokenIndex) {
        this.tokenIndex = tokenIndex;
    }

    public void setTo(Map<String, Long> to) {
        this.to = to;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenTransferTx)) return false;
        final TokenTransferTx other = (TokenTransferTx) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        if (this.getFee() != other.getFee()) return false;
        final Object this$tokenHash = this.getTokenHash();
        final Object other$tokenHash = other.getTokenHash();
        if (this$tokenHash == null ? other$tokenHash != null : !this$tokenHash.equals(other$tokenHash)) return false;
        if (this.getTokenIndex() != other.getTokenIndex()) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final long $fee = this.getFee();
        result = result * PRIME + (int) ($fee >>> 32 ^ $fee);
        final Object $tokenHash = this.getTokenHash();
        result = result * PRIME + ($tokenHash == null ? 43 : $tokenHash.hashCode());
        result = result * PRIME + this.getTokenIndex();
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TokenTransferTx;
    }

    public String toString() {
        return "TokenTransferTx(from=" + this.getFrom() + ", fee=" + this.getFee() + ", tokenHash=" + this.getTokenHash() + ", tokenIndex=" + this.getTokenIndex() + ", to=" + this.getTo() + ")";
    }
}
