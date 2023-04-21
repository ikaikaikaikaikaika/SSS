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
 *4.1.1	RPC Method 1 Bidirectional Intercom
 *Bidirectional Intercom service is work between the server and client.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sss.proto")
public final class BidirectionalIntercomGrpc {

  private BidirectionalIntercomGrpc() {}

  public static final String SERVICE_NAME = "sss.BidirectionalIntercom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sss.generated.AudioData_Client,
      sss.generated.AudioData_Server> getServerToClientAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Server_to_Client_Audio",
      requestType = sss.generated.AudioData_Client.class,
      responseType = sss.generated.AudioData_Server.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.AudioData_Client,
      sss.generated.AudioData_Server> getServerToClientAudioMethod() {
    io.grpc.MethodDescriptor<sss.generated.AudioData_Client, sss.generated.AudioData_Server> getServerToClientAudioMethod;
    if ((getServerToClientAudioMethod = BidirectionalIntercomGrpc.getServerToClientAudioMethod) == null) {
      synchronized (BidirectionalIntercomGrpc.class) {
        if ((getServerToClientAudioMethod = BidirectionalIntercomGrpc.getServerToClientAudioMethod) == null) {
          BidirectionalIntercomGrpc.getServerToClientAudioMethod = getServerToClientAudioMethod = 
              io.grpc.MethodDescriptor.<sss.generated.AudioData_Client, sss.generated.AudioData_Server>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.BidirectionalIntercom", "Server_to_Client_Audio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.AudioData_Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.AudioData_Server.getDefaultInstance()))
                  .setSchemaDescriptor(new BidirectionalIntercomMethodDescriptorSupplier("Server_to_Client_Audio"))
                  .build();
          }
        }
     }
     return getServerToClientAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sss.generated.AudioData_Server,
      sss.generated.AudioData_Client> getClientToServerAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Client_to_Server_Audio",
      requestType = sss.generated.AudioData_Server.class,
      responseType = sss.generated.AudioData_Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sss.generated.AudioData_Server,
      sss.generated.AudioData_Client> getClientToServerAudioMethod() {
    io.grpc.MethodDescriptor<sss.generated.AudioData_Server, sss.generated.AudioData_Client> getClientToServerAudioMethod;
    if ((getClientToServerAudioMethod = BidirectionalIntercomGrpc.getClientToServerAudioMethod) == null) {
      synchronized (BidirectionalIntercomGrpc.class) {
        if ((getClientToServerAudioMethod = BidirectionalIntercomGrpc.getClientToServerAudioMethod) == null) {
          BidirectionalIntercomGrpc.getClientToServerAudioMethod = getClientToServerAudioMethod = 
              io.grpc.MethodDescriptor.<sss.generated.AudioData_Server, sss.generated.AudioData_Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sss.BidirectionalIntercom", "Client_to_Server_Audio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.AudioData_Server.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sss.generated.AudioData_Client.getDefaultInstance()))
                  .setSchemaDescriptor(new BidirectionalIntercomMethodDescriptorSupplier("Client_to_Server_Audio"))
                  .build();
          }
        }
     }
     return getClientToServerAudioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BidirectionalIntercomStub newStub(io.grpc.Channel channel) {
    return new BidirectionalIntercomStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BidirectionalIntercomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BidirectionalIntercomBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BidirectionalIntercomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BidirectionalIntercomFutureStub(channel);
  }

  /**
   * <pre>
   *4.1.1	RPC Method 1 Bidirectional Intercom
   *Bidirectional Intercom service is work between the server and client.
   * </pre>
   */
  public static abstract class BidirectionalIntercomImplBase implements io.grpc.BindableService {

    /**
     */
    public void serverToClientAudio(sss.generated.AudioData_Client request,
        io.grpc.stub.StreamObserver<sss.generated.AudioData_Server> responseObserver) {
      asyncUnimplementedUnaryCall(getServerToClientAudioMethod(), responseObserver);
    }

    /**
     */
    public void clientToServerAudio(sss.generated.AudioData_Server request,
        io.grpc.stub.StreamObserver<sss.generated.AudioData_Client> responseObserver) {
      asyncUnimplementedUnaryCall(getClientToServerAudioMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServerToClientAudioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.AudioData_Client,
                sss.generated.AudioData_Server>(
                  this, METHODID_SERVER_TO_CLIENT_AUDIO)))
          .addMethod(
            getClientToServerAudioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sss.generated.AudioData_Server,
                sss.generated.AudioData_Client>(
                  this, METHODID_CLIENT_TO_SERVER_AUDIO)))
          .build();
    }
  }

  /**
   * <pre>
   *4.1.1	RPC Method 1 Bidirectional Intercom
   *Bidirectional Intercom service is work between the server and client.
   * </pre>
   */
  public static final class BidirectionalIntercomStub extends io.grpc.stub.AbstractStub<BidirectionalIntercomStub> {
    private BidirectionalIntercomStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalIntercomStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalIntercomStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalIntercomStub(channel, callOptions);
    }

    /**
     */
    public void serverToClientAudio(sss.generated.AudioData_Client request,
        io.grpc.stub.StreamObserver<sss.generated.AudioData_Server> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServerToClientAudioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clientToServerAudio(sss.generated.AudioData_Server request,
        io.grpc.stub.StreamObserver<sss.generated.AudioData_Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientToServerAudioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *4.1.1	RPC Method 1 Bidirectional Intercom
   *Bidirectional Intercom service is work between the server and client.
   * </pre>
   */
  public static final class BidirectionalIntercomBlockingStub extends io.grpc.stub.AbstractStub<BidirectionalIntercomBlockingStub> {
    private BidirectionalIntercomBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalIntercomBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalIntercomBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalIntercomBlockingStub(channel, callOptions);
    }

    /**
     */
    public sss.generated.AudioData_Server serverToClientAudio(sss.generated.AudioData_Client request) {
      return blockingUnaryCall(
          getChannel(), getServerToClientAudioMethod(), getCallOptions(), request);
    }

    /**
     */
    public sss.generated.AudioData_Client clientToServerAudio(sss.generated.AudioData_Server request) {
      return blockingUnaryCall(
          getChannel(), getClientToServerAudioMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *4.1.1	RPC Method 1 Bidirectional Intercom
   *Bidirectional Intercom service is work between the server and client.
   * </pre>
   */
  public static final class BidirectionalIntercomFutureStub extends io.grpc.stub.AbstractStub<BidirectionalIntercomFutureStub> {
    private BidirectionalIntercomFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalIntercomFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalIntercomFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalIntercomFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.AudioData_Server> serverToClientAudio(
        sss.generated.AudioData_Client request) {
      return futureUnaryCall(
          getChannel().newCall(getServerToClientAudioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sss.generated.AudioData_Client> clientToServerAudio(
        sss.generated.AudioData_Server request) {
      return futureUnaryCall(
          getChannel().newCall(getClientToServerAudioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVER_TO_CLIENT_AUDIO = 0;
  private static final int METHODID_CLIENT_TO_SERVER_AUDIO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BidirectionalIntercomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BidirectionalIntercomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_TO_CLIENT_AUDIO:
          serviceImpl.serverToClientAudio((sss.generated.AudioData_Client) request,
              (io.grpc.stub.StreamObserver<sss.generated.AudioData_Server>) responseObserver);
          break;
        case METHODID_CLIENT_TO_SERVER_AUDIO:
          serviceImpl.clientToServerAudio((sss.generated.AudioData_Server) request,
              (io.grpc.stub.StreamObserver<sss.generated.AudioData_Client>) responseObserver);
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

  private static abstract class BidirectionalIntercomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BidirectionalIntercomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sss.generated.ServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BidirectionalIntercom");
    }
  }

  private static final class BidirectionalIntercomFileDescriptorSupplier
      extends BidirectionalIntercomBaseDescriptorSupplier {
    BidirectionalIntercomFileDescriptorSupplier() {}
  }

  private static final class BidirectionalIntercomMethodDescriptorSupplier
      extends BidirectionalIntercomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BidirectionalIntercomMethodDescriptorSupplier(String methodName) {
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
      synchronized (BidirectionalIntercomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BidirectionalIntercomFileDescriptorSupplier())
              .addMethod(getServerToClientAudioMethod())
              .addMethod(getClientToServerAudioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
