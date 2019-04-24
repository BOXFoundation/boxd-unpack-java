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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: transaction.proto")
public final class TransactionCommandGrpc {

  private TransactionCommandGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.TransactionCommand";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> METHOD_GET_BALANCE =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> METHOD_GET_TOKEN_BALANCE =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetTokenBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp> METHOD_FETCH_UTXOS =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "FetchUtxos"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp> METHOD_SEND_TRANSACTION =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "SendTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse> METHOD_GET_RAW_TRANSACTION =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetRawTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse> METHOD_GET_FEE_PRICE =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "GetFeePrice"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> METHOD_MAKE_UNSIGNED_TX =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp> METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedSplitAddrTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp> METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTokenIssueTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.TransactionCommand", "MakeUnsignedTokenTransferTx"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp.getDefaultInstance()))
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
    public void getBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> responseObserver) {
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
    public void getTokenBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> responseObserver) {
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
    public void fetchUtxos(one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp> responseObserver) {
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
    public void sendTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp> responseObserver) {
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
    public void getRawTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse> responseObserver) {
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
    public void getFeePrice(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse> responseObserver) {
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
    public void makeUnsignedTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> responseObserver) {
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
    public void makeUnsignedSplitAddrTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp> responseObserver) {
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
    public void makeUnsignedTokenIssueTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp> responseObserver) {
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
    public void makeUnsignedTokenTransferTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            METHOD_GET_TOKEN_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>(
                  this, METHODID_GET_TOKEN_BALANCE)))
          .addMethod(
            METHOD_FETCH_UTXOS,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp>(
                  this, METHODID_FETCH_UTXOS)))
          .addMethod(
            METHOD_SEND_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            METHOD_GET_RAW_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse>(
                  this, METHODID_GET_RAW_TRANSACTION)))
          .addMethod(
            METHOD_GET_FEE_PRICE,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse>(
                  this, METHODID_GET_FEE_PRICE)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TX,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>(
                  this, METHODID_MAKE_UNSIGNED_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_SPLIT_ADDR_TX,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp>(
                  this, METHODID_MAKE_UNSIGNED_SPLIT_ADDR_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TOKEN_ISSUE_TX,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp>(
                  this, METHODID_MAKE_UNSIGNED_TOKEN_ISSUE_TX)))
          .addMethod(
            METHOD_MAKE_UNSIGNED_TOKEN_TRANSFER_TX,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>(
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

    @Override
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
    public void getBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> responseObserver) {
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
    public void getTokenBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> responseObserver) {
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
    public void fetchUtxos(one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp> responseObserver) {
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
    public void sendTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp> responseObserver) {
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
    public void getRawTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse> responseObserver) {
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
    public void getFeePrice(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse> responseObserver) {
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
    public void makeUnsignedTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> responseObserver) {
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
    public void makeUnsignedSplitAddrTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp> responseObserver) {
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
    public void makeUnsignedTokenIssueTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp> responseObserver) {
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
    public void makeUnsignedTokenTransferTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> responseObserver) {
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

    @Override
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp getBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp getTokenBalance(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp fetchUtxos(one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp sendTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse getRawTransaction(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse getFeePrice(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp makeUnsignedTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp makeUnsignedSplitAddrTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp makeUnsignedTokenIssueTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq request) {
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
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp makeUnsignedTokenTransferTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq request) {
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

    @Override
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> getBalance(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp> getTokenBalance(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp> fetchUtxos(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp> sendTransaction(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse> getRawTransaction(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse> getFeePrice(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> makeUnsignedTx(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp> makeUnsignedSplitAddrTx(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp> makeUnsignedTokenIssueTx(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp> makeUnsignedTokenTransferTx(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq request) {
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>) responseObserver);
          break;
        case METHODID_GET_TOKEN_BALANCE:
          serviceImpl.getTokenBalance((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetBalanceResp>) responseObserver);
          break;
        case METHODID_FETCH_UTXOS:
          serviceImpl.fetchUtxos((one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.FetchUtxosResp>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionResp>) responseObserver);
          break;
        case METHODID_GET_RAW_TRANSACTION:
          serviceImpl.getRawTransaction((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetRawTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_FEE_PRICE:
          serviceImpl.getFeePrice((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceRequest) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TX:
          serviceImpl.makeUnsignedTx((one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_SPLIT_ADDR_TX:
          serviceImpl.makeUnsignedSplitAddrTx((one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeSplitAddrTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TOKEN_ISSUE_TX:
          serviceImpl.makeUnsignedTokenIssueTx((one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenIssueTxResp>) responseObserver);
          break;
        case METHODID_MAKE_UNSIGNED_TOKEN_TRANSFER_TX:
          serviceImpl.makeUnsignedTokenTransferTx((one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTokenTransferTxReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxResp>) responseObserver);
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

  private static final class TransactionCommandDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.getDescriptor();
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
