package sss.Camera;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
//import sss.Camera.CameraGrpc.CameraBlockingStub;
import sss.Camera.CameraGrpc.CameraStub;

import java.io.IOException;
import javax.jmdns.JmDNS;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;


public class Camera_Client{
    private static final String SERVICE_TYPE = "_sss._tcp.local.";
    private static final String SERVICE_NAME = "camera_server";

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
        
        CameraStub stub = CameraGrpc.newStub(channel);
        CameraRequest camera = CameraRequest.newBuilder().setCamera("1").build();

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
}