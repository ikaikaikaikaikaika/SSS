package sss.Movement;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sss.Movement.MovementGrpc.MovementBlockingStub;
import sss.Movement.MovementGrpc.MovementStub;

import java.io.IOException;
import javax.jmdns.JmDNS;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;


public class Movement_Client {
    private static final String SERVICE_TYPE = "_sss._tcp.local.";
    private static final String SERVICE_NAME = "movement_server";

    public static void main(String[] args) throws IOException {

        
        Movingdetected(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
 

    }//main
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
    }


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


}//class Movement_Client
