<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="io.grpc.ManagedChannel"%>
<%@ page import="io.grpc.ManagedChannelBuilder"%>
<%@ page import="sss.generated.MotionDetectionRequest"%>
<%@ page import="sss.generated.MotionDetectionResponse"%>
<%@ page import="sss.generated.ServiceRouteGrpc"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSS</title>
    <style>
    #response {
        width: 50%;
        margin: 0 auto;
        text-align: center;
        padding: 20px;
        border: 1px solid #ccc;
    }
    </style>
</head>
<body>
    <div id="response">
    <form method="post">
        <input type="submit" value="Move" name="submit">
    </form>
    <%
        if(request.getParameter("submit") != null) {
    	// creat gRPC channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        // creat gRPC stub
        ServiceRouteGrpc.ServiceRouteBlockingStub stub = ServiceRouteGrpc.newBlockingStub(channel);
        // creat request
        MotionDetectionRequest req = MotionDetectionRequest.newBuilder().setIsMoving(true).build();
        // get response
        MotionDetectionResponse resp = stub.detectionMotion(req);
        // print result
        out.println(resp.getMovingResponse());
        // close channel
        channel.shutdown();
        }
    %>

    </div>
</body>
</html>
