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
 * The box database rpc service definition. It's for development only
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: db.proto")
public final class DatabaseCommandGrpc {

  private DatabaseCommandGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.DatabaseCommand";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetDatabaseKeysRequest,
          GetDatabaseKeysResponse> METHOD_GET_DATABASE_KEYS =
      io.grpc.MethodDescriptor.<GetDatabaseKeysRequest, GetDatabaseKeysResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.DatabaseCommand", "GetDatabaseKeys"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetDatabaseKeysRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetDatabaseKeysResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetDatabaseValueRequest,
          GetDatabaseValueResponse> METHOD_GET_DATABASE_VALUE =
      io.grpc.MethodDescriptor.<GetDatabaseValueRequest, GetDatabaseValueResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.DatabaseCommand", "GetDatabaseValue"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetDatabaseValueRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetDatabaseValueResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseCommandStub newStub(io.grpc.Channel channel) {
    return new DatabaseCommandStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseCommandBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatabaseCommandBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseCommandFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatabaseCommandFutureStub(channel);
  }

  /**
   * <pre>
   * The box database rpc service definition. It's for development only
   * </pre>
   */
  public static abstract class DatabaseCommandImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc GetDatabaseKeys (GetDatabaseKeysRequest) returns (GetDatabaseKeysResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/keys"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getDatabaseKeys(GetDatabaseKeysRequest request,
                                io.grpc.stub.StreamObserver<GetDatabaseKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATABASE_KEYS, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetDatabaseValue (GetDatabaseValueRequest) returns (GetDatabaseValueResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/get"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getDatabaseValue(GetDatabaseValueRequest request,
                                 io.grpc.stub.StreamObserver<GetDatabaseValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATABASE_VALUE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DATABASE_KEYS,
            asyncUnaryCall(
              new MethodHandlers<
                      GetDatabaseKeysRequest,
                      GetDatabaseKeysResponse>(
                  this, METHODID_GET_DATABASE_KEYS)))
          .addMethod(
            METHOD_GET_DATABASE_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                      GetDatabaseValueRequest,
                      GetDatabaseValueResponse>(
                  this, METHODID_GET_DATABASE_VALUE)))
          .build();
    }
  }

  /**
   * <pre>
   * The box database rpc service definition. It's for development only
   * </pre>
   */
  public static final class DatabaseCommandStub extends io.grpc.stub.AbstractStub<DatabaseCommandStub> {
    private DatabaseCommandStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseCommandStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseCommandStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseCommandStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetDatabaseKeys (GetDatabaseKeysRequest) returns (GetDatabaseKeysResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/keys"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getDatabaseKeys(GetDatabaseKeysRequest request,
                                io.grpc.stub.StreamObserver<GetDatabaseKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_KEYS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetDatabaseValue (GetDatabaseValueRequest) returns (GetDatabaseValueResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/get"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getDatabaseValue(GetDatabaseValueRequest request,
                                 io.grpc.stub.StreamObserver<GetDatabaseValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_VALUE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The box database rpc service definition. It's for development only
   * </pre>
   */
  public static final class DatabaseCommandBlockingStub extends io.grpc.stub.AbstractStub<DatabaseCommandBlockingStub> {
    private DatabaseCommandBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseCommandBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseCommandBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseCommandBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetDatabaseKeys (GetDatabaseKeysRequest) returns (GetDatabaseKeysResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/keys"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetDatabaseKeysResponse getDatabaseKeys(GetDatabaseKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATABASE_KEYS, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetDatabaseValue (GetDatabaseValueRequest) returns (GetDatabaseValueResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/get"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetDatabaseValueResponse getDatabaseValue(GetDatabaseValueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATABASE_VALUE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The box database rpc service definition. It's for development only
   * </pre>
   */
  public static final class DatabaseCommandFutureStub extends io.grpc.stub.AbstractStub<DatabaseCommandFutureStub> {
    private DatabaseCommandFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseCommandFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseCommandFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseCommandFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetDatabaseKeys (GetDatabaseKeysRequest) returns (GetDatabaseKeysResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/keys"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetDatabaseKeysResponse> getDatabaseKeys(
        GetDatabaseKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_KEYS, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetDatabaseValue (GetDatabaseValueRequest) returns (GetDatabaseValueResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/db/get"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetDatabaseValueResponse> getDatabaseValue(
        GetDatabaseValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_VALUE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATABASE_KEYS = 0;
  private static final int METHODID_GET_DATABASE_VALUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabaseCommandImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseCommandImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATABASE_KEYS:
          serviceImpl.getDatabaseKeys((GetDatabaseKeysRequest) request,
              (io.grpc.stub.StreamObserver<GetDatabaseKeysResponse>) responseObserver);
          break;
        case METHODID_GET_DATABASE_VALUE:
          serviceImpl.getDatabaseValue((GetDatabaseValueRequest) request,
              (io.grpc.stub.StreamObserver<GetDatabaseValueResponse>) responseObserver);
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

  private static final class DatabaseCommandDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DbProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatabaseCommandGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseCommandDescriptorSupplier())
              .addMethod(METHOD_GET_DATABASE_KEYS)
              .addMethod(METHOD_GET_DATABASE_VALUE)
              .build();
        }
      }
    }
    return result;
  }
}
