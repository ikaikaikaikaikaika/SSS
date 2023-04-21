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
 *3.1.1	RPC Method 1 Message Push
 *Client request Server to return a message if there is an object in black list.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class MessagePushGrpc {

  private MessagePushGrpc() {}

  public static final String SERVICE_NAME = "sss.MessagePush";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.MessageRequest,
      sss.generated.MessageResponse> getPushMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushMessage",
      requestType = sss.generated.MessageRequest.class,
      responseType = sss.generated.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.MessageRequest,
      sss.generated.MessageResponse> getPushMessageMethod() {
    io.grpc.MethodDescriptor<sss.generated.MessageRequest, sss.generated.MessageResponse> getPushMessageMethod;
    if ((getPushMessageMethod = MessagePushGrpc.getPushMessageMethod) == null) {
      synchronized (MessagePushGrpc.class) {
        if ((getPushMessageMethod = MessagePushGrpc.getPushMessageMethod) == null) {
          MessagePushGrpc.getPushMessageMethod = getPushMessageMethod = 
              io.grpc.MethodDescriptor.<sss.generated.MessageRequest, sss.generated.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.MessagePush", "PushMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.MessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagePushMethodDescriptorSupplier("PushMessage"))
                  .build();
          }
        }
     }
     return getPushMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagePushStub newStub(io.grpc.Channel channel) {
    return new MessagePushStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagePushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessagePushBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagePushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessagePushFutureStub(channel);
  }

  /**
   * <pre>
   *3.1.1	RPC Method 1 Message Push
   *Client request Server to return a message if there is an object in black list.
   * </pre>
   */
  public static abstract class MessagePushImplBase implements io.grpc.BindableService {

    /**
     */
    public void pushMessage(sss.generated.MessageRequest request,
        io.grpc.stub.StreamObserver<sss.generated.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.MessageRequest,
                sss.generated.MessageResponse>(
                  this, METHODID_PUSH_MESSAGE)))
          .build();
    }
  }

  /**
   * <pre>
   *3.1.1	RPC Method 1 Message Push
   *Client request Server to return a message if there is an object in black list.
   * </pre>
   */
  public static final class MessagePushStub extends io.grpc.stub.AbstractStub<MessagePushStub> {
    private MessagePushStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagePushStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagePushStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagePushStub(channel, callOptions);
    }

    /**
     */
    public void pushMessage(sss.generated.MessageRequest request,
        io.grpc.stub.StreamObserver<sss.generated.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *3.1.1	RPC Method 1 Message Push
   *Client request Server to return a message if there is an object in black list.
   * </pre>
   */
  public static final class MessagePushBlockingStub extends io.grpc.stub.AbstractStub<MessagePushBlockingStub> {
    private MessagePushBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagePushBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagePushBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagePushBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.MessageResponse pushMessage(sss.generated.MessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *3.1.1	RPC Method 1 Message Push
   *Client request Server to return a message if there is an object in black list.
   * </pre>
   */
  public static final class MessagePushFutureStub extends io.grpc.stub.AbstractStub<MessagePushFutureStub> {
    private MessagePushFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagePushFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagePushFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagePushFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.MessageResponse> pushMessage(
        sss.generated.MessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagePushImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagePushImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH_MESSAGE:
          serviceImpl.pushMessage((sss.generated.MessageRequest) request,
              (io.grpc.stub.StreamObserver<sss.generated.MessageResponse>) responseObserver);
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

  private static abstract class MessagePushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagePushBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessagePush");
    }
  }

  private static final class MessagePushFileDescriptorSupplier
      extends MessagePushBaseDescriptorSupplier {
    MessagePushFileDescriptorSupplier() {}
  }

  private static final class MessagePushMethodDescriptorSupplier
      extends MessagePushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagePushMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagePushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagePushFileDescriptorSupplier())
              .addMethod(getPushMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
