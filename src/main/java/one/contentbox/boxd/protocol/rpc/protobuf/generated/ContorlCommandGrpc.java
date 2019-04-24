package one.contentbox.boxd.protocol.rpc.protobuf.generated;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

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
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse> METHOD_GET_NETWORK_ID =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetNetworkID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AddNodeRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse> METHOD_ADD_NODE =
      io.grpc.MethodDescriptor.<AddNodeRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "AddNode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AddNodeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse> METHOD_GET_BLOCK_HEIGHT =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHeight"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse> METHOD_GET_BLOCK_HASH =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHash"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse> METHOD_GET_BLOCK_HEADER =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlockHeader"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse> METHOD_GET_BLOCK =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetBlock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse> METHOD_GET_NODE_INFO =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.ContorlCommand", "GetNodeInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse.getDefaultInstance()))
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
     *    rpc GetNetworkID (GetNetworkIDRequest) returns (GetNetworkIDResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/ctl/getnetwork"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getNetworkID(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse> responseObserver) {
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
                        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse> responseObserver) {
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
    public void getBlockHeight(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse> responseObserver) {
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
    public void getBlockHash(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse> responseObserver) {
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
    public void getBlockHeader(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse> responseObserver) {
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
    public void getBlock(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse> responseObserver) {
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
    public void getNodeInfo(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODE_INFO, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_NETWORK_ID,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse>(
                  this, METHODID_GET_NETWORK_ID)))
          .addMethod(
            METHOD_ADD_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                AddNodeRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse>(
                  this, METHODID_ADD_NODE)))
          .addMethod(
            METHOD_GET_BLOCK_HEIGHT,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse>(
                  this, METHODID_GET_BLOCK_HEIGHT)))
          .addMethod(
            METHOD_GET_BLOCK_HASH,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse>(
                  this, METHODID_GET_BLOCK_HASH)))
          .addMethod(
            METHOD_GET_BLOCK_HEADER,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse>(
                  this, METHODID_GET_BLOCK_HEADER)))
          .addMethod(
            METHOD_GET_BLOCK,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            METHOD_GET_NODE_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse>(
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

    @Override
    protected ContorlCommandStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandStub(channel, callOptions);
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
    public void getNetworkID(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse> responseObserver) {
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
                        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse> responseObserver) {
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
    public void getBlockHeight(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse> responseObserver) {
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
    public void getBlockHash(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse> responseObserver) {
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
    public void getBlockHeader(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse> responseObserver) {
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
    public void getBlock(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse> responseObserver) {
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
    public void getNodeInfo(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse> responseObserver) {
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

    @Override
    protected ContorlCommandBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandBlockingStub(channel, callOptions);
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse getNetworkID(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse addNode(AddNodeRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse getBlockHeight(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse getBlockHash(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse getBlockHeader(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse getBlock(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse getNodeInfo(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest request) {
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

    @Override
    protected ContorlCommandFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContorlCommandFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse> getNetworkID(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse> addNode(
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse> getBlockHeight(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse> getBlockHash(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse> getBlockHeader(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse> getBlock(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse> getNodeInfo(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NETWORK_ID = 0;
  private static final int METHODID_ADD_NODE = 1;
  private static final int METHODID_GET_BLOCK_HEIGHT = 2;
  private static final int METHODID_GET_BLOCK_HASH = 3;
  private static final int METHODID_GET_BLOCK_HEADER = 4;
  private static final int METHODID_GET_BLOCK = 5;
  private static final int METHODID_GET_NODE_INFO = 6;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NETWORK_ID:
          serviceImpl.getNetworkID((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNetworkIDResponse>) responseObserver);
          break;
        case METHODID_ADD_NODE:
          serviceImpl.addNode((AddNodeRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BaseResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEIGHT:
          serviceImpl.getBlockHeight((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeightResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HASH:
          serviceImpl.getBlockHash((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEADER:
          serviceImpl.getBlockHeader((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockHeaderResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBlockResponse>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetNodeInfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ContorlCommandDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.getDescriptor();
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
