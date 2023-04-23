package sss.Movement;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sss.Movement.MovementGrpc.MovementBlockingStub;
import sss.Movement.MovementGrpc.MovementStub;

import java.io.IOException;
import javax.jmdns.JmDNS;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;

public class Movement_Client {

    private static final String SERVICE_TYPE = "_movement._tcp.local.";
    private static final String SERVICE_NAME = "movement_server";

    public static void main(String[] args) throws IOException {

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

        MovementBlockingStub blockingstub = MovementGrpc.newBlockingStub(channel);
        MotionDetectionRequest motiondetectionrequest = MotionDetectionRequest.newBuilder().setIsMoving(true).build();// creat request
        MotionDetectionResponse motiondetectionresponse = blockingstub.detectionMotion(motiondetectionrequest);// get response
        System.out.println(motiondetectionresponse.getMovingResponse());// print result
        MovementStub stub = MovementGrpc.newStub(channel);
        StreamObserver<RecognitionResponse> responseObserver = new StreamObserver<RecognitionResponse>() {
            @Override
            public void onNext(RecognitionResponse recognitionResponse) {
                System.out.println(recognitionResponse.getIsBlacklisted());
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
        StreamObserver<RecognitionRequest> requestObserver = stub.recognizeFace(responseObserver);
        requestObserver.onNext(RecognitionRequest.newBuilder()
        .setImage(ByteString.copyFrom(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}))
        .build());
        requestObserver.onCompleted();
        try {
            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // handle interruption
        }


    }//main
}//class Movement_Client
