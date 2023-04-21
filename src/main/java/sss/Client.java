package sss;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import sss.generated.MotionDetectionRequest;
import sss.generated.MotionDetectionResponse;
import sss.generated.ServiceRouteGrpc;
import java.util.Scanner;
public class Client{

    public static void main(String[] args) {
		// creat gRPC channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

        // creat gRPC stub
        ServiceRouteGrpc.ServiceRouteBlockingStub stub = ServiceRouteGrpc.newBlockingStub(channel);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter true or false: ");
            if (scanner.hasNextBoolean()) {
                boolean isMoving = scanner.nextBoolean();
                // creat request
                MotionDetectionRequest req = MotionDetectionRequest.newBuilder().setIsMoving(isMoving).build();
                // get response
                MotionDetectionResponse resp = stub.detectionMotion(req);
                // print result
                System.out.println(resp.getMovingResponse());
            } else {
                System.out.println("Invalid input, please enter a boolean value.");
            }
        }
        // close channel
        channel.shutdown();
		
    }

}