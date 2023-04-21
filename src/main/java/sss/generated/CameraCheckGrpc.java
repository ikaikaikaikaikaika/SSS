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
 *4.1.2	RPC Method 2 Camera Check
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class CameraCheckGrpc {

  private CameraCheckGrpc() {}

  public static final String SERVICE_NAME = "sss.CameraCheck";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.StreamRequest,
      sss.generated.StreamResponse> getCameraServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CameraService",
      requestType = sss.generated.StreamRequest.class,
      responseType = sss.generated.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.StreamRequest,
      sss.generated.StreamResponse> getCameraServiceMethod() {
    io.grpc.MethodDescriptor<sss.generated.StreamRequest, sss.generated.StreamResponse> getCameraServiceMethod;
    if ((getCameraServiceMethod = CameraCheckGrpc.getCameraServiceMethod) == null) {
      synchronized (CameraCheckGrpc.class) {
        if ((getCameraServiceMethod = CameraCheckGrpc.getCameraServiceMethod) == null) {
          CameraCheckGrpc.getCameraServiceMethod = getCameraServiceMethod = 
              io.grpc.MethodDescriptor.<sss.generated.StreamRequest, sss.generated.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.CameraCheck", "CameraService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraCheckMethodDescriptorSupplier("CameraService"))
                  .build();
          }
        }
     }
     return getCameraServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraCheckStub newStub(io.grpc.Channel channel) {
    return new CameraCheckStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraCheckBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraCheckBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraCheckFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraCheckFutureStub(channel);
  }

  /**
   * <pre>
   *4.1.2	RPC Method 2 Camera Check
   * </pre>
   */
  public static abstract class CameraCheckImplBase implements io.grpc.BindableService {

    /**
     */
    public void cameraService(sss.generated.StreamRequest request,
        io.grpc.stub.StreamObserver<sss.generated.StreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCameraServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.StreamRequest,
                sss.generated.StreamResponse>(
                  this, METHODID_CAMERA_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   *4.1.2	RPC Method 2 Camera Check
   * </pre>
   */
  public static final class CameraCheckStub extends io.grpc.stub.AbstractStub<CameraCheckStub> {
    private CameraCheckStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraCheckStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraCheckStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraCheckStub(channel, callOptions);
    }

    /**
     */
    public void cameraService(sss.generated.StreamRequest request,
        io.grpc.stub.StreamObserver<sss.generated.StreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCameraServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *4.1.2	RPC Method 2 Camera Check
   * </pre>
   */
  public static final class CameraCheckBlockingStub extends io.grpc.stub.AbstractStub<CameraCheckBlockingStub> {
    private CameraCheckBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraCheckBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraCheckBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraCheckBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.StreamResponse cameraService(sss.generated.StreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getCameraServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *4.1.2	RPC Method 2 Camera Check
   * </pre>
   */
  public static final class CameraCheckFutureStub extends io.grpc.stub.AbstractStub<CameraCheckFutureStub> {
    private CameraCheckFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraCheckFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraCheckFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraCheckFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.StreamResponse> cameraService(
        sss.generated.StreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCameraServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAMERA_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraCheckImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraCheckImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAMERA_SERVICE:
          serviceImpl.cameraService((sss.generated.StreamRequest) request,
              (io.grpc.stub.StreamObserver<sss.generated.StreamResponse>) responseObserver);
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

  private static abstract class CameraCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraCheckBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraCheck");
    }
  }

  private static final class CameraCheckFileDescriptorSupplier
      extends CameraCheckBaseDescriptorSupplier {
    CameraCheckFileDescriptorSupplier() {}
  }

  private static final class CameraCheckMethodDescriptorSupplier
      extends CameraCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraCheckMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraCheckGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraCheckFileDescriptorSupplier())
              .addMethod(getCameraServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
