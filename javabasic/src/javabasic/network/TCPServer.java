package javabasic.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// TCP Server
public class TCPServer {
	
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		
		try {
			
			// 서버소켓 생성
			ss = new ServerSocket(5000); // 포트번호 (1024~65535 중에서 안쓰고 있는 포트번호)
			if (ss != null) {
				System.out.println("서버소켓 생성됨! 클라이어트 접속대기중!");
			} 
			
			// 클라이언트 접속을 무한 대기
			while (true) {
				// 클라이언트가 접속하면 클라이언트와 송수신할 수 있는 서버소켓을 생성
				// accept() : 블로킹메소드 (접속할때까지 기다림) 
				Socket serverSocket = ss.accept();
				
				// 클라이언트가 송신한 문자를 읽어들이는 스트림
				if (serverSocket != null) {
					
					BufferedReader br = null;
					br = new BufferedReader(
						new InputStreamReader(serverSocket.getInputStream())
					);
					System.out.println(
						"클라이언트가 보낸 문자열 : "
						+ "[" + serverSocket.getInetAddress() + "] "
						+ br.readLine()
					);
					
					serverSocket = ss.accept();
					
					// 클라이언트에게 문자열을 보내는 스트림
					BufferedWriter bw = null;
					bw = new BufferedWriter(
						new OutputStreamWriter(serverSocket.getOutputStream())
					);
					bw.write(
						"서버에서 보낸 문자열 : "
						+ "[" + serverSocket.getInetAddress() + "]님 "
						+ "안녕하세요!"
					);
					bw.close();
					
				}
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class






























