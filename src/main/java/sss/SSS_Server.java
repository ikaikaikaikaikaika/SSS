package sss;

import sss.generated.ServiceRouteGrpc.ServiceRouteImplBase;
import sss.generated.*;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

import java.util.Arrays;


public class SSS_Server extends ServiceRouteImplBase {

	private static final String SERVICE_TYPE = "_myservice._tcp.local.";
	private static final String SERVICE_NAME = "SSS_Server";
	private static final int PORT = 50051;
	public static void main(String[] args) throws IOException{
		SSS_Server greeterserver = new SSS_Server();
		try {
			Server server = ServerBuilder.forPort(PORT).addService(greeterserver).build().start();
			System.out.println("Server Started, listening on : " + PORT + " port ");
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			ServiceInfo serviceInfo = ServiceInfo.create(SERVICE_TYPE, SERVICE_NAME, PORT, "SSS Service");
			jmdns.registerService(serviceInfo);
			server.awaitTermination();
			jmdns.unregisterService(serviceInfo);
			jmdns.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void detectionMotion(MotionDetectionRequest request, StreamObserver<MotionDetectionResponse> responseObserver) {
		String responseMessage;
		if (request.getIsMoving()) {
        	responseMessage = "object is moving.";
   		}
		else{
			responseMessage = "No one moving.";
		}
		MotionDetectionResponse response = MotionDetectionResponse.newBuilder().setMovingResponse(responseMessage).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<RecognitionRequest> recognizeFace(StreamObserver<RecognitionResponse> responseObserver) {
		byte[] blacklistData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		return new StreamObserver<RecognitionRequest>() {
			boolean isBlacklisted = false;

			@Override
			public void onNext(RecognitionRequest request) {
				byte[] imageData = request.getImage().toByteArray();
				if (Arrays.equals(imageData, blacklistData)) {
					isBlacklisted = true;
				} else {
					isBlacklisted = false;
				}
			}

			@Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				RecognitionResponse reply = RecognitionResponse.newBuilder().setIsBlacklisted(isBlacklisted).build();
				responseObserver.onNext(reply);
				responseObserver.onCompleted();
			}
		};
	}


}//class Server
    
	

