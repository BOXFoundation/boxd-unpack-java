// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface ViewTxDetailRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.ViewTxDetailResp)
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
   * <code>int32 version = 3;</code>
   */
  int getVersion();

  /**
   * <code>int64 block_time = 4;</code>
   */
  long getBlockTime();

  /**
   * <code>uint32 block_height = 5;</code>
   */
  int getBlockHeight();

  /**
   * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
   */
  int getStatusValue();
  /**
   * <code>.rpcpb.ViewTxDetailResp.TxStatus status = 6;</code>
   */
  ViewTxDetailResp.TxStatus getStatus();

  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  boolean hasDetail();
  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  TxDetail getDetail();
  /**
   * <code>.rpcpb.TxDetail detail = 7;</code>
   */
  TxDetailOrBuilder getDetailOrBuilder();
}