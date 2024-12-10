package quizgame;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Define the QuizGame service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Quiz.proto")
public final class QuizGameGrpc {

  private QuizGameGrpc() {}

  public static final String SERVICE_NAME = "quizgame.QuizGame";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quizgame.QuizOuterClass.RegisterPlayerRequest,
      quizgame.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPlayer",
      requestType = quizgame.QuizOuterClass.RegisterPlayerRequest.class,
      responseType = quizgame.QuizOuterClass.RegisterPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quizgame.QuizOuterClass.RegisterPlayerRequest,
      quizgame.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod() {
    io.grpc.MethodDescriptor<quizgame.QuizOuterClass.RegisterPlayerRequest, quizgame.QuizOuterClass.RegisterPlayerResponse> getRegisterPlayerMethod;
    if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getRegisterPlayerMethod = QuizGameGrpc.getRegisterPlayerMethod) == null) {
          QuizGameGrpc.getRegisterPlayerMethod = getRegisterPlayerMethod = 
              io.grpc.MethodDescriptor.<quizgame.QuizOuterClass.RegisterPlayerRequest, quizgame.QuizOuterClass.RegisterPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "quizgame.QuizGame", "RegisterPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.RegisterPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.RegisterPlayerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("RegisterPlayer"))
                  .build();
          }
        }
     }
     return getRegisterPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuizRequest,
      quizgame.QuizOuterClass.GetQuizResponse> getGetQuizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuiz",
      requestType = quizgame.QuizOuterClass.GetQuizRequest.class,
      responseType = quizgame.QuizOuterClass.GetQuizResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuizRequest,
      quizgame.QuizOuterClass.GetQuizResponse> getGetQuizMethod() {
    io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuizRequest, quizgame.QuizOuterClass.GetQuizResponse> getGetQuizMethod;
    if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuizMethod = QuizGameGrpc.getGetQuizMethod) == null) {
          QuizGameGrpc.getGetQuizMethod = getGetQuizMethod = 
              io.grpc.MethodDescriptor.<quizgame.QuizOuterClass.GetQuizRequest, quizgame.QuizOuterClass.GetQuizResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "quizgame.QuizGame", "GetQuiz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetQuizRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetQuizResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuiz"))
                  .build();
          }
        }
     }
     return getGetQuizMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuestionRequest,
      quizgame.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = quizgame.QuizOuterClass.GetQuestionRequest.class,
      responseType = quizgame.QuizOuterClass.GetQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuestionRequest,
      quizgame.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetQuestionRequest, quizgame.QuizOuterClass.GetQuestionResponse> getGetQuestionMethod;
    if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetQuestionMethod = QuizGameGrpc.getGetQuestionMethod) == null) {
          QuizGameGrpc.getGetQuestionMethod = getGetQuestionMethod = 
              io.grpc.MethodDescriptor.<quizgame.QuizOuterClass.GetQuestionRequest, quizgame.QuizOuterClass.GetQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "quizgame.QuizGame", "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetQuestionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetQuestion"))
                  .build();
          }
        }
     }
     return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quizgame.QuizOuterClass.PlayRequest,
      quizgame.QuizOuterClass.PlayResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Play",
      requestType = quizgame.QuizOuterClass.PlayRequest.class,
      responseType = quizgame.QuizOuterClass.PlayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quizgame.QuizOuterClass.PlayRequest,
      quizgame.QuizOuterClass.PlayResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<quizgame.QuizOuterClass.PlayRequest, quizgame.QuizOuterClass.PlayResponse> getPlayMethod;
    if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getPlayMethod = QuizGameGrpc.getPlayMethod) == null) {
          QuizGameGrpc.getPlayMethod = getPlayMethod = 
              io.grpc.MethodDescriptor.<quizgame.QuizOuterClass.PlayRequest, quizgame.QuizOuterClass.PlayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "quizgame.QuizGame", "Play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.PlayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.PlayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("Play"))
                  .build();
          }
        }
     }
     return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetPlayerScoresRequest,
      quizgame.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerScores",
      requestType = quizgame.QuizOuterClass.GetPlayerScoresRequest.class,
      responseType = quizgame.QuizOuterClass.GetPlayerScoresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetPlayerScoresRequest,
      quizgame.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod() {
    io.grpc.MethodDescriptor<quizgame.QuizOuterClass.GetPlayerScoresRequest, quizgame.QuizOuterClass.GetPlayerScoresResponse> getGetPlayerScoresMethod;
    if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
      synchronized (QuizGameGrpc.class) {
        if ((getGetPlayerScoresMethod = QuizGameGrpc.getGetPlayerScoresMethod) == null) {
          QuizGameGrpc.getGetPlayerScoresMethod = getGetPlayerScoresMethod = 
              io.grpc.MethodDescriptor.<quizgame.QuizOuterClass.GetPlayerScoresRequest, quizgame.QuizOuterClass.GetPlayerScoresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "quizgame.QuizGame", "GetPlayerScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetPlayerScoresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quizgame.QuizOuterClass.GetPlayerScoresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QuizGameMethodDescriptorSupplier("GetPlayerScores"))
                  .build();
          }
        }
     }
     return getGetPlayerScoresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuizGameStub newStub(io.grpc.Channel channel) {
    return new QuizGameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuizGameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QuizGameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuizGameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QuizGameFutureStub(channel);
  }

  /**
   * <pre>
   * Define the QuizGame service
   * </pre>
   */
  public static abstract class QuizGameImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerPlayer(quizgame.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.RegisterPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPlayerMethod(), responseObserver);
    }

    /**
     */
    public void getQuiz(quizgame.QuizOuterClass.GetQuizRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuizResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuizMethod(), responseObserver);
    }

    /**
     */
    public void getQuestion(quizgame.QuizOuterClass.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuestionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     */
    public void play(quizgame.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.PlayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void getPlayerScores(quizgame.QuizOuterClass.GetPlayerScoresRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetPlayerScoresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerScoresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quizgame.QuizOuterClass.RegisterPlayerRequest,
                quizgame.QuizOuterClass.RegisterPlayerResponse>(
                  this, METHODID_REGISTER_PLAYER)))
          .addMethod(
            getGetQuizMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quizgame.QuizOuterClass.GetQuizRequest,
                quizgame.QuizOuterClass.GetQuizResponse>(
                  this, METHODID_GET_QUIZ)))
          .addMethod(
            getGetQuestionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quizgame.QuizOuterClass.GetQuestionRequest,
                quizgame.QuizOuterClass.GetQuestionResponse>(
                  this, METHODID_GET_QUESTION)))
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quizgame.QuizOuterClass.PlayRequest,
                quizgame.QuizOuterClass.PlayResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getGetPlayerScoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quizgame.QuizOuterClass.GetPlayerScoresRequest,
                quizgame.QuizOuterClass.GetPlayerScoresResponse>(
                  this, METHODID_GET_PLAYER_SCORES)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the QuizGame service
   * </pre>
   */
  public static final class QuizGameStub extends io.grpc.stub.AbstractStub<QuizGameStub> {
    private QuizGameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameStub(channel, callOptions);
    }

    /**
     */
    public void registerPlayer(quizgame.QuizOuterClass.RegisterPlayerRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.RegisterPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuiz(quizgame.QuizOuterClass.GetQuizRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuizResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestion(quizgame.QuizOuterClass.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuestionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void play(quizgame.QuizOuterClass.PlayRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.PlayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayerScores(quizgame.QuizOuterClass.GetPlayerScoresRequest request,
        io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetPlayerScoresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the QuizGame service
   * </pre>
   */
  public static final class QuizGameBlockingStub extends io.grpc.stub.AbstractStub<QuizGameBlockingStub> {
    private QuizGameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameBlockingStub(channel, callOptions);
    }

    /**
     */
    public quizgame.QuizOuterClass.RegisterPlayerResponse registerPlayer(quizgame.QuizOuterClass.RegisterPlayerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public quizgame.QuizOuterClass.GetQuizResponse getQuiz(quizgame.QuizOuterClass.GetQuizRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuizMethod(), getCallOptions(), request);
    }

    /**
     */
    public quizgame.QuizOuterClass.GetQuestionResponse getQuestion(quizgame.QuizOuterClass.GetQuestionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public quizgame.QuizOuterClass.PlayResponse play(quizgame.QuizOuterClass.PlayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public quizgame.QuizOuterClass.GetPlayerScoresResponse getPlayerScores(quizgame.QuizOuterClass.GetPlayerScoresRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerScoresMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the QuizGame service
   * </pre>
   */
  public static final class QuizGameFutureStub extends io.grpc.stub.AbstractStub<QuizGameFutureStub> {
    private QuizGameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QuizGameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuizGameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QuizGameFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quizgame.QuizOuterClass.RegisterPlayerResponse> registerPlayer(
        quizgame.QuizOuterClass.RegisterPlayerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quizgame.QuizOuterClass.GetQuizResponse> getQuiz(
        quizgame.QuizOuterClass.GetQuizRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuizMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quizgame.QuizOuterClass.GetQuestionResponse> getQuestion(
        quizgame.QuizOuterClass.GetQuestionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quizgame.QuizOuterClass.PlayResponse> play(
        quizgame.QuizOuterClass.PlayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quizgame.QuizOuterClass.GetPlayerScoresResponse> getPlayerScores(
        quizgame.QuizOuterClass.GetPlayerScoresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerScoresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PLAYER = 0;
  private static final int METHODID_GET_QUIZ = 1;
  private static final int METHODID_GET_QUESTION = 2;
  private static final int METHODID_PLAY = 3;
  private static final int METHODID_GET_PLAYER_SCORES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuizGameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuizGameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PLAYER:
          serviceImpl.registerPlayer((quizgame.QuizOuterClass.RegisterPlayerRequest) request,
              (io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.RegisterPlayerResponse>) responseObserver);
          break;
        case METHODID_GET_QUIZ:
          serviceImpl.getQuiz((quizgame.QuizOuterClass.GetQuizRequest) request,
              (io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuizResponse>) responseObserver);
          break;
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((quizgame.QuizOuterClass.GetQuestionRequest) request,
              (io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetQuestionResponse>) responseObserver);
          break;
        case METHODID_PLAY:
          serviceImpl.play((quizgame.QuizOuterClass.PlayRequest) request,
              (io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.PlayResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_SCORES:
          serviceImpl.getPlayerScores((quizgame.QuizOuterClass.GetPlayerScoresRequest) request,
              (io.grpc.stub.StreamObserver<quizgame.QuizOuterClass.GetPlayerScoresResponse>) responseObserver);
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

  private static abstract class QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuizGameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return quizgame.QuizOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuizGame");
    }
  }

  private static final class QuizGameFileDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier {
    QuizGameFileDescriptorSupplier() {}
  }

  private static final class QuizGameMethodDescriptorSupplier
      extends QuizGameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuizGameMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QuizGameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuizGameFileDescriptorSupplier())
              .addMethod(getRegisterPlayerMethod())
              .addMethod(getGetQuizMethod())
              .addMethod(getGetQuestionMethod())
              .addMethod(getPlayMethod())
              .addMethod(getGetPlayerScoresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
