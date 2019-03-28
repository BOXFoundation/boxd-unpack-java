// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package one.contentbox.boxd.proto;

/**
 * Protobuf type {@code corepb.Block}
 */
public  final class Block extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:corepb.Block)
    BlockOrBuilder {
  // Use Block.newBuilder() to construct.
  private Block(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Block() {
    txs_ = java.util.Collections.emptyList();
    height_ = 0;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Block(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            one.contentbox.boxd.proto.BlockHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(one.contentbox.boxd.proto.BlockHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              txs_ = new java.util.ArrayList<one.contentbox.boxd.proto.Transaction>();
              mutable_bitField0_ |= 0x00000002;
            }
            txs_.add(
                input.readMessage(one.contentbox.boxd.proto.Transaction.parser(), extensionRegistry));
            break;
          }
          case 24: {

            height_ = input.readUInt32();
            break;
          }
          case 34: {

            signature_ = input.readBytes();
            break;
          }
          case 42: {
            one.contentbox.boxd.proto.IrreversibleInfo.Builder subBuilder = null;
            if (irreversibleInfo_ != null) {
              subBuilder = irreversibleInfo_.toBuilder();
            }
            irreversibleInfo_ = input.readMessage(one.contentbox.boxd.proto.IrreversibleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(irreversibleInfo_);
              irreversibleInfo_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        txs_ = java.util.Collections.unmodifiableList(txs_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.proto.BlockProto.internal_static_corepb_Block_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.proto.BlockProto.internal_static_corepb_Block_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.proto.Block.class, one.contentbox.boxd.proto.Block.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private one.contentbox.boxd.proto.BlockHeader header_;
  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  public one.contentbox.boxd.proto.BlockHeader getHeader() {
    return header_ == null ? one.contentbox.boxd.proto.BlockHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  public one.contentbox.boxd.proto.BlockHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int TXS_FIELD_NUMBER = 2;
  private java.util.List<one.contentbox.boxd.proto.Transaction> txs_;
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  public java.util.List<one.contentbox.boxd.proto.Transaction> getTxsList() {
    return txs_;
  }
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  public java.util.List<? extends one.contentbox.boxd.proto.TransactionOrBuilder> 
      getTxsOrBuilderList() {
    return txs_;
  }
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  public int getTxsCount() {
    return txs_.size();
  }
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  public one.contentbox.boxd.proto.Transaction getTxs(int index) {
    return txs_.get(index);
  }
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  public one.contentbox.boxd.proto.TransactionOrBuilder getTxsOrBuilder(
      int index) {
    return txs_.get(index);
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private int height_;
  /**
   * <code>uint32 height = 3;</code>
   */
  public int getHeight() {
    return height_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes signature = 4;</code>
   */
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int IRREVERSIBLE_INFO_FIELD_NUMBER = 5;
  private one.contentbox.boxd.proto.IrreversibleInfo irreversibleInfo_;
  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  public boolean hasIrreversibleInfo() {
    return irreversibleInfo_ != null;
  }
  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  public one.contentbox.boxd.proto.IrreversibleInfo getIrreversibleInfo() {
    return irreversibleInfo_ == null ? one.contentbox.boxd.proto.IrreversibleInfo.getDefaultInstance() : irreversibleInfo_;
  }
  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  public one.contentbox.boxd.proto.IrreversibleInfoOrBuilder getIrreversibleInfoOrBuilder() {
    return getIrreversibleInfo();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < txs_.size(); i++) {
      output.writeMessage(2, txs_.get(i));
    }
    if (height_ != 0) {
      output.writeUInt32(3, height_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
    }
    if (irreversibleInfo_ != null) {
      output.writeMessage(5, getIrreversibleInfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < txs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, txs_.get(i));
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, height_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
    }
    if (irreversibleInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getIrreversibleInfo());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof one.contentbox.boxd.proto.Block)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.proto.Block other = (one.contentbox.boxd.proto.Block) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getTxsList()
        .equals(other.getTxsList());
    result = result && (getHeight()
        == other.getHeight());
    result = result && getSignature()
        .equals(other.getSignature());
    result = result && (hasIrreversibleInfo() == other.hasIrreversibleInfo());
    if (hasIrreversibleInfo()) {
      result = result && getIrreversibleInfo()
          .equals(other.getIrreversibleInfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getTxsCount() > 0) {
      hash = (37 * hash) + TXS_FIELD_NUMBER;
      hash = (53 * hash) + getTxsList().hashCode();
    }
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    if (hasIrreversibleInfo()) {
      hash = (37 * hash) + IRREVERSIBLE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getIrreversibleInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.proto.Block parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.proto.Block parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.proto.Block parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.proto.Block parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(one.contentbox.boxd.proto.Block prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code corepb.Block}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:corepb.Block)
      one.contentbox.boxd.proto.BlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.proto.BlockProto.internal_static_corepb_Block_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.proto.BlockProto.internal_static_corepb_Block_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.proto.Block.class, one.contentbox.boxd.proto.Block.Builder.class);
    }

    // Construct using one.contentbox.boxd.proto.Block.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTxsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (txsBuilder_ == null) {
        txs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        txsBuilder_.clear();
      }
      height_ = 0;

      signature_ = com.google.protobuf.ByteString.EMPTY;

      if (irreversibleInfoBuilder_ == null) {
        irreversibleInfo_ = null;
      } else {
        irreversibleInfo_ = null;
        irreversibleInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.proto.BlockProto.internal_static_corepb_Block_descriptor;
    }

    public one.contentbox.boxd.proto.Block getDefaultInstanceForType() {
      return one.contentbox.boxd.proto.Block.getDefaultInstance();
    }

    public one.contentbox.boxd.proto.Block build() {
      one.contentbox.boxd.proto.Block result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.proto.Block buildPartial() {
      one.contentbox.boxd.proto.Block result = new one.contentbox.boxd.proto.Block(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (txsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          txs_ = java.util.Collections.unmodifiableList(txs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.txs_ = txs_;
      } else {
        result.txs_ = txsBuilder_.build();
      }
      result.height_ = height_;
      result.signature_ = signature_;
      if (irreversibleInfoBuilder_ == null) {
        result.irreversibleInfo_ = irreversibleInfo_;
      } else {
        result.irreversibleInfo_ = irreversibleInfoBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof one.contentbox.boxd.proto.Block) {
        return mergeFrom((one.contentbox.boxd.proto.Block)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.proto.Block other) {
      if (other == one.contentbox.boxd.proto.Block.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (txsBuilder_ == null) {
        if (!other.txs_.isEmpty()) {
          if (txs_.isEmpty()) {
            txs_ = other.txs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTxsIsMutable();
            txs_.addAll(other.txs_);
          }
          onChanged();
        }
      } else {
        if (!other.txs_.isEmpty()) {
          if (txsBuilder_.isEmpty()) {
            txsBuilder_.dispose();
            txsBuilder_ = null;
            txs_ = other.txs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            txsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTxsFieldBuilder() : null;
          } else {
            txsBuilder_.addAllMessages(other.txs_);
          }
        }
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.hasIrreversibleInfo()) {
        mergeIrreversibleInfo(other.getIrreversibleInfo());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      one.contentbox.boxd.proto.Block parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.proto.Block) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private one.contentbox.boxd.proto.BlockHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.proto.BlockHeader, one.contentbox.boxd.proto.BlockHeader.Builder, one.contentbox.boxd.proto.BlockHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public one.contentbox.boxd.proto.BlockHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? one.contentbox.boxd.proto.BlockHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public Builder setHeader(one.contentbox.boxd.proto.BlockHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public Builder setHeader(
        one.contentbox.boxd.proto.BlockHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public Builder mergeHeader(one.contentbox.boxd.proto.BlockHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            one.contentbox.boxd.proto.BlockHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public one.contentbox.boxd.proto.BlockHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    public one.contentbox.boxd.proto.BlockHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            one.contentbox.boxd.proto.BlockHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.corepb.BlockHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.proto.BlockHeader, one.contentbox.boxd.proto.BlockHeader.Builder, one.contentbox.boxd.proto.BlockHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            one.contentbox.boxd.proto.BlockHeader, one.contentbox.boxd.proto.BlockHeader.Builder, one.contentbox.boxd.proto.BlockHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<one.contentbox.boxd.proto.Transaction> txs_ =
      java.util.Collections.emptyList();
    private void ensureTxsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        txs_ = new java.util.ArrayList<one.contentbox.boxd.proto.Transaction>(txs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        one.contentbox.boxd.proto.Transaction, one.contentbox.boxd.proto.Transaction.Builder, one.contentbox.boxd.proto.TransactionOrBuilder> txsBuilder_;

    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public java.util.List<one.contentbox.boxd.proto.Transaction> getTxsList() {
      if (txsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(txs_);
      } else {
        return txsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public int getTxsCount() {
      if (txsBuilder_ == null) {
        return txs_.size();
      } else {
        return txsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public one.contentbox.boxd.proto.Transaction getTxs(int index) {
      if (txsBuilder_ == null) {
        return txs_.get(index);
      } else {
        return txsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder setTxs(
        int index, one.contentbox.boxd.proto.Transaction value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.set(index, value);
        onChanged();
      } else {
        txsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder setTxs(
        int index, one.contentbox.boxd.proto.Transaction.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.set(index, builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder addTxs(one.contentbox.boxd.proto.Transaction value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.add(value);
        onChanged();
      } else {
        txsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder addTxs(
        int index, one.contentbox.boxd.proto.Transaction value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxsIsMutable();
        txs_.add(index, value);
        onChanged();
      } else {
        txsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder addTxs(
        one.contentbox.boxd.proto.Transaction.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.add(builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder addTxs(
        int index, one.contentbox.boxd.proto.Transaction.Builder builderForValue) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.add(index, builderForValue.build());
        onChanged();
      } else {
        txsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder addAllTxs(
        java.lang.Iterable<? extends one.contentbox.boxd.proto.Transaction> values) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, txs_);
        onChanged();
      } else {
        txsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder clearTxs() {
      if (txsBuilder_ == null) {
        txs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        txsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public Builder removeTxs(int index) {
      if (txsBuilder_ == null) {
        ensureTxsIsMutable();
        txs_.remove(index);
        onChanged();
      } else {
        txsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public one.contentbox.boxd.proto.Transaction.Builder getTxsBuilder(
        int index) {
      return getTxsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public one.contentbox.boxd.proto.TransactionOrBuilder getTxsOrBuilder(
        int index) {
      if (txsBuilder_ == null) {
        return txs_.get(index);  } else {
        return txsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public java.util.List<? extends one.contentbox.boxd.proto.TransactionOrBuilder> 
         getTxsOrBuilderList() {
      if (txsBuilder_ != null) {
        return txsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(txs_);
      }
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public one.contentbox.boxd.proto.Transaction.Builder addTxsBuilder() {
      return getTxsFieldBuilder().addBuilder(
          one.contentbox.boxd.proto.Transaction.getDefaultInstance());
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public one.contentbox.boxd.proto.Transaction.Builder addTxsBuilder(
        int index) {
      return getTxsFieldBuilder().addBuilder(
          index, one.contentbox.boxd.proto.Transaction.getDefaultInstance());
    }
    /**
     * <code>repeated .corepb.Transaction txs = 2;</code>
     */
    public java.util.List<one.contentbox.boxd.proto.Transaction.Builder> 
         getTxsBuilderList() {
      return getTxsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        one.contentbox.boxd.proto.Transaction, one.contentbox.boxd.proto.Transaction.Builder, one.contentbox.boxd.proto.TransactionOrBuilder> 
        getTxsFieldBuilder() {
      if (txsBuilder_ == null) {
        txsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            one.contentbox.boxd.proto.Transaction, one.contentbox.boxd.proto.Transaction.Builder, one.contentbox.boxd.proto.TransactionOrBuilder>(
                txs_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        txs_ = null;
      }
      return txsBuilder_;
    }

    private int height_ ;
    /**
     * <code>uint32 height = 3;</code>
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <code>uint32 height = 3;</code>
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 height = 3;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 4;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 4;</code>
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 4;</code>
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private one.contentbox.boxd.proto.IrreversibleInfo irreversibleInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.proto.IrreversibleInfo, one.contentbox.boxd.proto.IrreversibleInfo.Builder, one.contentbox.boxd.proto.IrreversibleInfoOrBuilder> irreversibleInfoBuilder_;
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public boolean hasIrreversibleInfo() {
      return irreversibleInfoBuilder_ != null || irreversibleInfo_ != null;
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public one.contentbox.boxd.proto.IrreversibleInfo getIrreversibleInfo() {
      if (irreversibleInfoBuilder_ == null) {
        return irreversibleInfo_ == null ? one.contentbox.boxd.proto.IrreversibleInfo.getDefaultInstance() : irreversibleInfo_;
      } else {
        return irreversibleInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public Builder setIrreversibleInfo(one.contentbox.boxd.proto.IrreversibleInfo value) {
      if (irreversibleInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        irreversibleInfo_ = value;
        onChanged();
      } else {
        irreversibleInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public Builder setIrreversibleInfo(
        one.contentbox.boxd.proto.IrreversibleInfo.Builder builderForValue) {
      if (irreversibleInfoBuilder_ == null) {
        irreversibleInfo_ = builderForValue.build();
        onChanged();
      } else {
        irreversibleInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public Builder mergeIrreversibleInfo(one.contentbox.boxd.proto.IrreversibleInfo value) {
      if (irreversibleInfoBuilder_ == null) {
        if (irreversibleInfo_ != null) {
          irreversibleInfo_ =
            one.contentbox.boxd.proto.IrreversibleInfo.newBuilder(irreversibleInfo_).mergeFrom(value).buildPartial();
        } else {
          irreversibleInfo_ = value;
        }
        onChanged();
      } else {
        irreversibleInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public Builder clearIrreversibleInfo() {
      if (irreversibleInfoBuilder_ == null) {
        irreversibleInfo_ = null;
        onChanged();
      } else {
        irreversibleInfo_ = null;
        irreversibleInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public one.contentbox.boxd.proto.IrreversibleInfo.Builder getIrreversibleInfoBuilder() {
      
      onChanged();
      return getIrreversibleInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    public one.contentbox.boxd.proto.IrreversibleInfoOrBuilder getIrreversibleInfoOrBuilder() {
      if (irreversibleInfoBuilder_ != null) {
        return irreversibleInfoBuilder_.getMessageOrBuilder();
      } else {
        return irreversibleInfo_ == null ?
            one.contentbox.boxd.proto.IrreversibleInfo.getDefaultInstance() : irreversibleInfo_;
      }
    }
    /**
     * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.proto.IrreversibleInfo, one.contentbox.boxd.proto.IrreversibleInfo.Builder, one.contentbox.boxd.proto.IrreversibleInfoOrBuilder> 
        getIrreversibleInfoFieldBuilder() {
      if (irreversibleInfoBuilder_ == null) {
        irreversibleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            one.contentbox.boxd.proto.IrreversibleInfo, one.contentbox.boxd.proto.IrreversibleInfo.Builder, one.contentbox.boxd.proto.IrreversibleInfoOrBuilder>(
                getIrreversibleInfo(),
                getParentForChildren(),
                isClean());
        irreversibleInfo_ = null;
      }
      return irreversibleInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:corepb.Block)
  }

  // @@protoc_insertion_point(class_scope:corepb.Block)
  private static final one.contentbox.boxd.proto.Block DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.proto.Block();
  }

  public static one.contentbox.boxd.proto.Block getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Block>
      PARSER = new com.google.protobuf.AbstractParser<Block>() {
    public Block parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Block(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Block> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Block> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.proto.Block getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
