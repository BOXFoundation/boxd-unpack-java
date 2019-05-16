// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.FetchUtxosReq}
 */
public  final class FetchUtxosReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.FetchUtxosReq)
    FetchUtxosReqOrBuilder {
  // Use FetchUtxosReq.newBuilder() to construct.
  private FetchUtxosReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchUtxosReq() {
    addr_ = "";
    amount_ = 0L;
    tokenHash_ = "";
    tokenIndex_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FetchUtxosReq(
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
            String s = input.readStringRequireUtf8();

            addr_ = s;
            break;
          }
          case 16: {

            amount_ = input.readUInt64();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            tokenHash_ = s;
            break;
          }
          case 32: {

            tokenIndex_ = input.readUInt32();
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
    return TransactionProto.internal_static_rpcpb_FetchUtxosReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TransactionProto.internal_static_rpcpb_FetchUtxosReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FetchUtxosReq.class, Builder.class);
  }

  public static final int ADDR_FIELD_NUMBER = 1;
  private volatile Object addr_;
  /**
   * <code>string addr = 1;</code>
   */
  public String getAddr() {
    Object ref = addr_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      addr_ = s;
      return s;
    }
  }
  /**
   * <code>string addr = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddrBytes() {
    Object ref = addr_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      addr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private long amount_;
  /**
   * <code>uint64 amount = 2;</code>
   */
  public long getAmount() {
    return amount_;
  }

  public static final int TOKEN_HASH_FIELD_NUMBER = 3;
  private volatile Object tokenHash_;
  /**
   * <code>string token_hash = 3;</code>
   */
  public String getTokenHash() {
    Object ref = tokenHash_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tokenHash_ = s;
      return s;
    }
  }
  /**
   * <code>string token_hash = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTokenHashBytes() {
    Object ref = tokenHash_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tokenHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_INDEX_FIELD_NUMBER = 4;
  private int tokenIndex_;
  /**
   * <code>uint32 token_index = 4;</code>
   */
  public int getTokenIndex() {
    return tokenIndex_;
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
    if (!getAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addr_);
    }
    if (amount_ != 0L) {
      output.writeUInt64(2, amount_);
    }
    if (!getTokenHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tokenHash_);
    }
    if (tokenIndex_ != 0) {
      output.writeUInt32(4, tokenIndex_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addr_);
    }
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, amount_);
    }
    if (!getTokenHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tokenHash_);
    }
    if (tokenIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, tokenIndex_);
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
    if (!(obj instanceof FetchUtxosReq)) {
      return super.equals(obj);
    }
    FetchUtxosReq other = (FetchUtxosReq) obj;

    boolean result = true;
    result = result && getAddr()
        .equals(other.getAddr());
    result = result && (getAmount()
        == other.getAmount());
    result = result && getTokenHash()
        .equals(other.getTokenHash());
    result = result && (getTokenIndex()
        == other.getTokenIndex());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getAddr().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (37 * hash) + TOKEN_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getTokenHash().hashCode();
    hash = (37 * hash) + TOKEN_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getTokenIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FetchUtxosReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FetchUtxosReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FetchUtxosReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FetchUtxosReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FetchUtxosReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FetchUtxosReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FetchUtxosReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FetchUtxosReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FetchUtxosReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FetchUtxosReq parseFrom(
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
  public static Builder newBuilder(FetchUtxosReq prototype) {
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
   * Protobuf type {@code rpcpb.FetchUtxosReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.FetchUtxosReq)
      FetchUtxosReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TransactionProto.internal_static_rpcpb_FetchUtxosReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TransactionProto.internal_static_rpcpb_FetchUtxosReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FetchUtxosReq.class, Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq.newBuilder()
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
      addr_ = "";

      amount_ = 0L;

      tokenHash_ = "";

      tokenIndex_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TransactionProto.internal_static_rpcpb_FetchUtxosReq_descriptor;
    }

    public FetchUtxosReq getDefaultInstanceForType() {
      return FetchUtxosReq.getDefaultInstance();
    }

    public FetchUtxosReq build() {
      FetchUtxosReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FetchUtxosReq buildPartial() {
      FetchUtxosReq result = new FetchUtxosReq(this);
      result.addr_ = addr_;
      result.amount_ = amount_;
      result.tokenHash_ = tokenHash_;
      result.tokenIndex_ = tokenIndex_;
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
      if (other instanceof FetchUtxosReq) {
        return mergeFrom((FetchUtxosReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FetchUtxosReq other) {
      if (other == FetchUtxosReq.getDefaultInstance()) return this;
      if (!other.getAddr().isEmpty()) {
        addr_ = other.addr_;
        onChanged();
      }
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (!other.getTokenHash().isEmpty()) {
        tokenHash_ = other.tokenHash_;
        onChanged();
      }
      if (other.getTokenIndex() != 0) {
        setTokenIndex(other.getTokenIndex());
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
      FetchUtxosReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FetchUtxosReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object addr_ = "";
    /**
     * <code>string addr = 1;</code>
     */
    public String getAddr() {
      Object ref = addr_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        addr_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string addr = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddrBytes() {
      Object ref = addr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        addr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addr = 1;</code>
     */
    public Builder setAddr(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string addr = 1;</code>
     */
    public Builder clearAddr() {
      
      addr_ = getDefaultInstance().getAddr();
      onChanged();
      return this;
    }
    /**
     * <code>string addr = 1;</code>
     */
    public Builder setAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addr_ = value;
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <code>uint64 amount = 2;</code>
     */
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>uint64 amount = 2;</code>
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private Object tokenHash_ = "";
    /**
     * <code>string token_hash = 3;</code>
     */
    public String getTokenHash() {
      Object ref = tokenHash_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tokenHash_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string token_hash = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTokenHashBytes() {
      Object ref = tokenHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tokenHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_hash = 3;</code>
     */
    public Builder setTokenHash(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tokenHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token_hash = 3;</code>
     */
    public Builder clearTokenHash() {
      
      tokenHash_ = getDefaultInstance().getTokenHash();
      onChanged();
      return this;
    }
    /**
     * <code>string token_hash = 3;</code>
     */
    public Builder setTokenHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tokenHash_ = value;
      onChanged();
      return this;
    }

    private int tokenIndex_ ;
    /**
     * <code>uint32 token_index = 4;</code>
     */
    public int getTokenIndex() {
      return tokenIndex_;
    }
    /**
     * <code>uint32 token_index = 4;</code>
     */
    public Builder setTokenIndex(int value) {
      
      tokenIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 token_index = 4;</code>
     */
    public Builder clearTokenIndex() {
      
      tokenIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.FetchUtxosReq)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.FetchUtxosReq)
  private static final FetchUtxosReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FetchUtxosReq();
  }

  public static FetchUtxosReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchUtxosReq>
      PARSER = new com.google.protobuf.AbstractParser<FetchUtxosReq>() {
    public FetchUtxosReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FetchUtxosReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchUtxosReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FetchUtxosReq> getParserForType() {
    return PARSER;
  }

  public FetchUtxosReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

