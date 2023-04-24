/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-04-24 05:09:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sss.Movement.MotionDetectionRequest;
import sss.Movement.MotionDetectionResponse;
import sss.Movement.MovementGrpc;
import sss.Movement.MovementGrpc.MovementBlockingStub;
import sss.Movement.MovementGrpc.MovementStub;
import sss.Movement.RecognitionRequest;
import sss.Movement.RecognitionResponse;
import com.google.protobuf.ByteString;
import java.util.concurrent.TimeUnit;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;
import java.io.IOException;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Movement Client JSP</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Movement Client JSP</h1>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("<label for=\"imageData\">Image data:</label>\r\n");
      out.write("<input type=\"text\" name=\"imageData\" id=\"imageData\"><br><br>\r\n");
      out.write("<input type=\"submit\" value=\"Send recognition request\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
