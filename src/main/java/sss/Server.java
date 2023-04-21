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
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--Receiving Hello Request from Client--");
		System.out.println("Client sent the message -- " + request.getName());
		
		HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
		
		System.out.println("Server is sending the response -- " + reply.getMessage());
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
    
}
