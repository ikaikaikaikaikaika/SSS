package sss.MessageAudio;

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
    comments = "Source: MessageAudio.proto")
public final class MessageAudioGrpc {

  private MessageAudioGrpc() {}

  public static final String SERVICE_NAME = "sss.MessageAudio";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.MessageAudio.MessageRequest,
      sss.MessageAudio.MessageResponse> getPushMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushMessage",
      requestType = sss.MessageAudio.MessageRequest.class,
      responseType = sss.MessageAudio.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.MessageAudio.MessageRequest,
      sss.MessageAudio.MessageResponse> getPushMessageMethod() {
    io.grpc.MethodDescriptor<sss.MessageAudio.MessageRequest, sss.MessageAudio.MessageResponse> getPushMessageMethod;
    if ((getPushMessageMethod = MessageAudioGrpc.getPushMessageMethod) == null) {
      synchronized (MessageAudioGrpc.class) {
        if ((getPushMessageMethod = MessageAudioGrpc.getPushMessageMethod) == null) {
          MessageAudioGrpc.getPushMessageMethod = getPushMessageMethod = 
              io.grpc.MethodDescriptor.<sss.MessageAudio.MessageRequest, sss.MessageAudio.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.MessageAudio", "PushMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.MessageAudio.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.MessageAudio.MessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessageAudioMethodDescriptorSupplier("PushMessage"))
                  .build();
          }
        }
     }
     return getPushMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sss.MessageAudio.AudioRequest,
      sss.MessageAudio.AudioRespon> getAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Audio",
      requestType = sss.MessageAudio.AudioRequest.class,
      responseType = sss.MessageAudio.AudioRespon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sss.MessageAudio.AudioRequest,
      sss.MessageAudio.AudioRespon> getAudioMethod() {
    io.grpc.MethodDescriptor<sss.MessageAudio.AudioRequest, sss.MessageAudio.AudioRespon> getAudioMethod;
    if ((getAudioMethod = MessageAudioGrpc.getAudioMethod) == null) {
      synchronized (MessageAudioGrpc.class) {
        if ((getAudioMethod = MessageAudioGrpc.getAudioMethod) == null) {
          MessageAudioGrpc.getAudioMethod = getAudioMethod = 
              io.grpc.MethodDescriptor.<sss.MessageAudio.AudioRequest, sss.MessageAudio.AudioRespon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sss.MessageAudio", "Audio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.MessageAudio.AudioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.MessageAudio.AudioRespon.getDefaultInstance()))
                  .setSchemaDescriptor(new MessageAudioMethodDescriptorSupplier("Audio"))
                  .build();
          }
        }
     }
     return getAudioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageAudioStub newStub(io.grpc.Channel channel) {
    return new MessageAudioStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageAudioBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessageAudioBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageAudioFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessageAudioFutureStub(channel);
  }

  /**
   */
  public static abstract class MessageAudioImplBase implements io.grpc.BindableService {

    /**
     */
    public void pushMessage(sss.MessageAudio.MessageRequest request,
        io.grpc.stub.StreamObserver<sss.MessageAudio.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     *3.1.1	RPC Method 1 Message Push
     *Client request Server to return a message if there is an object in black list.
     *simple rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sss.MessageAudio.AudioRequest> audio(
        io.grpc.stub.StreamObserver<sss.MessageAudio.AudioRespon> responseObserver) {
      return asyncUnimplementedStreamingCall(getAudioMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.MessageAudio.MessageRequest,
                sss.MessageAudio.MessageResponse>(
                  this, METHODID_PUSH_MESSAGE)))
          .addMethod(
            getAudioMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                sss.MessageAudio.AudioRequest,
                sss.MessageAudio.AudioRespon>(
                  this, METHODID_AUDIO)))
          .build();
    }
  }

  /**
   */
  public static final class MessageAudioStub extends io.grpc.stub.AbstractStub<MessageAudioStub> {
    private MessageAudioStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageAudioStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageAudioStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageAudioStub(channel, callOptions);
    }

    /**
     */
    public void pushMessage(sss.MessageAudio.MessageRequest request,
        io.grpc.stub.StreamObserver<sss.MessageAudio.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *3.1.1	RPC Method 1 Message Push
     *Client request Server to return a message if there is an object in black list.
     *simple rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<sss.MessageAudio.AudioRequest> audio(
        io.grpc.stub.StreamObserver<sss.MessageAudio.AudioRespon> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAudioMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MessageAudioBlockingStub extends io.grpc.stub.AbstractStub<MessageAudioBlockingStub> {
    private MessageAudioBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageAudioBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageAudioBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageAudioBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.MessageAudio.MessageResponse pushMessage(sss.MessageAudio.MessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageAudioFutureStub extends io.grpc.stub.AbstractStub<MessageAudioFutureStub> {
    private MessageAudioFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageAudioFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageAudioFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageAudioFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.MessageAudio.MessageResponse> pushMessage(
        sss.MessageAudio.MessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_MESSAGE = 0;
  private static final int METHODID_AUDIO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageAudioImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageAudioImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH_MESSAGE:
          serviceImpl.pushMessage((sss.MessageAudio.MessageRequest) request,
              (io.grpc.stub.StreamObserver<sss.MessageAudio.MessageResponse>) responseObserver);
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
        case METHODID_AUDIO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.audio(
              (io.grpc.stub.StreamObserver<sss.MessageAudio.AudioRespon>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageAudioBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageAudioBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.MessageAudio.MessageAudioImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageAudio");
    }
  }

  private static final class MessageAudioFileDescriptorSupplier
      extends MessageAudioBaseDescriptorSupplier {
    MessageAudioFileDescriptorSupplier() {}
  }

  private static final class MessageAudioMethodDescriptorSupplier
      extends MessageAudioBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageAudioMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessageAudioGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageAudioFileDescriptorSupplier())
              .addMethod(getPushMessageMethod())
              .addMethod(getAudioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
