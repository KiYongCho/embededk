package javabasic.network.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// 역할 : 동시에 클라이언트들과 데이터를 송수신 처리하는 쓰레드
public class ClientHandler implements Runnable {
	
	// 클라이언트 소켓
	private Socket clientSocket;
	
	// 클라이언트핸들러 리스트
	private List<ClientHandler> clients;
	
	// 문자송신스트림
	private PrintWriter out;
	
	// 문자수신스트림
	private BufferedReader in;
	
	// 생성자
	// 클라이언트핸들러가 만들어 지려면 클라이언트소켓과 클라이언트핸들러의 리스트가 필요
	// 클라이어트핸들러의 구성 : 클라이언트소켓, 클라이언트핸들러리스트, 문자출력스트림, 문자입력스트림
	public ClientHandler(Socket clientSocket, List<ClientHandler> clients) {
		this.clientSocket = clientSocket;
		this.clients = clients;
		try {
			// 자동으로 flush하는 클라이언트 문자출력스트림
			this.out = new PrintWriter(
					new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"), 
					true);
			// 클라이언트 문자입력스트림
			this.in = new BufferedReader(
								new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("[HH:mm:ss] ");
		
		try {
			// 클라이언트에게서 받은 문자열을 저장할 변수
			String inputLine;
			// 클라이언트에게서 받은 문자열이 있는 동안 반복
			while ((inputLine=in.readLine()) != null) {
				// 전체 클라이언트에게 메세지를 전송
				for (ClientHandler clientHandler : clients) {
					clientHandler.out.print(sdf.format(new Date()));
					clientHandler.out.println(inputLine);
				}
			}
			
		} catch (IOException ioe) {
			System.out.println("클라이언트 종료! " + ioe.getMessage());
		} finally {
			try {
				in.close();
				out.close();
				clientSocket.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

} // class










































