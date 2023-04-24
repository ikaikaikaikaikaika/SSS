package sss;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import sss.Movement.*;
import sss.Movement.MovementGrpc.MovementBlockingStub;
import sss.Movement.MovementGrpc.MovementStub;
import sss.MessageAudio.*;
import sss.MessageAudio.MessageAudioGrpc.MessageAudioBlockingStub;
import sss.MessageAudio.MessageAudioGrpc.MessageAudioStub;
import sss.Camera.*;
import sss.Camera.CameraGrpc.CameraStub;

import java.io.IOException;
import javax.jmdns.JmDNS;
import java.net.InetAddress;
import javax.jmdns.ServiceInfo;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import com.google.protobuf.ByteString;

public class allClient{
    private static final String SERVICE_TYPE = "_sss._tcp.local.";
    public static void main(String[] args) throws UnknownHostException, IOException {
        Movingdetected(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        sendmessage("Hi Server i'm Client");
        sendvoice(new byte[]{1,2,4});
        stream("123");
    }

    public static ManagedChannel connecttoserver(String servicename) throws UnknownHostException, IOException{
        // Discover service using JmDNS
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo[] serviceInfos = jmdns.list(SERVICE_TYPE);
        String serviceUrl=null;
        for (ServiceInfo serviceInfo : serviceInfos) {
            if (serviceInfo.getName().equals(servicename)) {
                serviceUrl = String.format("localhost:%d", serviceInfo.getPort());
                System.out.println("Found service: " + servicename + " at: " + serviceUrl);
                break;
            }
        }
        jmdns.close();
        ManagedChannel channel = ManagedChannelBuilder.forTarget(serviceUrl).usePlaintext().build();
        return channel;
    }//connecttoserver

    public static void sendvoice(byte[]voice) throws UnknownHostException, IOException{
        String sevice="messageaudio_server";
        ManagedChannel channel=connecttoserver(sevice);
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
        .setAudiosend(ByteString.copyFrom(voice))
        .build());
        requestObserver.onNext(AudioRequest.newBuilder()
        .setAudiosend(ByteString.copyFrom(new byte[]{1,2,3}))
        .build());
        requestObserver.onCompleted();
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle interruption
        }
    }//sendvoice
    
    public static void stream(String cameraid) throws UnknownHostException, IOException{
        String sevice="camera_server";
        ManagedChannel channel=connecttoserver(sevice);
        CameraStub stub = CameraGrpc.newStub(channel);
        CameraRequest camera = CameraRequest.newBuilder().setCamera(cameraid).build();

        StreamObserver<CameraResponse> responseObserver = new StreamObserver<CameraResponse>() {
            @Override
            public void onNext(CameraResponse audioRespon) {
                ByteString videoString = audioRespon.getFrame();
                System.out.println(videoString);
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
        stub.cameraService(camera,responseObserver);
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle interruption
        }
    }

    public static void sendmessage(String message) throws UnknownHostException, IOException{
        String sevice="messageaudio_server";
        ManagedChannel channel=connecttoserver(sevice);
        MessageAudioBlockingStub blockingstub = MessageAudioGrpc.newBlockingStub(channel);
        MessageRequest messagerequest = MessageRequest.newBuilder().setRequest(message).build();// creat request
        MessageResponse messageResponse = blockingstub.pushMessage(messagerequest);// get response
        System.out.println(messageResponse.getMessage());// print result
        channel.shutdown();
    }//sendmessage

    public static void Movingdetected(byte[]img) throws UnknownHostException, IOException{
        String sevice="movement_server";
        ManagedChannel channel=connecttoserver(sevice);
        MovementStub stub = MovementGrpc.newStub(channel);
        StreamObserver<RecognitionResponse> responseObserver = new StreamObserver<RecognitionResponse>() {
           String object;
            @Override
            public void onNext(RecognitionResponse recognitionResponse) {
                if(recognitionResponse.getIsBlacklisted()){
                    object="Someone in Blacklist";
                }
                else{
                    object="Unknow or in Whitelist";
                }
            }
        
            @Override
			public void onError(Throwable t) {
			}
        
            @Override
            public void onCompleted() {
                MovementBlockingStub blockingstub = MovementGrpc.newBlockingStub(channel);
                MotionDetectionRequest motiondetectionrequest = MotionDetectionRequest.newBuilder().setIsMoving(true).build();// creat request
                MotionDetectionResponse motiondetectionresponse = blockingstub.detectionMotion(motiondetectionrequest);// get response
                String result=object+motiondetectionresponse.getMovingResponse();
                System.out.println(result);// print result
                System.out.println("Request completed.");
                channel.shutdown();
            }
        };
        StreamObserver<RecognitionRequest> requestObserver = stub.recognizeFace(responseObserver);
        requestObserver.onNext(RecognitionRequest.newBuilder()
        .setImage(ByteString.copyFrom(img))
        .build());
        requestObserver.onCompleted();
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle interruption
        }
    }//Movingdetected

}