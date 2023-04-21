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
        <input type="submit" name="isMoving" value="true">
        <input type="submit" name="isMoving" value="false">
    </form>
    <%
        // Create a channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // Create a stub for the service
        ServiceRouteGrpc.ServiceRouteBlockingStub stub = ServiceRouteGrpc.newBlockingStub(channel);

        if(request.getParameter("isMoving") != null) {
            // Build the request message
            boolean isMoving = Boolean.parseBoolean(request.getParameter("isMoving"));
            MotionDetectionRequest req = MotionDetectionRequest.newBuilder().setIsMoving(isMoving).build();

            // Call the service
            MotionDetectionResponse resp = stub.detectionMotion(req);

            // Print the response message
            out.print("<br>Response from server: " + resp.getMovingResponse());
        }

        // Shut down the channel
        channel.shutdown();
    %>
    </div>
</body>
</html>
