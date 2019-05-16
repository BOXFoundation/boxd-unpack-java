// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: control.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.GetBlockResponse}
 */
public  final class GetBlockResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.GetBlockResponse)
    GetBlockResponseOrBuilder {
  // Use GetBlockResponse.newBuilder() to construct.
  private GetBlockResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBlockResponse() {
    code_ = 0;
    message_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetBlockResponse(
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
          case 8: {

            code_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            Block.Builder subBuilder = null;
            if (block_ != null) {
              subBuilder = block_.toBuilder();
            }
            block_ = input.readMessage(Block.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(block_);
              block_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ControlProto.internal_static_rpcpb_GetBlockResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ControlProto.internal_static_rpcpb_GetBlockResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetBlockResponse.class, Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>int32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOCK_FIELD_NUMBER = 3;
  private Block block_;
  /**
   * <code>.corepb.Block block = 3;</code>
   */
  public boolean hasBlock() {
    return block_ != null;
  }
  /**
   * <code>.corepb.Block block = 3;</code>
   */
  public Block getBlock() {
    return block_ == null ? Block.getDefaultInstance() : block_;
  }
  /**
   * <code>.corepb.Block block = 3;</code>
   */
  public BlockOrBuilder getBlockOrBuilder() {
    return getBlock();
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (block_ != null) {
      output.writeMessage(3, getBlock());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (block_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBlock());
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
    if (!(obj instanceof GetBlockResponse)) {
      return super.equals(obj);
    }
    GetBlockResponse other = (GetBlockResponse) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (hasBlock() == other.hasBlock());
    if (hasBlock()) {
      result = result && getBlock()
          .equals(other.getBlock());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasBlock()) {
      hash = (37 * hash) + BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getBlock().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetBlockResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetBlockResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetBlockResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetBlockResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetBlockResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetBlockResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetBlockResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetBlockResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetBlockResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetBlockResponse parseFrom(
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
  public static Builder newBuilder(GetBlockResponse prototype) {
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
   * Protobuf type {@code rpcpb.GetBlockResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.GetBlockResponse)
      GetBlockResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ControlProto.internal_static_rpcpb_GetBlockResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ControlProto.internal_static_rpcpb_GetBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetBlockResponse.class, Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse.newBuilder()
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
      code_ = 0;

      message_ = "";

      if (blockBuilder_ == null) {
        block_ = null;
      } else {
        block_ = null;
        blockBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ControlProto.internal_static_rpcpb_GetBlockResponse_descriptor;
    }

    public GetBlockResponse getDefaultInstanceForType() {
      return GetBlockResponse.getDefaultInstance();
    }

    public GetBlockResponse build() {
      GetBlockResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GetBlockResponse buildPartial() {
      GetBlockResponse result = new GetBlockResponse(this);
      result.code_ = code_;
      result.message_ = message_;
      if (blockBuilder_ == null) {
        result.block_ = block_;
      } else {
        result.block_ = blockBuilder_.build();
      }
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
      if (other instanceof GetBlockResponse) {
        return mergeFrom((GetBlockResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetBlockResponse other) {
      if (other == GetBlockResponse.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasBlock()) {
        mergeBlock(other.getBlock());
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
      GetBlockResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetBlockResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ ;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private Block block_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Block, Block.Builder, BlockOrBuilder> blockBuilder_;
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public boolean hasBlock() {
      return blockBuilder_ != null || block_ != null;
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Block getBlock() {
      if (blockBuilder_ == null) {
        return block_ == null ? Block.getDefaultInstance() : block_;
      } else {
        return blockBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Builder setBlock(Block value) {
      if (blockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        block_ = value;
        onChanged();
      } else {
        blockBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Builder setBlock(
        Block.Builder builderForValue) {
      if (blockBuilder_ == null) {
        block_ = builderForValue.build();
        onChanged();
      } else {
        blockBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Builder mergeBlock(Block value) {
      if (blockBuilder_ == null) {
        if (block_ != null) {
          block_ =
            Block.newBuilder(block_).mergeFrom(value).buildPartial();
        } else {
          block_ = value;
        }
        onChanged();
      } else {
        blockBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Builder clearBlock() {
      if (blockBuilder_ == null) {
        block_ = null;
        onChanged();
      } else {
        block_ = null;
        blockBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public Block.Builder getBlockBuilder() {
      
      onChanged();
      return getBlockFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    public BlockOrBuilder getBlockOrBuilder() {
      if (blockBuilder_ != null) {
        return blockBuilder_.getMessageOrBuilder();
      } else {
        return block_ == null ?
            Block.getDefaultInstance() : block_;
      }
    }
    /**
     * <code>.corepb.Block block = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Block, Block.Builder, BlockOrBuilder>
        getBlockFieldBuilder() {
      if (blockBuilder_ == null) {
        blockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Block, Block.Builder, BlockOrBuilder>(
                getBlock(),
                getParentForChildren(),
                isClean());
        block_ = null;
      }
      return blockBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:rpcpb.GetBlockResponse)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.GetBlockResponse)
  private static final GetBlockResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetBlockResponse();
  }

  public static GetBlockResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBlockResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBlockResponse>() {
    public GetBlockResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlockResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBlockResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetBlockResponse> getParserForType() {
    return PARSER;
  }

  public GetBlockResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

