package javabasic.network.chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChattingServer {
	
	// 서버가 관리하는 클라이언트핸들러의 리스트
	// 하나만 있으면 되니까 static
	private static List<ClientHandler> clients
		= new ArrayList<ClientHandler>();
	
	public static void main(String[] args) {

		ClientHandler clientHandler = null;		
		
		try {
		
			// ServerSocket 생성
			ServerSocket connectSocket = new ServerSocket(5000);
			
			if (connectSocket != null) {
				System.out.println("서버 시작됨. 클라이언트 대기중!");
			}
			
			while (true) {
				
				// 클라이언트 연결요청 대기
				// 연결요청이 오면 클라이언트소켓과 데이터 송수신하는 서버소켓을 생성
				Socket serverSocket = connectSocket.accept();
				System.out.println("클라이언트 접속 : " + serverSocket);
				
				// 클라이언트핸들러 생성
				// 클라이언트마다 다른 클라이언트들과 데이터 송수신할 수 있도록 클라이언트핸들러 생성
				// serverSocket 1개는 서버에서 관리하는 클라이언트 1
				// clients : 서버에서 관리하는 클라이언트핸들러 리스트
				clientHandler = new ClientHandler(serverSocket, clients);
				
				// 클라이언트핸들러리스트에 클라이언트핸들러 추가
				clients.add(clientHandler);
				
				// 쓰레드 생성해서 시작 = 데이터 송수신 시작
				new Thread(clientHandler).start();
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
			// 클라이언트핸들러리스트에서 클라이언트핸들러 제거
			clients.remove(clientHandler);
		}
		
	} // main

} // class
















