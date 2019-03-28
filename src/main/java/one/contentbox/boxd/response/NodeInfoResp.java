package one.contentbox.boxd.response;

import lombok.Data;
import one.contentbox.boxd.proto.GetNodeInfoResponse;
import one.contentbox.boxd.proto.Node;

import java.util.List;

@Data
public class NodeInfoResp {

    private int count;
    private List<Node>  nodes;

    public NodeInfoResp(GetNodeInfoResponse getNodeInfoResponse){
        this.count = getNodeInfoResponse.getNodesCount();
        this.nodes = getNodeInfoResponse.getNodesList();
    }
}
