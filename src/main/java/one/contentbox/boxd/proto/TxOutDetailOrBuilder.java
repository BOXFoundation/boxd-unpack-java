// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.proto;

public interface TxOutDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.TxOutDetail)
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
   * <code>uint64 value = 2;</code>
   */
  long getValue();

  /**
   * <code>string script_pub_key = 3;</code>
   */
  java.lang.String getScriptPubKey();
  /**
   * <code>string script_pub_key = 3;</code>
   */
  com.google.protobuf.ByteString
      getScriptPubKeyBytes();

  /**
   * <code>string script_disasm = 4;</code>
   */
  java.lang.String getScriptDisasm();
  /**
   * <code>string script_disasm = 4;</code>
   */
  com.google.protobuf.ByteString
      getScriptDisasmBytes();

  /**
   * <code>.rpcpb.TxOutDetail.TxOutType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <code>.rpcpb.TxOutDetail.TxOutType type = 5;</code>
   */
  one.contentbox.boxd.proto.TxOutDetail.TxOutType getType();

  /**
   * <code>.rpcpb.TokenIssueInfo token_issue_info = 6;</code>
   */
  one.contentbox.boxd.proto.TokenIssueInfo getTokenIssueInfo();
  /**
   * <code>.rpcpb.TokenIssueInfo token_issue_info = 6;</code>
   */
  one.contentbox.boxd.proto.TokenIssueInfoOrBuilder getTokenIssueInfoOrBuilder();

  /**
   * <code>.rpcpb.TokenTransferInfo token_transfer_info = 7;</code>
   */
  one.contentbox.boxd.proto.TokenTransferInfo getTokenTransferInfo();
  /**
   * <code>.rpcpb.TokenTransferInfo token_transfer_info = 7;</code>
   */
  one.contentbox.boxd.proto.TokenTransferInfoOrBuilder getTokenTransferInfoOrBuilder();

  /**
   * <code>.rpcpb.SplitContractInfo split_contract_info = 8;</code>
   */
  one.contentbox.boxd.proto.SplitContractInfo getSplitContractInfo();
  /**
   * <code>.rpcpb.SplitContractInfo split_contract_info = 8;</code>
   */
  one.contentbox.boxd.proto.SplitContractInfoOrBuilder getSplitContractInfoOrBuilder();

  public one.contentbox.boxd.proto.TxOutDetail.AppendixCase getAppendixCase();
}