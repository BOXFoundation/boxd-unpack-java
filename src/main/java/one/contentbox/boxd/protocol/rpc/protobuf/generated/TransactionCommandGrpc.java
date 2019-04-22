package one.contentbox.boxd.protocol.rpc.protobuf.generated;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: transaction.proto")
public final class TransactionCommandGrpc {

  private TransactionCommandGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.TransactionCommand";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetBalanceReq,
          GetBalanceResp> METHOD_GET_BALANCE =
      io.grpc.MethodDescriptor.<GetBalanceReq, GetBalanceResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBalanceReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBalanceResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetTokenBalanceReq,
          GetBalanceResp> METHOD_GET_TOKEN_BALANCE =
      io.grpc.MethodDescriptor.<GetTokenBalanceReq, GetBalanceResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetTokenBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetTokenBalanceReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetBalanceResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<FetchUtxosReq,
          FetchUtxosResp> METHOD_FETCH_UTXOS =
      io.grpc.MethodDescriptor.<FetchUtxosReq, FetchUtxosResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "FetchUtxos"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              FetchUtxosReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              FetchUtxosResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<SendTransactionReq,
          SendTransactionResp> METHOD_SEND_TRANSACTION =
      io.grpc.MethodDescriptor.<SendTransactionReq, SendTransactionResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "SendTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SendTransactionReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              SendTransactionResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetRawTransactionRequest,
          GetRawTransactionResponse> METHOD_GET_RAW_TRANSACTION =
      io.grpc.MethodDescriptor.<GetRawTransactionRequest, GetRawTransactionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetRawTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetRawTransactionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetRawTransactionResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<GetFeePriceRequest,
          GetFeePriceResponse> METHOD_GET_FEE_PRICE =
      io.grpc.MethodDescriptor.<GetFeePriceRequest, GetFeePriceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetFeePrice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetFeePriceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              GetFeePriceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MakeTxReq,
          MakeTxResp> METHOD_MAKE_UNSIGNED_TX =
      io.grpc.MethodDescriptor.<MakeTxReq, MakeTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MakeSplitAddrTxReq,
          MakeSplitAddrTxResp> METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX =
      io.grpc.MethodDescriptor.<MakeSplitAddrTxReq, MakeSplitAddrTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedSplitAddrTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeSplitAddrTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeSplitAddrTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MakeTokenIssueTxReq,
          MakeTokenIssueTxResp> METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX =
      io.grpc.MethodDescriptor.<MakeTokenIssueTxReq, MakeTokenIssueTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTokenIssueTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTokenIssueTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTokenIssueTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<MakeTokenTransferTxReq,
          MakeTxResp> METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX =
      io.grpc.MethodDescriptor.<MakeTokenTransferTxReq, MakeTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTokenTransferTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTokenTransferTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              MakeTxResp.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionCommandStub newStub(io.grpc.Channel channel) {
    return new TransactionCommandStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionCommandBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TransactionCommandBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionCommandFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TransactionCommandFutureStub(channel);
  }

