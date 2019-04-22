package one.contentbox.boxd.protocol.rpc.protobuf.generated;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The box control command service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: control.proto")
public final class ContorlCommandGrpc {

  private ContorlCommandGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.ContorlCommand";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<DebugLevelRequest,
          BaseResponse> METHOD_SET_DEBUG_LEVEL =
      io.grpc.MethodDescriptor.<DebugLevelRequest, BaseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "SetDebugLevel"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              DebugLevelRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              BaseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<UpdateNetworkIDRequest,
          BaseResponse> METHOD_UPDATE_NETWORK_ID =
      io.grpc.MethodDescriptor.<UpdateNetworkIDRequest, BaseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "UpdateNetworkID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UpdateNetworkIDRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              BaseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetNetworkIDRequest,
          GetNetworkIDResponse> METHOD_GET_NETWORK_ID =
      io.grpc.MethodDescriptor.<GetNetworkIDRequest, GetNetworkIDResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetNetworkID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetNetworkIDRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetNetworkIDResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AddNodeRequest,
          BaseResponse> METHOD_ADD_NODE =
      io.grpc.MethodDescriptor.<AddNodeRequest, BaseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "AddNode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AddNodeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              BaseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetBlockHeightRequest,
          GetBlockHeightResponse> METHOD_GET_BLOCK_HEIGHT =
      io.grpc.MethodDescriptor.<GetBlockHeightRequest, GetBlockHeightResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHeight"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockHeightRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockHeightResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetBlockHashRequest,
          GetBlockHashResponse> METHOD_GET_BLOCK_HASH =
      io.grpc.MethodDescriptor.<GetBlockHashRequest, GetBlockHashResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHash"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockHashRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockHashResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetBlockRequest,
          GetBlockHeaderResponse> METHOD_GET_BLOCK_HEADER =
      io.grpc.MethodDescriptor.<GetBlockRequest, GetBlockHeaderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHeader"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockHeaderResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetBlockRequest,
          GetBlockResponse> METHOD_GET_BLOCK =
      io.grpc.MethodDescriptor.<GetBlockRequest, GetBlockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBlockResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetNodeInfoRequest,
          GetNodeInfoResponse> METHOD_GET_NODE_INFO =
      io.grpc.MethodDescriptor.<GetNodeInfoRequest, GetNodeInfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetNodeInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetNodeInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetNodeInfoResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContorlCommandStub newStub(io.grpc.Channel channel) {
    return new ContorlCommandStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContorlCommandBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContorlCommandBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContorlCommandFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContorlCommandFutureStub(channel);
  }

