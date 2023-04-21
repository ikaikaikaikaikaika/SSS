package sss;
import java.io.IOException;
import sss.generated.ServiceRouteGrpc.ServiceRouteImplBase;
import sss.generated.*;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Server extends ServiceRouteImplBase {


	public static void main(String[] args) {
		Server greeterserver = new Server();
		int port = 50051;
		try {
			io.grpc.Server server = ServerBuilder.forPort(port).addService(greeterserver).build().start();
			System.out.println("Server Started, listening on : " + port + " port ");
			server.awaitTermination();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void detectionMotion(MotionDetectionRequest request, StreamObserver<MotionDetectionResponse> responseObserver) {
			String result;
		if (request.getIsMoving() == true){
			result=("Someone is moving in area!");

		}
		else{
			result=("Area is empty.");
		}
		MotionDetectionResponse reply = MotionDetectionResponse.newBuilder().setMovingResponse(result).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
    
}