  /**
   */
  public static abstract class TransactionCommandImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc GetBalance(GetBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getBalance(GetBalanceReq request,
                           io.grpc.stub.StreamObserver<GetBalanceResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BALANCE, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetTokenBalance(GetTokenBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/gettokenbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getTokenBalance(GetTokenBalanceReq request,
                                io.grpc.stub.StreamObserver<GetBalanceResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOKEN_BALANCE, responseObserver);
    }

    /**
     * <pre>
     *    rpc FetchUtxos(FetchUtxosReq) returns (FetchUtxosResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/fetchutxos"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void fetchUtxos(FetchUtxosReq request,
                           io.grpc.stub.StreamObserver<FetchUtxosResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_UTXOS, responseObserver);
    }

    /**
     * <pre>
     *    rpc SendTransaction(SendTransactionReq) returns (SendTransactionResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/sendtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void sendTransaction(SendTransactionReq request,
                                io.grpc.stub.StreamObserver<SendTransactionResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetRawTransaction(GetRawTransactionRequest) returns (GetRawTransactionResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getrawtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getRawTransaction(GetRawTransactionRequest request,
                                  io.grpc.stub.StreamObserver<GetRawTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RAW_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetFeePrice(GetFeePriceRequest) returns (GetFeePriceResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getfeeprice"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getFeePrice(GetFeePriceRequest request,
                            io.grpc.stub.StreamObserver<GetFeePriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEE_PRICE, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTx(MakeTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTx(MakeTxReq request,
                               io.grpc.stub.StreamObserver<MakeTxResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_UNSIGNED_TX, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedSplitAddrTx(MakeSplitAddrTxReq) returns (MakeSplitAddrTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/splitaddr"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedSplitAddrTx(MakeSplitAddrTxReq request,
                                        io.grpc.stub.StreamObserver<MakeSplitAddrTxResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenIssueTx(MakeTokenIssueTxReq) returns (MakeTokenIssueTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/issue"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTokenIssueTx(MakeTokenIssueTxReq request,
                                         io.grpc.stub.StreamObserver<MakeTokenIssueTxResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenTransferTx(MakeTokenTransferTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/transfer"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTokenTransferTx(MakeTokenTransferTxReq request,
                                            io.grpc.stub.StreamObserver<MakeTxResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                      GetBalanceReq,
                      GetBalanceResp>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            METHOD_GET_TOKEN_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                      GetTokenBalanceReq,
                      GetBalanceResp>(
                  this, METHODID_GET_TOKEN_BALANCE)))
          .addMethod(
            METHOD_FETCH_UTXOS,
            asyncUnaryCall(
              new MethodHandlers<
                      FetchUtxosReq,
                      FetchUtxosResp>(
                  this, METHODID_FETCH_UTXOS)))
          .addMethod(
            METHOD_SEND_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                      SendTransactionReq,
                      SendTransactionResp>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            METHOD_GET_RAW_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                      GetRawTransactionRequest,
                      GetRawTransactionResponse>(
                  this, METHODID_GET_RAW_TRANSACTION)))
          .addMethod(
            METHOD_GET_FEE_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                      GetFeePriceRequest,
                      GetFeePriceResponse>(
                  this, METHODID_GET_FEE_PRICE)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TX,
            asyncUnaryCall(
              new MethodHandlers<
                      MakeTxReq,
                      MakeTxResp>(
                  this, METHODID_MAKE_UNSIGNED_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX,
            asyncUnaryCall(
              new MethodHandlers<
                      MakeSplitAddrTxReq,
                      MakeSplitAddrTxResp>(
                  this, METHODID_MAKE_UNSIGNED_SPLIT_ADDR_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX,
            asyncUnaryCall(
              new MethodHandlers<
                      MakeTokenIssueTxReq,
                      MakeTokenIssueTxResp>(
                  this, METHODID_MAKE_UNSIGNED_TOKEN_ISSUE_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX,
            asyncUnaryCall(
              new MethodHandlers<
                      MakeTokenTransferTxReq,
                      MakeTxResp>(
                  this, METHODID_MAKE_UNSIGNED_TOKEN_TRANSFER_TX)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionCommandStub extends io.grpc.stub.AbstractStub<TransactionCommandStub> {
    private TransactionCommandStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionCommandStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionCommandStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionCommandStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetBalance(GetBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getBalance(GetBalanceReq request,
                           io.grpc.stub.StreamObserver<GetBalanceResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BALANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetTokenBalance(GetTokenBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/gettokenbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getTokenBalance(GetTokenBalanceReq request,
                                io.grpc.stub.StreamObserver<GetBalanceResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN_BALANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc FetchUtxos(FetchUtxosReq) returns (FetchUtxosResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/fetchutxos"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void fetchUtxos(FetchUtxosReq request,
                           io.grpc.stub.StreamObserver<FetchUtxosResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FETCH_UTXOS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc SendTransaction(SendTransactionReq) returns (SendTransactionResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/sendtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void sendTransaction(SendTransactionReq request,
                                io.grpc.stub.StreamObserver<SendTransactionResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetRawTransaction(GetRawTransactionRequest) returns (GetRawTransactionResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getrawtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getRawTransaction(GetRawTransactionRequest request,
                                  io.grpc.stub.StreamObserver<GetRawTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RAW_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc GetFeePrice(GetFeePriceRequest) returns (GetFeePriceResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getfeeprice"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void getFeePrice(GetFeePriceRequest request,
                            io.grpc.stub.StreamObserver<GetFeePriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEE_PRICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTx(MakeTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTx(MakeTxReq request,
                               io.grpc.stub.StreamObserver<MakeTxResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TX, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedSplitAddrTx(MakeSplitAddrTxReq) returns (MakeSplitAddrTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/splitaddr"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedSplitAddrTx(MakeSplitAddrTxReq request,
                                        io.grpc.stub.StreamObserver<MakeSplitAddrTxResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenIssueTx(MakeTokenIssueTxReq) returns (MakeTokenIssueTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/issue"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTokenIssueTx(MakeTokenIssueTxReq request,
                                         io.grpc.stub.StreamObserver<MakeTokenIssueTxResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenTransferTx(MakeTokenTransferTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/transfer"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void makeUnsignedTokenTransferTx(MakeTokenTransferTxReq request,
                                            io.grpc.stub.StreamObserver<MakeTxResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionCommandBlockingStub extends io.grpc.stub.AbstractStub<TransactionCommandBlockingStub> {
    private TransactionCommandBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionCommandBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionCommandBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionCommandBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetBalance(GetBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetBalanceResp getBalance(GetBalanceReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BALANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetTokenBalance(GetTokenBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/gettokenbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetBalanceResp getTokenBalance(GetTokenBalanceReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOKEN_BALANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc FetchUtxos(FetchUtxosReq) returns (FetchUtxosResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/fetchutxos"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public FetchUtxosResp fetchUtxos(FetchUtxosReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FETCH_UTXOS, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc SendTransaction(SendTransactionReq) returns (SendTransactionResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/sendtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public SendTransactionResp sendTransaction(SendTransactionReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetRawTransaction(GetRawTransactionRequest) returns (GetRawTransactionResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getrawtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetRawTransactionResponse getRawTransaction(GetRawTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RAW_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc GetFeePrice(GetFeePriceRequest) returns (GetFeePriceResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getfeeprice"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public GetFeePriceResponse getFeePrice(GetFeePriceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEE_PRICE, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTx(MakeTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public MakeTxResp makeUnsignedTx(MakeTxReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_UNSIGNED_TX, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedSplitAddrTx(MakeSplitAddrTxReq) returns (MakeSplitAddrTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/splitaddr"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public MakeSplitAddrTxResp makeUnsignedSplitAddrTx(MakeSplitAddrTxReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenIssueTx(MakeTokenIssueTxReq) returns (MakeTokenIssueTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/issue"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public MakeTokenIssueTxResp makeUnsignedTokenIssueTx(MakeTokenIssueTxReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenTransferTx(MakeTokenTransferTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/transfer"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public MakeTxResp makeUnsignedTokenTransferTx(MakeTokenTransferTxReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionCommandFutureStub extends io.grpc.stub.AbstractStub<TransactionCommandFutureStub> {
    private TransactionCommandFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionCommandFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionCommandFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionCommandFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc GetBalance(GetBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBalanceResp> getBalance(
        GetBalanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BALANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetTokenBalance(GetTokenBalanceReq) returns (GetBalanceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/gettokenbalance"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBalanceResp> getTokenBalance(
        GetTokenBalanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN_BALANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc FetchUtxos(FetchUtxosReq) returns (FetchUtxosResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/fetchutxos"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<FetchUtxosResp> fetchUtxos(
        FetchUtxosReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FETCH_UTXOS, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc SendTransaction(SendTransactionReq) returns (SendTransactionResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/sendtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SendTransactionResp> sendTransaction(
        SendTransactionReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetRawTransaction(GetRawTransactionRequest) returns (GetRawTransactionResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getrawtransaction"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetRawTransactionResponse> getRawTransaction(
        GetRawTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RAW_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc GetFeePrice(GetFeePriceRequest) returns (GetFeePriceResponse) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/getfeeprice"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetFeePriceResponse> getFeePrice(
        GetFeePriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEE_PRICE, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTx(MakeTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MakeTxResp> makeUnsignedTx(
        MakeTxReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TX, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedSplitAddrTx(MakeSplitAddrTxReq) returns (MakeSplitAddrTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/splitaddr"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MakeSplitAddrTxResp> makeUnsignedSplitAddrTx(
        MakeSplitAddrTxReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenIssueTx(MakeTokenIssueTxReq) returns (MakeTokenIssueTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/issue"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MakeTokenIssueTxResp> makeUnsignedTokenIssueTx(
        MakeTokenIssueTxReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc MakeUnsignedTokenTransferTx(MakeTokenTransferTxReq) returns (MakeTxResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/makeunsignedtx/token/transfer"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<MakeTxResp> makeUnsignedTokenTransferTx(
        MakeTokenTransferTxReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_GET_TOKEN_BALANCE = 1;
  private static final int METHODID_FETCH_UTXOS = 2;
  private static final int METHODID_SEND_TRANSACTION = 3;
  private static final int METHODID_GET_RAW_TRANSACTION = 4;
  private static final int METHODID_GET_FEE_PRICE = 5;
  private static final int METHODID_MAKE_UNSIGNED_TX = 6;
  private static final int METHODID_MAKE_UNSIGNED_SPLIT_ADDR_TX = 7;
  private static final int METHODID_MAKE_UNSIGNED_TOKEN_ISSUE_TX = 8;
  private static final int METHODID_MAKE_UNSIGNED_TOKEN_TRANSFER_TX = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionCommandImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionCommandImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((GetBalanceReq) request,
              (io.grpc.stub.StreamObserver<GetBalanceResp>) responseObserver);
          break;
        case METHODID_GET_TOKEN_BALANCE:
          serviceImpl.getTokenBalance((GetTokenBalanceReq) request,
              (io.grpc.stub.StreamObserver<GetBalanceResp>) responseObserver);
          break;
        case METHODID_FETCH_UTXOS:
          serviceImpl.fetchUtxos((FetchUtxosReq) request,
              (io.grpc.stub.StreamObserver<FetchUtxosResp>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((SendTransactionReq) request,
              (io.grpc.stub.StreamObserver<SendTransactionResp>) responseObserver);
          break;
        case METHODID_GET_RAW_TRANSACTION:
          serviceImpl.getRawTransaction((GetRawTransactionRequest) request,
              (io.grpc.stub.StreamObserver<GetRawTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_FEE_PRICE:
          serviceImpl.getFeePrice((GetFeePriceRequest) request,
              (io.grpc.stub.StreamObserver<GetFeePriceResponse>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TX:
          serviceImpl.makeUnsignedTx((MakeTxReq) request,
              (io.grpc.stub.StreamObserver<MakeTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_SPLIT_ADDR_TX:
          serviceImpl.makeUnsignedSplitAddrTx((MakeSplitAddrTxReq) request,
              (io.grpc.stub.StreamObserver<MakeSplitAddrTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TOKEN_ISSUE_TX:
          serviceImpl.makeUnsignedTokenIssueTx((MakeTokenIssueTxReq) request,
              (io.grpc.stub.StreamObserver<MakeTokenIssueTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TOKEN_TRANSFER_TX:
          serviceImpl.makeUnsignedTokenTransferTx((MakeTokenTransferTxReq) request,
              (io.grpc.stub.StreamObserver<MakeTxResp>) responseObserver);
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

  private static final class TransactionCommandDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TransactionProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TransactionCommandGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionCommandDescriptorSupplier())
              .addMethod(METHOD_GET_BALANCE)
              .addMethod(METHOD_GET_TOKEN_BALANCE)
              .addMethod(METHOD_FETCH_UTXOS)
              .addMethod(METHOD_SEND_TRANSACTION)
              .addMethod(METHOD_GET_RAW_TRANSACTION)
              .addMethod(METHOD_GET_FEE_PRICE)
              .addMethod(METHOD_MAKE_UNSIGNED_TX)
              .addMethod(METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX)
              .addMethod(METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX)
              .addMethod(METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX)
              .build();
        }
      }
    }
    return result;
  }
}
