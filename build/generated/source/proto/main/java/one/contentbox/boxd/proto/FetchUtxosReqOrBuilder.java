// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.proto;

public interface FetchUtxosReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.FetchUtxosReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string addr = 1;</code>
   */
  java.lang.String getAddr();
  /**
   * <code>string addr = 1;</code>
   */
  com.google.protobuf.ByteString
      getAddrBytes();

  /**
   * <code>uint64 amount = 2;</code>
   */
  long getAmount();

  /**
   * <code>string token_hash = 3;</code>
   */
  java.lang.String getTokenHash();
  /**
   * <code>string token_hash = 3;</code>
   */
  com.google.protobuf.ByteString
      getTokenHashBytes();

  /**
   * <code>uint32 token_index = 4;</code>
   */
  int getTokenIndex();
}
