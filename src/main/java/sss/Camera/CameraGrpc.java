package sss.Camera;

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
    comments = "Source: Camera.proto")
public final class CameraGrpc {

  private CameraGrpc() {}

  public static final String SERVICE_NAME = "sss.Camera";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.Camera.CameraRequest,
      sss.Camera.CameraResponse> getCameraServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CameraService",
      requestType = sss.Camera.CameraRequest.class,
      responseType = sss.Camera.CameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sss.Camera.CameraRequest,
      sss.Camera.CameraResponse> getCameraServiceMethod() {
    io.grpc.MethodDescriptor<sss.Camera.CameraRequest, sss.Camera.CameraResponse> getCameraServiceMethod;
    if ((getCameraServiceMethod = CameraGrpc.getCameraServiceMethod) == null) {
      synchronized (CameraGrpc.class) {
        if ((getCameraServiceMethod = CameraGrpc.getCameraServiceMethod) == null) {
          CameraGrpc.getCameraServiceMethod = getCameraServiceMethod = 
              io.grpc.MethodDescriptor.<sss.Camera.CameraRequest, sss.Camera.CameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sss.Camera", "CameraService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Camera.CameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.Camera.CameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraMethodDescriptorSupplier("CameraService"))
                  .build();
          }
        }
     }
     return getCameraServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraStub newStub(io.grpc.Channel channel) {
    return new CameraStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraFutureStub(channel);
  }

  /**
   */
  public static abstract class CameraImplBase implements io.grpc.BindableService {

    /**
     */
    public void cameraService(sss.Camera.CameraRequest request,
        io.grpc.stub.StreamObserver<sss.Camera.CameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCameraServiceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sss.Camera.CameraRequest,
                sss.Camera.CameraResponse>(
                  this, METHODID_CAMERA_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class CameraStub extends io.grpc.stub.AbstractStub<CameraStub> {
    private CameraStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraStub(channel, callOptions);
    }

    /**
     */
    public void cameraService(sss.Camera.CameraRequest request,
        io.grpc.stub.StreamObserver<sss.Camera.CameraResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCameraServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CameraBlockingStub extends io.grpc.stub.AbstractStub<CameraBlockingStub> {
    private CameraBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<sss.Camera.CameraResponse> cameraService(
        sss.Camera.CameraRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCameraServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CameraFutureStub extends io.grpc.stub.AbstractStub<CameraFutureStub> {
    private CameraFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CAMERA_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAMERA_SERVICE:
          serviceImpl.cameraService((sss.Camera.CameraRequest) request,
              (io.grpc.stub.StreamObserver<sss.Camera.CameraResponse>) responseObserver);
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

  private static abstract class CameraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.Camera.CameraImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Camera");
    }
  }

  private static final class CameraFileDescriptorSupplier
      extends CameraBaseDescriptorSupplier {
    CameraFileDescriptorSupplier() {}
  }

  private static final class CameraMethodDescriptorSupplier
      extends CameraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraFileDescriptorSupplier())
              .addMethod(getCameraServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
