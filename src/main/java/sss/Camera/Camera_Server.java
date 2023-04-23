package sss.Camera;

import sss.Camera.CameraGrpc.CameraImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;

public class Camera_Server extends CameraImplBase {
    private static final String SERVICE_TYPE = "_camera._tcp.local.";
    private static final String SERVICE_NAME = "camera_server";
    private static final int PORT = 50053;
	public static void main(String[] args) throws IOException{
		Camera_Server Movment_Server = new Camera_Server();
		try {
			Server server = ServerBuilder.forPort(PORT).addService(Movment_Server).build().start();// create the server
			System.out.println("Server Started, listening on : " + PORT + " port ");
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());// getlocalhost for jmdns
			ServiceInfo serviceInfo = ServiceInfo.create(SERVICE_TYPE, SERVICE_NAME, PORT, "SSS Service");//save to service information
			jmdns.registerService(serviceInfo);// regist
			server.awaitTermination();
			jmdns.unregisterService(serviceInfo);//close
			jmdns.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

    @Override
    public void cameraService(CameraRequest request, StreamObserver<CameraResponse> responseObserver) {
        responseObserver.onNext(CameraResponse.newBuilder()
                .setFrame(ByteString.copyFrom(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}))
                .build());
        responseObserver.onCompleted();
    }


}