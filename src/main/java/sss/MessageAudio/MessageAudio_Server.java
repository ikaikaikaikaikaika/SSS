package sss.MessageAudio;

import sss.MessageAudio.MessageAudioGrpc.MessageAudioImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Random;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.google.protobuf.ByteString;


public class MessageAudio_Server extends MessageAudioImplBase {
    private static final String SERVICE_TYPE = "_sss._tcp.local.";
    private static final String SERVICE_NAME = "messageaudio_server";
    private static final int PORT = 50052;

	public static void main(String[] args) throws IOException{
		MessageAudio_Server Movment_Server = new MessageAudio_Server();
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
		
	}//main


    @Override
    public void pushMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        responseObserver.onNext(MessageResponse.newBuilder()
                .setMessage("Hi Client I'm Server")
                .build());
        System.out.println(request);       
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AudioRequest> audio(StreamObserver<AudioRespon> responseObserver) {
        return new StreamObserver<AudioRequest>() {

            @Override
            public void onNext(AudioRequest Request) {
                byte[] sendvoice = new byte[]{1,2,3};
                ByteString snedvoicereq = ByteString.copyFrom(sendvoice);
                ByteString Audio = Request.getAudiosend();
                if (Audio.equals(snedvoicereq)) {
                    int i = new Random().nextInt(10)+1;
                    for (int t=0;t<i;t++){
                        int datalength =10;
                        byte[] randombyte=new byte[datalength];
                        new Random().nextBytes(randombyte);
                        AudioRespon audioRespon = AudioRespon.newBuilder().setAudioreceived(ByteString.copyFrom(randombyte)).build();
                        responseObserver.onNext(audioRespon);
                    }
                    responseObserver.onCompleted();
				} else {
					System.out.println(Audio);
				}

            }

            @Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}



