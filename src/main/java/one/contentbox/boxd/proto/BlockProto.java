// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package one.contentbox.boxd.proto;

public final class BlockProto {
  private BlockProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_BlockHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_BlockHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_IrreversibleInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_IrreversibleInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_Block_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_TxIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_TxIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_TxOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_TxOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_OutPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_OutPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_corepb_UtxoWrap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_corepb_UtxoWrap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013block.proto\022\006corepb\"\232\001\n\013BlockHeader\022\017\n" +
      "\007version\030\001 \001(\005\022\027\n\017prev_block_hash\030\002 \001(\014\022" +
      "\020\n\010txs_root\030\003 \001(\014\022\022\n\ntime_stamp\030\004 \001(\003\022\r\n" +
      "\005magic\030\005 \001(\r\022\023\n\013period_hash\030\006 \001(\014\022\027\n\017can" +
      "didates_hash\030\007 \001(\014\"4\n\020IrreversibleInfo\022\014" +
      "\n\004hash\030\001 \001(\014\022\022\n\nsignatures\030\002 \003(\014\"\246\001\n\005Blo" +
      "ck\022#\n\006header\030\001 \001(\0132\023.corepb.BlockHeader\022" +
      " \n\003txs\030\002 \003(\0132\023.corepb.Transaction\022\016\n\006hei" +
      "ght\030\003 \001(\r\022\021\n\tsignature\030\004 \001(\014\0223\n\021irrevers" +
      "ible_info\030\005 \001(\0132\030.corepb.IrreversibleInf",
      "o\"\224\001\n\013Transaction\022\017\n\007version\030\001 \001(\005\022\031\n\003vi" +
      "n\030\002 \003(\0132\014.corepb.TxIn\022\033\n\004vout\030\003 \003(\0132\r.co" +
      "repb.TxOut\022\032\n\004data\030\004 \001(\0132\014.corepb.Data\022\r" +
      "\n\005magic\030\005 \001(\r\022\021\n\tlock_time\030\006 \001(\003\"V\n\004TxIn" +
      "\022(\n\016prev_out_point\030\001 \001(\0132\020.corepb.OutPoi" +
      "nt\022\022\n\nscript_sig\030\002 \001(\014\022\020\n\010sequence\030\003 \001(\r" +
      "\".\n\005TxOut\022\r\n\005value\030\001 \001(\004\022\026\n\016script_pub_k" +
      "ey\030\002 \001(\014\"\'\n\010OutPoint\022\014\n\004hash\030\001 \001(\014\022\r\n\005in" +
      "dex\030\002 \001(\r\"%\n\004Data\022\014\n\004type\030\001 \001(\005\022\017\n\007conte" +
      "nt\030\002 \001(\014\"f\n\010UtxoWrap\022\035\n\006output\030\001 \001(\0132\r.c",
      "orepb.TxOut\022\024\n\014block_height\030\002 \001(\r\022\020\n\010is_" +
      "spent\030\003 \001(\010\022\023\n\013is_coinbase\030\004 \001(\010B)\n\031one." +
      "contentbox.boxd.protoB\nBlockProtoP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_corepb_BlockHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_corepb_BlockHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_BlockHeader_descriptor,
        new java.lang.String[] { "Version", "PrevBlockHash", "TxsRoot", "TimeStamp", "Magic", "PeriodHash", "CandidatesHash", });
    internal_static_corepb_IrreversibleInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_corepb_IrreversibleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_IrreversibleInfo_descriptor,
        new java.lang.String[] { "Hash", "Signatures", });
    internal_static_corepb_Block_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_corepb_Block_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_Block_descriptor,
        new java.lang.String[] { "Header", "Txs", "Height", "Signature", "IrreversibleInfo", });
    internal_static_corepb_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_corepb_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_Transaction_descriptor,
        new java.lang.String[] { "Version", "Vin", "Vout", "Data", "Magic", "LockTime", });
    internal_static_corepb_TxIn_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_corepb_TxIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_TxIn_descriptor,
        new java.lang.String[] { "PrevOutPoint", "ScriptSig", "Sequence", });
    internal_static_corepb_TxOut_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_corepb_TxOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_TxOut_descriptor,
        new java.lang.String[] { "Value", "ScriptPubKey", });
    internal_static_corepb_OutPoint_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_corepb_OutPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_OutPoint_descriptor,
        new java.lang.String[] { "Hash", "Index", });
    internal_static_corepb_Data_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_corepb_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_Data_descriptor,
        new java.lang.String[] { "Type", "Content", });
    internal_static_corepb_UtxoWrap_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_corepb_UtxoWrap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_corepb_UtxoWrap_descriptor,
        new java.lang.String[] { "Output", "BlockHeight", "IsSpent", "IsCoinbase", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
