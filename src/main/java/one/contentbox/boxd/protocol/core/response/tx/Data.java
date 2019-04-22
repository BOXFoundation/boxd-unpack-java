package one.contentbox.boxd.protocol.core.response.tx;

/**
 * describe: Data
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class Data {

    private int type;
    private String content;

    public Data() {
    }

    public int getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Data)) return false;
        final Data other = (Data) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getType() != other.getType()) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getType();
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Data;
    }

    public String toString() {
        return "Data(type=" + this.getType() + ", content=" + this.getContent() + ")";
    }
}
