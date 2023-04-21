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
 *2.1.2	RPC Method 2 Face Recognition
 *Client sent image to Server to ask it is the object in blacklist.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class FaceRecognitionGrpc {

  private FaceRecognitionGrpc() {}

  public static final String SERVICE_NAME = "sss.FaceRecognition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.RecognitionRequest,
      sss.generated.RecognitionResponse> getRecognizeFaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecognizeFace",
      requestType = sss.generated.RecognitionRequest.class,
      responseType = sss.generated.RecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.RecognitionRequest,
      sss.generated.RecognitionResponse> getRecognizeFaceMethod() {
    io.grpc.MethodDescriptor<sss.generated.RecognitionRequest, sss.generated.RecognitionResponse> getRecognizeFaceMethod;
    if ((getRecognizeFaceMethod = FaceRecognitionGrpc.getRecognizeFaceMethod) == null) {
      synchronized (FaceRecognitionGrpc.class) {
        if ((getRecognizeFaceMethod = FaceRecognitionGrpc.getRecognizeFaceMethod) == null) {
          FaceRecognitionGrpc.getRecognizeFaceMethod = getRecognizeFaceMethod = 
              io.grpc.MethodDescriptor.<sss.generated.RecognitionRequest, sss.generated.RecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.FaceRecognition", "RecognizeFace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.RecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.RecognitionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FaceRecognitionMethodDescriptorSupplier("RecognizeFace"))
                  .build();
          }
        }
     }
     return getRecognizeFaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FaceRecognitionStub newStub(io.grpc.Channel channel) {
    return new FaceRecognitionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaceRecognitionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FaceRecognitionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaceRecognitionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FaceRecognitionFutureStub(channel);
  }

  /**
   * <pre>
   *2.1.2	RPC Method 2 Face Recognition
   *Client sent image to Server to ask it is the object in blacklist.
   * </pre>
   */
  public static abstract class FaceRecognitionImplBase implements io.grpc.BindableService {

    /**
     */
    public void recognizeFace(sss.generated.RecognitionRequest request,
        io.grpc.stub.StreamObserver<sss.generated.RecognitionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecognizeFaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecognizeFaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.RecognitionRequest,
                sss.generated.RecognitionResponse>(
                  this, METHODID_RECOGNIZE_FACE)))
          .build();
    }
  }

  /**
   * <pre>
   *2.1.2	RPC Method 2 Face Recognition
   *Client sent image to Server to ask it is the object in blacklist.
   * </pre>
   */
  public static final class FaceRecognitionStub extends io.grpc.stub.AbstractStub<FaceRecognitionStub> {
    private FaceRecognitionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceRecognitionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceRecognitionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceRecognitionStub(channel, callOptions);
    }

    /**
     */
    public void recognizeFace(sss.generated.RecognitionRequest request,
        io.grpc.stub.StreamObserver<sss.generated.RecognitionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecognizeFaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *2.1.2	RPC Method 2 Face Recognition
   *Client sent image to Server to ask it is the object in blacklist.
   * </pre>
   */
  public static final class FaceRecognitionBlockingStub extends io.grpc.stub.AbstractStub<FaceRecognitionBlockingStub> {
    private FaceRecognitionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceRecognitionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceRecognitionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceRecognitionBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.RecognitionResponse recognizeFace(sss.generated.RecognitionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecognizeFaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *2.1.2	RPC Method 2 Face Recognition
   *Client sent image to Server to ask it is the object in blacklist.
   * </pre>
   */
  public static final class FaceRecognitionFutureStub extends io.grpc.stub.AbstractStub<FaceRecognitionFutureStub> {
    private FaceRecognitionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaceRecognitionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FaceRecognitionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaceRecognitionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.RecognitionResponse> recognizeFace(
        sss.generated.RecognitionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecognizeFaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOGNIZE_FACE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FaceRecognitionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FaceRecognitionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOGNIZE_FACE:
          serviceImpl.recognizeFace((sss.generated.RecognitionRequest) request,
              (io.grpc.stub.StreamObserver<sss.generated.RecognitionResponse>) responseObserver);
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

  private static abstract class FaceRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FaceRecognitionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FaceRecognition");
    }
  }

  private static final class FaceRecognitionFileDescriptorSupplier
      extends FaceRecognitionBaseDescriptorSupplier {
    FaceRecognitionFileDescriptorSupplier() {}
  }

  private static final class FaceRecognitionMethodDescriptorSupplier
      extends FaceRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FaceRecognitionMethodDescriptorSupplier(String methodName) {
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
      synchronized (FaceRecognitionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FaceRecognitionFileDescriptorSupplier())
              .addMethod(getRecognizeFaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
