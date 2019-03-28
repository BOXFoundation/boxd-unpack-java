package one.contentbox.boxd.proto;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: web.proto")
public final class WebApiGrpc {

  private WebApiGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.WebApi";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.proto.ViewTxDetailReq,
      one.contentbox.boxd.proto.ViewTxDetailResp> METHOD_VIEW_TX_DETAIL =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.proto.ViewTxDetailReq, one.contentbox.boxd.proto.ViewTxDetailResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ViewTxDetail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.ViewTxDetailReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.ViewTxDetailResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.proto.ViewBlockDetailReq,
      one.contentbox.boxd.proto.ViewBlockDetailResp> METHOD_VIEW_BLOCK_DETAIL =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.proto.ViewBlockDetailReq, one.contentbox.boxd.proto.ViewBlockDetailResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ViewBlockDetail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.ViewBlockDetailReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.ViewBlockDetailResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.proto.ListenBlocksReq,
      one.contentbox.boxd.proto.BlockDetail> METHOD_LISTEN_AND_READ_NEW_BLOCK =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.proto.ListenBlocksReq, one.contentbox.boxd.proto.BlockDetail>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ListenAndReadNewBlock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.ListenBlocksReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.proto.BlockDetail.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebApiStub newStub(io.grpc.Channel channel) {
    return new WebApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WebApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WebApiFutureStub(channel);
  }

  /**
   */
  public static abstract class WebApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewTxDetail(one.contentbox.boxd.proto.ViewTxDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewTxDetailResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VIEW_TX_DETAIL, responseObserver);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewBlockDetail(one.contentbox.boxd.proto.ViewBlockDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewBlockDetailResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VIEW_BLOCK_DETAIL, responseObserver);
    }

    /**
     */
    public void listenAndReadNewBlock(one.contentbox.boxd.proto.ListenBlocksReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.BlockDetail> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LISTEN_AND_READ_NEW_BLOCK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_VIEW_TX_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.proto.ViewTxDetailReq,
                one.contentbox.boxd.proto.ViewTxDetailResp>(
                  this, METHODID_VIEW_TX_DETAIL)))
          .addMethod(
            METHOD_VIEW_BLOCK_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.proto.ViewBlockDetailReq,
                one.contentbox.boxd.proto.ViewBlockDetailResp>(
                  this, METHODID_VIEW_BLOCK_DETAIL)))
          .addMethod(
            METHOD_LISTEN_AND_READ_NEW_BLOCK,
            asyncServerStreamingCall(
              new MethodHandlers<
                one.contentbox.boxd.proto.ListenBlocksReq,
                one.contentbox.boxd.proto.BlockDetail>(
                  this, METHODID_LISTEN_AND_READ_NEW_BLOCK)))
          .build();
    }
  }

  /**
   */
  public static final class WebApiStub extends io.grpc.stub.AbstractStub<WebApiStub> {
    private WebApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewTxDetail(one.contentbox.boxd.proto.ViewTxDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewTxDetailResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VIEW_TX_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewBlockDetail(one.contentbox.boxd.proto.ViewBlockDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewBlockDetailResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VIEW_BLOCK_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listenAndReadNewBlock(one.contentbox.boxd.proto.ListenBlocksReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.BlockDetail> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LISTEN_AND_READ_NEW_BLOCK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebApiBlockingStub extends io.grpc.stub.AbstractStub<WebApiBlockingStub> {
    private WebApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.proto.ViewTxDetailResp viewTxDetail(one.contentbox.boxd.proto.ViewTxDetailReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VIEW_TX_DETAIL, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.proto.ViewBlockDetailResp viewBlockDetail(one.contentbox.boxd.proto.ViewBlockDetailReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VIEW_BLOCK_DETAIL, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<one.contentbox.boxd.proto.BlockDetail> listenAndReadNewBlock(
        one.contentbox.boxd.proto.ListenBlocksReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LISTEN_AND_READ_NEW_BLOCK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebApiFutureStub extends io.grpc.stub.AbstractStub<WebApiFutureStub> {
    private WebApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.proto.ViewTxDetailResp> viewTxDetail(
        one.contentbox.boxd.proto.ViewTxDetailReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VIEW_TX_DETAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.proto.ViewBlockDetailResp> viewBlockDetail(
        one.contentbox.boxd.proto.ViewBlockDetailReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VIEW_BLOCK_DETAIL, getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_TX_DETAIL = 0;
  private static final int METHODID_VIEW_BLOCK_DETAIL = 1;
  private static final int METHODID_LISTEN_AND_READ_NEW_BLOCK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIEW_TX_DETAIL:
          serviceImpl.viewTxDetail((one.contentbox.boxd.proto.ViewTxDetailReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewTxDetailResp>) responseObserver);
          break;
        case METHODID_VIEW_BLOCK_DETAIL:
          serviceImpl.viewBlockDetail((one.contentbox.boxd.proto.ViewBlockDetailReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.ViewBlockDetailResp>) responseObserver);
          break;
        case METHODID_LISTEN_AND_READ_NEW_BLOCK:
          serviceImpl.listenAndReadNewBlock((one.contentbox.boxd.proto.ListenBlocksReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.proto.BlockDetail>) responseObserver);
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

  private static final class WebApiDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.contentbox.boxd.proto.WebProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebApiDescriptorSupplier())
              .addMethod(METHOD_VIEW_TX_DETAIL)
              .addMethod(METHOD_VIEW_BLOCK_DETAIL)
              .addMethod(METHOD_LISTEN_AND_READ_NEW_BLOCK)
              .build();
        }
      }
    }
    return result;
  }
}
