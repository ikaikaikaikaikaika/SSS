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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class ServiceRouteGrpc {

  private ServiceRouteGrpc() {}

  public static final String SERVICE_NAME = "sss.ServiceRoute";

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
    if ((getDetectionMotionMethod = ServiceRouteGrpc.getDetectionMotionMethod) == null) {
      synchronized (ServiceRouteGrpc.class) {
        if ((getDetectionMotionMethod = ServiceRouteGrpc.getDetectionMotionMethod) == null) {
          ServiceRouteGrpc.getDetectionMotionMethod = getDetectionMotionMethod = 
              io.grpc.MethodDescriptor.<sss.generated.MotionDetectionRequest, sss.generated.MotionDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.ServiceRoute", "DetectionMotion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MotionDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MotionDetectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceRouteMethodDescriptorSupplier("DetectionMotion"))
                  .build();
          }
        }
     }
     return getDetectionMotionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceRouteStub newStub(io.grpc.Channel channel) {
    return new ServiceRouteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceRouteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceRouteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceRouteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceRouteFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceRouteImplBase implements io.grpc.BindableService {

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
   */
  public static final class ServiceRouteStub extends io.grpc.stub.AbstractStub<ServiceRouteStub> {
    private ServiceRouteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceRouteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRouteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceRouteStub(channel, callOptions);
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
   */
  public static final class ServiceRouteBlockingStub extends io.grpc.stub.AbstractStub<ServiceRouteBlockingStub> {
    private ServiceRouteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceRouteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRouteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceRouteBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.MotionDetectionResponse detectionMotion(sss.generated.MotionDetectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectionMotionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceRouteFutureStub extends io.grpc.stub.AbstractStub<ServiceRouteFutureStub> {
    private ServiceRouteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceRouteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceRouteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceRouteFutureStub(channel, callOptions);
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
    private final ServiceRouteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceRouteImplBase serviceImpl, int methodId) {
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

  private static abstract class ServiceRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceRouteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceRoute");
    }
  }

  private static final class ServiceRouteFileDescriptorSupplier
      extends ServiceRouteBaseDescriptorSupplier {
    ServiceRouteFileDescriptorSupplier() {}
  }

  private static final class ServiceRouteMethodDescriptorSupplier
      extends ServiceRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceRouteMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceRouteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceRouteFileDescriptorSupplier())
              .addMethod(getDetectionMotionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
