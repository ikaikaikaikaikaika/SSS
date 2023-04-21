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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class ServiceRouteGrpc {

  private ServiceRouteGrpc() {}

  public static final String SERVICE_NAME = "sss.ServiceRoute";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.HelloRequest,
      sss.generated.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = sss.generated.HelloRequest.class,
      responseType = sss.generated.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.HelloRequest,
      sss.generated.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<sss.generated.HelloRequest, sss.generated.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = ServiceRouteGrpc.getSayHelloMethod) == null) {
      synchronized (ServiceRouteGrpc.class) {
        if ((getSayHelloMethod = ServiceRouteGrpc.getSayHelloMethod) == null) {
          ServiceRouteGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<sss.generated.HelloRequest, sss.generated.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.ServiceRoute", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceRouteMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
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
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ServiceRouteImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(sss.generated.HelloRequest request,
        io.grpc.stub.StreamObserver<sss.generated.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.HelloRequest,
                sss.generated.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(sss.generated.HelloRequest request,
        io.grpc.stub.StreamObserver<sss.generated.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public sss.generated.HelloReply sayHello(sss.generated.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.HelloReply> sayHello(
        sss.generated.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((sss.generated.HelloRequest) request,
              (io.grpc.stub.StreamObserver<sss.generated.HelloReply>) responseObserver);
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
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
