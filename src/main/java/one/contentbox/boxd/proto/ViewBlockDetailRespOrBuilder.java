// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.proto;

public interface ViewBlockDetailRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.ViewBlockDetailResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.rpcpb.BlockDetail detail = 3;</code>
   */
  boolean hasDetail();
  /**
   * <code>.rpcpb.BlockDetail detail = 3;</code>
   */
  one.contentbox.boxd.proto.BlockDetail getDetail();
  /**
   * <code>.rpcpb.BlockDetail detail = 3;</code>
   */
  one.contentbox.boxd.proto.BlockDetailOrBuilder getDetailOrBuilder();
}