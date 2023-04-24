package sss.Movement;

import sss.Movement.MovementGrpc.MovementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;

public class Movment_Server extends MovementImplBase {
    private static final String SERVICE_TYPE = "_sss._tcp.local.";
    private static final String SERVICE_NAME = "movement_server";
    private static final int PORT = 50051;

	public static void main(String[] args) throws IOException{
		Movment_Server Movment_Server = new Movment_Server();
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
    public void detectionMotion(MotionDetectionRequest request, StreamObserver<MotionDetectionResponse> responseObserver) {
        boolean isMoving = request.getIsMoving();
        String responseMessage = isMoving ? " is moving" : "No motion detected";
        responseObserver.onNext(MotionDetectionResponse.newBuilder()
                .setMovingResponse(responseMessage)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RecognitionRequest> recognizeFace(StreamObserver<RecognitionResponse> responseObserver) {
        byte[] blacklist = new byte[]{1,2,3,4,5,6,7,8,9,0};
		ByteString blacklistData = ByteString.copyFrom(blacklist);
        return new StreamObserver<RecognitionRequest>() {
            private boolean isBlacklisted = false;

            @Override
            public void onNext(RecognitionRequest recognitionRequest) {
                ByteString imageByteString = recognitionRequest.getImage();
				System.out.println(recognitionRequest);
				if (imageByteString.equals(blacklistData)) {
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
                RecognitionResponse response = RecognitionResponse.newBuilder()
                        .setIsBlacklisted(isBlacklisted)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
