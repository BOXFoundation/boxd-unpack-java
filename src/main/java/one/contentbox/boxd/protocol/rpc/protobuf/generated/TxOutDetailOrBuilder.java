// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

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
  TxOutDetail.TxOutType getType();

  /**
   * <code>.rpcpb.TokenIssueInfo token_issue_info = 6;</code>
   */
  TokenIssueInfo getTokenIssueInfo();
  /**
   * <code>.rpcpb.TokenIssueInfo token_issue_info = 6;</code>
   */
  TokenIssueInfoOrBuilder getTokenIssueInfoOrBuilder();

  /**
   * <code>.rpcpb.TokenTransferInfo token_transfer_info = 7;</code>
   */
  TokenTransferInfo getTokenTransferInfo();
  /**
   * <code>.rpcpb.TokenTransferInfo token_transfer_info = 7;</code>
   */
  TokenTransferInfoOrBuilder getTokenTransferInfoOrBuilder();

  /**
   * <code>.rpcpb.SplitContractInfo split_contract_info = 8;</code>
   */
  SplitContractInfo getSplitContractInfo();
  /**
   * <code>.rpcpb.SplitContractInfo split_contract_info = 8;</code>
   */
  SplitContractInfoOrBuilder getSplitContractInfoOrBuilder();

  public TxOutDetail.AppendixCase getAppendixCase();
}