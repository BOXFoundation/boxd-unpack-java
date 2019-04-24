// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code corepb.UtxoWrap}
 */
public  final class UtxoWrap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:corepb.UtxoWrap)
    UtxoWrapOrBuilder {
  // Use UtxoWrap.newBuilder() to construct.
  private UtxoWrap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtxoWrap() {
    blockHeight_ = 0;
    isSpent_ = false;
    isCoinbase_ = false;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UtxoWrap(
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
            TxOut.Builder subBuilder = null;
            if (output_ != null) {
              subBuilder = output_.toBuilder();
            }
            output_ = input.readMessage(TxOut.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(output_);
              output_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            blockHeight_ = input.readUInt32();
            break;
          }
          case 24: {

            isSpent_ = input.readBool();
            break;
          }
          case 32: {

            isCoinbase_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BlockProto.internal_static_corepb_UtxoWrap_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BlockProto.internal_static_corepb_UtxoWrap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UtxoWrap.class, Builder.class);
  }

  public static final int OUTPUT_FIELD_NUMBER = 1;
  private TxOut output_;
  /**
   * <code>.corepb.TxOut output = 1;</code>
   */
  public boolean hasOutput() {
    return output_ != null;
  }
  /**
   * <code>.corepb.TxOut output = 1;</code>
   */
  public TxOut getOutput() {
    return output_ == null ? TxOut.getDefaultInstance() : output_;
  }
  /**
   * <code>.corepb.TxOut output = 1;</code>
   */
  public TxOutOrBuilder getOutputOrBuilder() {
    return getOutput();
  }

  public static final int BLOCK_HEIGHT_FIELD_NUMBER = 2;
  private int blockHeight_;
  /**
   * <code>uint32 block_height = 2;</code>
   */
  public int getBlockHeight() {
    return blockHeight_;
  }

  public static final int IS_SPENT_FIELD_NUMBER = 3;
  private boolean isSpent_;
  /**
   * <code>bool is_spent = 3;</code>
   */
  public boolean getIsSpent() {
    return isSpent_;
  }

  public static final int IS_COINBASE_FIELD_NUMBER = 4;
  private boolean isCoinbase_;
  /**
   * <code>bool is_coinbase = 4;</code>
   */
  public boolean getIsCoinbase() {
    return isCoinbase_;
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
    if (output_ != null) {
      output.writeMessage(1, getOutput());
    }
    if (blockHeight_ != 0) {
      output.writeUInt32(2, blockHeight_);
    }
    if (isSpent_ != false) {
      output.writeBool(3, isSpent_);
    }
    if (isCoinbase_ != false) {
      output.writeBool(4, isCoinbase_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (output_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOutput());
    }
    if (blockHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, blockHeight_);
    }
    if (isSpent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isSpent_);
    }
    if (isCoinbase_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isCoinbase_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UtxoWrap)) {
      return super.equals(obj);
    }
    UtxoWrap other = (UtxoWrap) obj;

    boolean result = true;
    result = result && (hasOutput() == other.hasOutput());
    if (hasOutput()) {
      result = result && getOutput()
          .equals(other.getOutput());
    }
    result = result && (getBlockHeight()
        == other.getBlockHeight());
    result = result && (getIsSpent()
        == other.getIsSpent());
    result = result && (getIsCoinbase()
        == other.getIsCoinbase());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOutput()) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutput().hashCode();
    }
    hash = (37 * hash) + BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getBlockHeight();
    hash = (37 * hash) + IS_SPENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSpent());
    hash = (37 * hash) + IS_COINBASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCoinbase());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UtxoWrap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UtxoWrap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UtxoWrap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UtxoWrap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UtxoWrap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UtxoWrap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UtxoWrap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UtxoWrap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UtxoWrap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UtxoWrap parseFrom(
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
  public static Builder newBuilder(UtxoWrap prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code corepb.UtxoWrap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:corepb.UtxoWrap)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.UtxoWrapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BlockProto.internal_static_corepb_UtxoWrap_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BlockProto.internal_static_corepb_UtxoWrap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UtxoWrap.class, Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.UtxoWrap.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (outputBuilder_ == null) {
        output_ = null;
      } else {
        output_ = null;
        outputBuilder_ = null;
      }
      blockHeight_ = 0;

      isSpent_ = false;

      isCoinbase_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BlockProto.internal_static_corepb_UtxoWrap_descriptor;
    }

    public UtxoWrap getDefaultInstanceForType() {
      return UtxoWrap.getDefaultInstance();
    }

    public UtxoWrap build() {
      UtxoWrap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UtxoWrap buildPartial() {
      UtxoWrap result = new UtxoWrap(this);
      if (outputBuilder_ == null) {
        result.output_ = output_;
      } else {
        result.output_ = outputBuilder_.build();
      }
      result.blockHeight_ = blockHeight_;
      result.isSpent_ = isSpent_;
      result.isCoinbase_ = isCoinbase_;
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
      if (other instanceof UtxoWrap) {
        return mergeFrom((UtxoWrap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UtxoWrap other) {
      if (other == UtxoWrap.getDefaultInstance()) return this;
      if (other.hasOutput()) {
        mergeOutput(other.getOutput());
      }
      if (other.getBlockHeight() != 0) {
        setBlockHeight(other.getBlockHeight());
      }
      if (other.getIsSpent() != false) {
        setIsSpent(other.getIsSpent());
      }
      if (other.getIsCoinbase() != false) {
        setIsCoinbase(other.getIsCoinbase());
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
      UtxoWrap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UtxoWrap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private TxOut output_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        TxOut, TxOut.Builder, TxOutOrBuilder> outputBuilder_;
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public boolean hasOutput() {
      return outputBuilder_ != null || output_ != null;
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public TxOut getOutput() {
      if (outputBuilder_ == null) {
        return output_ == null ? TxOut.getDefaultInstance() : output_;
      } else {
        return outputBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public Builder setOutput(TxOut value) {
      if (outputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        output_ = value;
        onChanged();
      } else {
        outputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public Builder setOutput(
        TxOut.Builder builderForValue) {
      if (outputBuilder_ == null) {
        output_ = builderForValue.build();
        onChanged();
      } else {
        outputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public Builder mergeOutput(TxOut value) {
      if (outputBuilder_ == null) {
        if (output_ != null) {
          output_ =
            TxOut.newBuilder(output_).mergeFrom(value).buildPartial();
        } else {
          output_ = value;
        }
        onChanged();
      } else {
        outputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public Builder clearOutput() {
      if (outputBuilder_ == null) {
        output_ = null;
        onChanged();
      } else {
        output_ = null;
        outputBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public TxOut.Builder getOutputBuilder() {
      
      onChanged();
      return getOutputFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    public TxOutOrBuilder getOutputOrBuilder() {
      if (outputBuilder_ != null) {
        return outputBuilder_.getMessageOrBuilder();
      } else {
        return output_ == null ?
            TxOut.getDefaultInstance() : output_;
      }
    }
    /**
     * <code>.corepb.TxOut output = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TxOut, TxOut.Builder, TxOutOrBuilder>
        getOutputFieldBuilder() {
      if (outputBuilder_ == null) {
        outputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TxOut, TxOut.Builder, TxOutOrBuilder>(
                getOutput(),
                getParentForChildren(),
                isClean());
        output_ = null;
      }
      return outputBuilder_;
    }

    private int blockHeight_ ;
    /**
     * <code>uint32 block_height = 2;</code>
     */
    public int getBlockHeight() {
      return blockHeight_;
    }
    /**
     * <code>uint32 block_height = 2;</code>
     */
    public Builder setBlockHeight(int value) {
      
      blockHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 block_height = 2;</code>
     */
    public Builder clearBlockHeight() {
      
      blockHeight_ = 0;
      onChanged();
      return this;
    }

    private boolean isSpent_ ;
    /**
     * <code>bool is_spent = 3;</code>
     */
    public boolean getIsSpent() {
      return isSpent_;
    }
    /**
     * <code>bool is_spent = 3;</code>
     */
    public Builder setIsSpent(boolean value) {
      
      isSpent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_spent = 3;</code>
     */
    public Builder clearIsSpent() {
      
      isSpent_ = false;
      onChanged();
      return this;
    }

    private boolean isCoinbase_ ;
    /**
     * <code>bool is_coinbase = 4;</code>
     */
    public boolean getIsCoinbase() {
      return isCoinbase_;
    }
    /**
     * <code>bool is_coinbase = 4;</code>
     */
    public Builder setIsCoinbase(boolean value) {
      
      isCoinbase_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_coinbase = 4;</code>
     */
    public Builder clearIsCoinbase() {
      
      isCoinbase_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:corepb.UtxoWrap)
  }

  // @@protoc_insertion_point(class_scope:corepb.UtxoWrap)
  private static final UtxoWrap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UtxoWrap();
  }

  public static UtxoWrap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtxoWrap>
      PARSER = new com.google.protobuf.AbstractParser<UtxoWrap>() {
    public UtxoWrap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UtxoWrap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UtxoWrap> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UtxoWrap> getParserForType() {
    return PARSER;
  }

  public UtxoWrap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

