package sss.MessageAudio;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sss.MessageAudio.MessageAudioGrpc.MessageAudioBlockingStub;
import sss.MessageAudio.MessageAudioGrpc.MessageAudioStub;

import java.io.IOException;
import javax.jmdns.JmDNS;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;


public class MessageAudio_Client{
    private static final String SERVICE_TYPE = "_messageaudio._tcp.local.";
    private static final String SERVICE_NAME = "messageaudio_server";

    public static void main(String[] args) throws IOException{

        // Discover service using JmDNS
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo[] serviceInfos = jmdns.list(SERVICE_TYPE);
        String serviceUrl=null;
        for (ServiceInfo serviceInfo : serviceInfos) {
            if (serviceInfo.getName().equals(SERVICE_NAME)) {
                serviceUrl = String.format("localhost:%d", serviceInfo.getPort());
                System.out.println("Found service: " + SERVICE_NAME + " at: " + serviceUrl);
                break;
            }
        }
        jmdns.close();
        ManagedChannel channel = ManagedChannelBuilder.forTarget(serviceUrl).usePlaintext().build();
        
        MessageAudioBlockingStub blockingstub = MessageAudioGrpc.newBlockingStub(channel);
        MessageRequest messagerequest = MessageRequest.newBuilder().setRequest("Hi Server I'm Client").build();// creat request
        MessageResponse messageResponse = blockingstub.pushMessage(messagerequest);// get response
        System.out.println(messageResponse.getMessage());// print result

        MessageAudioStub stub = MessageAudioGrpc.newStub(channel);
        StreamObserver<AudioRespon> responseObserver = new StreamObserver<AudioRespon>() {
            @Override
            public void onNext(AudioRespon audioRespon) {
                ByteString Audio = audioRespon.getAudioreceived();
                System.out.println(Audio);
            }
        
            @Override
			public void onError(Throwable t) {
			}
        
            @Override
            public void onCompleted() {
                System.out.println("Request completed.");
                channel.shutdown();
            }
        };
        StreamObserver<AudioRequest> requestObserver = stub.audio(responseObserver);
        requestObserver.onNext(AudioRequest.newBuilder()
        .setAudiosend(ByteString.copyFrom(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}))
        .build());
        requestObserver.onCompleted();
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle interruption
        }
    }

}