  /**
   * <pre>
   * The box control command service definition.
   * </pre>
   */
  public static abstract class ContorlCommandImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc SetDebugLevel (DebugLevelRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/debuglevel"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void setDebugLevel(DebugLevelRequest request,
                              io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEBUG_LEVEL, responseObserver);
    }

    /**
     * <pre>
     *    rpc UpdateNetworkID (UpdateNetworkIDRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/networkid"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void updateNetworkID(UpdateNetworkIDRequest request,
                                io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NETWORK_ID, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetNetworkID (GetNetworkIDRequest) returns (GetNetworkIDResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnetwork"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getNetworkID(GetNetworkIDRequest request,
                             io.grpc.stub.StreamObserver<GetNetworkIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NETWORK_ID, responseObserver);
    }

    /**
     * <pre>
     *    rpc AddNode (AddNodeRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/addnode"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void addNode(AddNodeRequest request,
                        io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_NODE, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHeight (GetBlockHeightRequest) returns (GetBlockHeightResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheight"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHeight(GetBlockHeightRequest request,
                               io.grpc.stub.StreamObserver<GetBlockHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOCK_HEIGHT, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHash (GetBlockHashRequest) returns (GetBlockHashResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockhash"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHash(GetBlockHashRequest request,
                             io.grpc.stub.StreamObserver<GetBlockHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOCK_HASH, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHeader (GetBlockRequest) returns (GetBlockHeaderResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheader"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHeader(GetBlockRequest request,
                               io.grpc.stub.StreamObserver<GetBlockHeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOCK_HEADER, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlock (GetBlockRequest) returns (GetBlockResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblock"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlock(GetBlockRequest request,
                         io.grpc.stub.StreamObserver<GetBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOCK, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetNodeInfo (GetNodeInfoRequest) returns (GetNodeInfoResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnodeinfo"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getNodeInfo(GetNodeInfoRequest request,
                            io.grpc.stub.StreamObserver<GetNodeInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODE_INFO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SET_DEBUG_LEVEL,
            asyncUnaryCall(
              new MethodHandlers<
                      DebugLevelRequest,
                      BaseResponse>(
                  this, METHODID_SET_DEBUG_LEVEL)))
          .addMethod(
            METHOD_UPDATE_NETWORK_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      UpdateNetworkIDRequest,
                      BaseResponse>(
                  this, METHODID_UPDATE_NETWORK_ID)))
          .addMethod(
            METHOD_GET_NETWORK_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      GetNetworkIDRequest,
                      GetNetworkIDResponse>(
                  this, METHODID_GET_NETWORK_ID)))
          .addMethod(
            METHOD_ADD_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                      AddNodeRequest,
                      BaseResponse>(
                  this, METHODID_ADD_NODE)))
          .addMethod(
            METHOD_GET_BLOCK_HEIGHT,
            asyncUnaryCall(
              new MethodHandlers<
                      GetBlockHeightRequest,
                      GetBlockHeightResponse>(
                  this, METHODID_GET_BLOCK_HEIGHT)))
          .addMethod(
            METHOD_GET_BLOCK_HASH,
            asyncUnaryCall(
              new MethodHandlers<
                      GetBlockHashRequest,
                      GetBlockHashResponse>(
                  this, METHODID_GET_BLOCK_HASH)))
          .addMethod(
            METHOD_GET_BLOCK_HEADER,
            asyncUnaryCall(
              new MethodHandlers<
                      GetBlockRequest,
                      GetBlockHeaderResponse>(
                  this, METHODID_GET_BLOCK_HEADER)))
          .addMethod(
            METHOD_GET_BLOCK,
            asyncUnaryCall(
              new MethodHandlers<
                      GetBlockRequest,
                      GetBlockResponse>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            METHOD_GET_NODE_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                      GetNodeInfoRequest,
                      GetNodeInfoResponse>(
                  this, METHODID_GET_NODE_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * The box control command service definition.
   * </pre>
   */
  public static final class ContorlCommandStub extends io.grpc.stub.AbstractStub<ContorlCommandStub> {
    private ContorlCommandStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContorlCommandStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContorlCommandStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc SetDebugLevel (DebugLevelRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/debuglevel"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void setDebugLevel(DebugLevelRequest request,
                              io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEBUG_LEVEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc UpdateNetworkID (UpdateNetworkIDRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/networkid"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void updateNetworkID(UpdateNetworkIDRequest request,
                                io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NETWORK_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetNetworkID (GetNetworkIDRequest) returns (GetNetworkIDResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnetwork"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getNetworkID(GetNetworkIDRequest request,
                             io.grpc.stub.StreamObserver<GetNetworkIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NETWORK_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc AddNode (AddNodeRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/addnode"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void addNode(AddNodeRequest request,
                        io.grpc.stub.StreamObserver<BaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHeight (GetBlockHeightRequest) returns (GetBlockHeightResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheight"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHeight(GetBlockHeightRequest request,
                               io.grpc.stub.StreamObserver<GetBlockHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HEIGHT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHash (GetBlockHashRequest) returns (GetBlockHashResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockhash"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHash(GetBlockHashRequest request,
                             io.grpc.stub.StreamObserver<GetBlockHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HASH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlockHeader (GetBlockRequest) returns (GetBlockHeaderResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheader"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlockHeader(GetBlockRequest request,
                               io.grpc.stub.StreamObserver<GetBlockHeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HEADER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetBlock (GetBlockRequest) returns (GetBlockResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblock"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public void getBlock(GetBlockRequest request,
                         io.grpc.stub.StreamObserver<GetBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetNodeInfo (GetNodeInfoRequest) returns (GetNodeInfoResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnodeinfo"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getNodeInfo(GetNodeInfoRequest request,
                            io.grpc.stub.StreamObserver<GetNodeInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The box control command service definition.
   * </pre>
   */
  public static final class ContorlCommandBlockingStub extends io.grpc.stub.AbstractStub<ContorlCommandBlockingStub> {
    private ContorlCommandBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContorlCommandBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContorlCommandBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc SetDebugLevel (DebugLevelRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/debuglevel"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public BaseResponse setDebugLevel(DebugLevelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEBUG_LEVEL, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc UpdateNetworkID (UpdateNetworkIDRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/networkid"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public BaseResponse updateNetworkID(UpdateNetworkIDRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NETWORK_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetNetworkID (GetNetworkIDRequest) returns (GetNetworkIDResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnetwork"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetNetworkIDResponse getNetworkID(GetNetworkIDRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NETWORK_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc AddNode (AddNodeRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/addnode"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public BaseResponse addNode(AddNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHeight (GetBlockHeightRequest) returns (GetBlockHeightResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheight"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public GetBlockHeightResponse getBlockHeight(GetBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOCK_HEIGHT, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHash (GetBlockHashRequest) returns (GetBlockHashResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockhash"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public GetBlockHashResponse getBlockHash(GetBlockHashRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOCK_HASH, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHeader (GetBlockRequest) returns (GetBlockHeaderResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheader"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public GetBlockHeaderResponse getBlockHeader(GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOCK_HEADER, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetBlock (GetBlockRequest) returns (GetBlockResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblock"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public GetBlockResponse getBlock(GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOCK, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetNodeInfo (GetNodeInfoRequest) returns (GetNodeInfoResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnodeinfo"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetNodeInfoResponse getNodeInfo(GetNodeInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NODE_INFO, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The box control command service definition.
   * </pre>
   */
  public static final class ContorlCommandFutureStub extends io.grpc.stub.AbstractStub<ContorlCommandFutureStub> {
    private ContorlCommandFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContorlCommandFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContorlCommandFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc SetDebugLevel (DebugLevelRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/debuglevel"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BaseResponse> setDebugLevel(
        DebugLevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEBUG_LEVEL, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc UpdateNetworkID (UpdateNetworkIDRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/networkid"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BaseResponse> updateNetworkID(
        UpdateNetworkIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NETWORK_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetNetworkID (GetNetworkIDRequest) returns (GetNetworkIDResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnetwork"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetNetworkIDResponse> getNetworkID(
        GetNetworkIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NETWORK_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc AddNode (AddNodeRequest) returns (BaseResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/addnode"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BaseResponse> addNode(
        AddNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHeight (GetBlockHeightRequest) returns (GetBlockHeightResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheight"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBlockHeightResponse> getBlockHeight(
        GetBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HEIGHT, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHash (GetBlockHashRequest) returns (GetBlockHashResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockhash"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBlockHashResponse> getBlockHash(
        GetBlockHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HASH, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetBlockHeader (GetBlockRequest) returns (GetBlockHeaderResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblockheader"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBlockHeaderResponse> getBlockHeader(
        GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK_HEADER, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetBlock (GetBlockRequest) returns (GetBlockResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getblock"
     *            body: "*"
     *      };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBlockResponse> getBlock(
        GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetNodeInfo (GetNodeInfoRequest) returns (GetNodeInfoResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnodeinfo"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetNodeInfoResponse> getNodeInfo(
        GetNodeInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_DEBUG_LEVEL = 0;
  private static final int METHODID_UPDATE_NETWORK_ID = 1;
  private static final int METHODID_GET_NETWORK_ID = 2;
  private static final int METHODID_ADD_NODE = 3;
  private static final int METHODID_GET_BLOCK_HEIGHT = 4;
  private static final int METHODID_GET_BLOCK_HASH = 5;
  private static final int METHODID_GET_BLOCK_HEADER = 6;
  private static final int METHODID_GET_BLOCK = 7;
  private static final int METHODID_GET_NODE_INFO = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContorlCommandImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContorlCommandImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_DEBUG_LEVEL:
          serviceImpl.setDebugLevel((DebugLevelRequest) request,
              (io.grpc.stub.StreamObserver<BaseResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK_ID:
          serviceImpl.updateNetworkID((UpdateNetworkIDRequest) request,
              (io.grpc.stub.StreamObserver<BaseResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_ID:
          serviceImpl.getNetworkID((GetNetworkIDRequest) request,
              (io.grpc.stub.StreamObserver<GetNetworkIDResponse>) responseObserver);
          break;
        case METHODID_ADD_NODE:
          serviceImpl.addNode((AddNodeRequest) request,
              (io.grpc.stub.StreamObserver<BaseResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEIGHT:
          serviceImpl.getBlockHeight((GetBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<GetBlockHeightResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HASH:
          serviceImpl.getBlockHash((GetBlockHashRequest) request,
              (io.grpc.stub.StreamObserver<GetBlockHashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEADER:
          serviceImpl.getBlockHeader((GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<GetBlockHeaderResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<GetBlockResponse>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((GetNodeInfoRequest) request,
              (io.grpc.stub.StreamObserver<GetNodeInfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ContorlCommandDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ControlProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ContorlCommandGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContorlCommandDescriptorSupplier())
              .addMethod(METHOD_SET_DEBUG_LEVEL)
              .addMethod(METHOD_UPDATE_NETWORK_ID)
              .addMethod(METHOD_GET_NETWORK_ID)
              .addMethod(METHOD_ADD_NODE)
              .addMethod(METHOD_GET_BLOCK_HEIGHT)
              .addMethod(METHOD_GET_BLOCK_HASH)
              .addMethod(METHOD_GET_BLOCK_HEADER)
              .addMethod(METHOD_GET_BLOCK)
              .addMethod(METHOD_GET_NODE_INFO)
              .build();
        }
      }
    }
    return result;
  }
}
