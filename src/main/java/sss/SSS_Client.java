package sss;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import sss.generated.MotionDetectionRequest;
import sss.generated.MotionDetectionResponse;
import sss.generated.ServiceRouteGrpc;
import java.util.Scanner;
public class SSS_Client{

    public static void main(String[] args) {
        System.out.print("Please enter true or false: ");
        Scanner scanner = new Scanner(System.in);
        boolean isMoving = scanner.nextBoolean();
		// creat gRPC channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        // creat gRPC stub
        ServiceRouteGrpc.ServiceRouteBlockingStub stub = ServiceRouteGrpc.newBlockingStub(channel);
        // creat request
        MotionDetectionRequest req = MotionDetectionRequest.newBuilder().setIsMoving(isMoving).build();
        // get response
        MotionDetectionResponse resp = stub.detectionMotion(req);
        // print result
        System.out.println(resp.getMovingResponse());
        // close channel
        channel.shutdown();
		scanner.close();
    }

}