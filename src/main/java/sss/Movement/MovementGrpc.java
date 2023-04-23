package sss.Movement;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Movement.proto")
public final class MovementGrpc {

  private MovementGrpc() {}

  public static final String SERVICE_NAME = "sss.Movement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.Movement.MotionDetectionRequest,
      sss.Movement.MotionDetectionResponse> getDetectionMotionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectionMotion",
      requestType = sss.Movement.MotionDetectionRequest.class,
      responseType = sss.Movement.MotionDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.Movement.MotionDetectionRequest,
      sss.Movement.MotionDetectionResponse> getDetectionMotionMethod() {
    io.grpc.MethodDescriptor<sss.Movement.MotionDetectionRequest, sss.Movement.MotionDetectionResponse> getDetectionMotionMethod;
    if ((getDetectionMotionMethod = MovementGrpc.getDetectionMotionMethod) == null) {
      synchronized (MovementGrpc.class) {
        if ((getDetectionMotionMethod = MovementGrpc.getDetectionMotionMethod) == null) {
          MovementGrpc.getDetectionMotionMethod = getDetectionMotionMethod = 
              io.grpc.MethodDescriptor.<sss.Movement.MotionDetectionRequest, sss.Movement.MotionDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.Movement", "DetectionMotion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Movement.MotionDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Movement.MotionDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovementMethodDescriptorSupplier("DetectionMotion"))
                  .build();
          }
        }
     }
     return getDetectionMotionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sss.Movement.RecognitionRequest,
      sss.Movement.RecognitionResponse> getRecognizeFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecognizeFace",
      requestType = sss.Movement.RecognitionRequest.class,
      responseType = sss.Movement.RecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<sss.Movement.RecognitionRequest,
      sss.Movement.RecognitionResponse> getRecognizeFaceMethod() {
    io.grpc.MethodDescriptor<sss.Movement.RecognitionRequest, sss.Movement.RecognitionResponse> getRecognizeFaceMethod;
    if ((getRecognizeFaceMethod = MovementGrpc.getRecognizeFaceMethod) == null) {
      synchronized (MovementGrpc.class) {
        if ((getRecognizeFaceMethod = MovementGrpc.getRecognizeFaceMethod) == null) {
          MovementGrpc.getRecognizeFaceMethod = getRecognizeFaceMethod = 
              io.grpc.MethodDescriptor.<sss.Movement.RecognitionRequest, sss.Movement.RecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sss.Movement", "RecognizeFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Movement.RecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Movement.RecognitionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovementMethodDescriptorSupplier("RecognizeFace"))
                  .build();
          }
        }
     }
     return getRecognizeFaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovementStub newStub(io.grpc.Channel channel) {
    return new MovementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MovementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MovementFutureStub(channel);
  }

  /**
   */
  public static abstract class MovementImplBase implements io.grpc.BindableService {

    /**
     */
    public void detectionMotion(sss.Movement.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<sss.Movement.MotionDetectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectionMotionMethod(), responseObserver);
    }

    /**
     * <pre>
     *2.1.1	RPC Method 1 Motion Detection
     *Server request Client to return a message if there is an object moving.
     *simple rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sss.Movement.RecognitionRequest> recognizeFace(
        io.grpc.stub.StreamObserver<sss.Movement.RecognitionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecognizeFaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectionMotionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.Movement.MotionDetectionRequest,
                sss.Movement.MotionDetectionResponse>(
                  this, METHODID_DETECTION_MOTION)))
          .addMethod(
            getRecognizeFaceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                sss.Movement.RecognitionRequest,
                sss.Movement.RecognitionResponse>(
                  this, METHODID_RECOGNIZE_FACE)))
          .build();
    }
  }

  /**
   */
  public static final class MovementStub extends io.grpc.stub.AbstractStub<MovementStub> {
    private MovementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovementStub(channel, callOptions);
    }

    /**
     */
    public void detectionMotion(sss.Movement.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<sss.Movement.MotionDetectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectionMotionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *2.1.1	RPC Method 1 Motion Detection
     *Server request Client to return a message if there is an object moving.
     *simple rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sss.Movement.RecognitionRequest> recognizeFace(
        io.grpc.stub.StreamObserver<sss.Movement.RecognitionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecognizeFaceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MovementBlockingStub extends io.grpc.stub.AbstractStub<MovementBlockingStub> {
    private MovementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovementBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.Movement.MotionDetectionResponse detectionMotion(sss.Movement.MotionDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectionMotionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovementFutureStub extends io.grpc.stub.AbstractStub<MovementFutureStub> {
    private MovementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.Movement.MotionDetectionResponse> detectionMotion(
        sss.Movement.MotionDetectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectionMotionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECTION_MOTION = 0;
  private static final int METHODID_RECOGNIZE_FACE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECTION_MOTION:
          serviceImpl.detectionMotion((sss.Movement.MotionDetectionRequest) request,
              (io.grpc.stub.StreamObserver<sss.Movement.MotionDetectionResponse>) responseObserver);
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
        case METHODID_RECOGNIZE_FACE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recognizeFace(
              (io.grpc.stub.StreamObserver<sss.Movement.RecognitionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MovementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.Movement.MovementImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Movement");
    }
  }

  private static final class MovementFileDescriptorSupplier
      extends MovementBaseDescriptorSupplier {
    MovementFileDescriptorSupplier() {}
  }

  private static final class MovementMethodDescriptorSupplier
      extends MovementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovementMethodDescriptorSupplier(String methodName) {
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
      synchronized (MovementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovementFileDescriptorSupplier())
              .addMethod(getDetectionMotionMethod())
              .addMethod(getRecognizeFaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
