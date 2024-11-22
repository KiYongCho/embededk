package javabasic.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 1. DataOutputStream을 통해 출력한 데이터는 DataInputStream으로만 입력 가능
// 2. 출력한 순서대로 입력 받아야 함

public class DataTest {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\data.dat");
		
		// 기본타입데이터, 문자열을 바이트 단위로 출력하는 스트림
		DataOutputStream dos = null;
		
		try {
			// 파일에 기본타입데이터, 문자열을 바이트 단위로 출력하는 스트림
			dos = new DataOutputStream(new FileOutputStream(file));
			dos.writeInt(20); // int (4바이트)
			dos.writeBoolean(false); // boolean (1바이트)
			dos.writeFloat(3.14f); // float (4바이트)
			dos.writeUTF("홍길동"); // UTF-8로 인코딩한 문자열
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// 기본타입데이터, 문자열을 바이트 단위로 입력하는 스트림
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream(file));
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main
	
} // class





















