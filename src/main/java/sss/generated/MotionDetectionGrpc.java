package sss.generated;

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
 *2.1.1	RPC Method 1 Motion Detection
 *Server request Client to return a message if there is an object moving.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class MotionDetectionGrpc {

  private MotionDetectionGrpc() {}

  public static final String SERVICE_NAME = "sss.MotionDetection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.MotionDetectionRequest,
      sss.generated.MotionDetectionResponse> getDetectionMotionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectionMotion",
      requestType = sss.generated.MotionDetectionRequest.class,
      responseType = sss.generated.MotionDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.MotionDetectionRequest,
      sss.generated.MotionDetectionResponse> getDetectionMotionMethod() {
    io.grpc.MethodDescriptor<sss.generated.MotionDetectionRequest, sss.generated.MotionDetectionResponse> getDetectionMotionMethod;
    if ((getDetectionMotionMethod = MotionDetectionGrpc.getDetectionMotionMethod) == null) {
      synchronized (MotionDetectionGrpc.class) {
        if ((getDetectionMotionMethod = MotionDetectionGrpc.getDetectionMotionMethod) == null) {
          MotionDetectionGrpc.getDetectionMotionMethod = getDetectionMotionMethod = 
              io.grpc.MethodDescriptor.<sss.generated.MotionDetectionRequest, sss.generated.MotionDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.MotionDetection", "DetectionMotion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MotionDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MotionDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MotionDetectionMethodDescriptorSupplier("DetectionMotion"))
                  .build();
          }
        }
     }
     return getDetectionMotionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MotionDetectionStub newStub(io.grpc.Channel channel) {
    return new MotionDetectionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionDetectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MotionDetectionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionDetectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MotionDetectionFutureStub(channel);
  }

  /**
   * <pre>
   *2.1.1	RPC Method 1 Motion Detection
   *Server request Client to return a message if there is an object moving.
   * </pre>
   */
  public static abstract class MotionDetectionImplBase implements io.grpc.BindableService {

    /**
     */
    public void detectionMotion(sss.generated.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<sss.generated.MotionDetectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectionMotionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectionMotionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.MotionDetectionRequest,
                sss.generated.MotionDetectionResponse>(
                  this, METHODID_DETECTION_MOTION)))
          .build();
    }
  }

  /**
   * <pre>
   *2.1.1	RPC Method 1 Motion Detection
   *Server request Client to return a message if there is an object moving.
   * </pre>
   */
  public static final class MotionDetectionStub extends io.grpc.stub.AbstractStub<MotionDetectionStub> {
    private MotionDetectionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionDetectionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionDetectionStub(channel, callOptions);
    }

    /**
     */
    public void detectionMotion(sss.generated.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<sss.generated.MotionDetectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectionMotionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *2.1.1	RPC Method 1 Motion Detection
   *Server request Client to return a message if there is an object moving.
   * </pre>
   */
  public static final class MotionDetectionBlockingStub extends io.grpc.stub.AbstractStub<MotionDetectionBlockingStub> {
    private MotionDetectionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionDetectionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionDetectionBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.MotionDetectionResponse detectionMotion(sss.generated.MotionDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectionMotionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *2.1.1	RPC Method 1 Motion Detection
   *Server request Client to return a message if there is an object moving.
   * </pre>
   */
  public static final class MotionDetectionFutureStub extends io.grpc.stub.AbstractStub<MotionDetectionFutureStub> {
    private MotionDetectionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MotionDetectionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MotionDetectionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.MotionDetectionResponse> detectionMotion(
        sss.generated.MotionDetectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectionMotionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECTION_MOTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MotionDetectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MotionDetectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECTION_MOTION:
          serviceImpl.detectionMotion((sss.generated.MotionDetectionRequest) request,
              (io.grpc.stub.StreamObserver<sss.generated.MotionDetectionResponse>) responseObserver);
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

  private static abstract class MotionDetectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MotionDetectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MotionDetection");
    }
  }

  private static final class MotionDetectionFileDescriptorSupplier
      extends MotionDetectionBaseDescriptorSupplier {
    MotionDetectionFileDescriptorSupplier() {}
  }

  private static final class MotionDetectionMethodDescriptorSupplier
      extends MotionDetectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MotionDetectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (MotionDetectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MotionDetectionFileDescriptorSupplier())
              .addMethod(getDetectionMotionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
