package one.contentbox.boxd.protocol.core.response;

import java.util.List;

/**
 * describe: Node
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

public class Node {
    private String id;
    private List<String> addrs;
    private String ttl;

    public Node() {
    }

    public String getId() {
        return this.id;
    }

    public List<String> getAddrs() {
        return this.addrs;
    }

    public String getTtl() {
        return this.ttl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddrs(List<String> addrs) {
        this.addrs = addrs;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Node)) return false;
        final Node other = (Node) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$addrs = this.getAddrs();
        final Object other$addrs = other.getAddrs();
        if (this$addrs == null ? other$addrs != null : !this$addrs.equals(other$addrs)) return false;
        final Object this$ttl = this.getTtl();
        final Object other$ttl = other.getTtl();
        if (this$ttl == null ? other$ttl != null : !this$ttl.equals(other$ttl)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $addrs = this.getAddrs();
        result = result * PRIME + ($addrs == null ? 43 : $addrs.hashCode());
        final Object $ttl = this.getTtl();
        result = result * PRIME + ($ttl == null ? 43 : $ttl.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Node;
    }

    public String toString() {
        return "Node(id=" + this.getId() + ", addrs=" + this.getAddrs() + ", ttl=" + this.getTtl() + ")";
    }
}
