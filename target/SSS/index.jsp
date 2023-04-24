<%@page import="io.grpc.ManagedChannel, io.grpc.ManagedChannelBuilder, io.grpc.stub.StreamObserver, sss.Movement.MotionDetectionRequest, sss.Movement.MotionDetectionResponse, sss.Movement.MovementGrpc, sss.Movement.MovementGrpc.MovementBlockingStub, sss.Movement.MovementGrpc.MovementStub, sss.Movement.RecognitionRequest, sss.Movement.RecognitionResponse, com.google.protobuf.ByteString, java.util.concurrent.TimeUnit"%>
<%@page import="javax.jmdns.JmDNS, javax.jmdns.ServiceInfo, java.net.InetAddress, java.io.IOException"%>
<html>
<head>
<title>Movement Client JSP</title>
</head>
<body>
<h1>Movement Client JSP</h1>

<%
// Discover service using JmDNS
JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
ServiceInfo[] serviceInfos = jmdns.list("_movement._tcp.local.");
String serviceUrl=null;
for (ServiceInfo serviceInfo : serviceInfos) {
    if (serviceInfo.getName().equals("movement_server")) {
        serviceUrl = String.format("localhost:%d", serviceInfo.getPort());
        System.out.println("Found service: movement_server at: " + serviceUrl);
        break;
    }
}
jmdns.close();
ManagedChannel channel = ManagedChannelBuilder.forTarget(serviceUrl).usePlaintext().build();

// Connect to server and get response for motion detection
MovementBlockingStub blockingStub = MovementGrpc.newBlockingStub(channel);
MotionDetectionRequest motionDetectionRequest = MotionDetectionRequest.newBuilder().setIsMoving(true).build();
MotionDetectionResponse motionDetectionResponse = blockingStub.detectionMotion(motionDetectionRequest);

// Send a request for face recognition
MovementStub asyncStub = MovementGrpc.newStub(channel);
StreamObserver<RecognitionResponse> responseObserver = new StreamObserver<RecognitionResponse>() {
    @Override
    public void onNext(RecognitionResponse recognitionResponse) {
        out.println("Is blacklisted? " + recognitionResponse.getIsBlacklisted());
    }
    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }
    @Override
    public void onCompleted() {
        out.println("Request completed.");
        channel.shutdown();
    }
};
StreamObserver<RecognitionRequest> requestObserver = asyncStub.recognizeFace(responseObserver);

// Get input from user and send a recognition request with the input as data
String imageData = request.getParameter("imageData");
if (imageData != null && !imageData.isEmpty()) {
    RecognitionRequest recognitionRequest = RecognitionRequest.newBuilder()
            .setImage(ByteString.copyFromUtf8(imageData))
            .build();
    requestObserver.onNext(recognitionRequest);
    requestObserver.onCompleted();
    out.println("Sent recognition request with image data: " + imageData);
}

try {
    channel.awaitTermination(5, TimeUnit.SECONDS);
} catch (InterruptedException e) {
    // handle interruption
}
%>

<form>
<label for="imageData">Image data:</label>
<input type="text" name="imageData" id="imageData"><br><br>
<input type="submit" value="Send recognition request">
</form>

</body>
</html>
