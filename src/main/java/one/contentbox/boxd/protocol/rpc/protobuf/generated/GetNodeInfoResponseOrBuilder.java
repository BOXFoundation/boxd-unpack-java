// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: control.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface GetNodeInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.GetNodeInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  java.util.List<Node>
      getNodesList();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  Node getNodes(int index);
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  java.util.List<? extends NodeOrBuilder>
      getNodesOrBuilderList();
  /**
   * <code>repeated .rpcpb.Node nodes = 1;</code>
   */
  NodeOrBuilder getNodesOrBuilder(
          int index);
}
