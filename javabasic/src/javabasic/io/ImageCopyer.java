package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 이미지 파일 복사
public class ImageCopyer {
	
	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		File orgfile = null;
		File copyfile = null;
		
		try {
			
			orgfile = new File("D:\\embededk\\files\\kje.jpg");
			copyfile = new File("D:\\embededk\\files\\kje_copy.jpg");

			is = new FileInputStream(orgfile);
			os = new FileOutputStream(copyfile);
			
			// 바이트 단위 복사
			/*
			int readByte = 0;
			while ((readByte=is.read())>-1) { // 읽은 바이트가 있는 동안 반복
				os.write(readByte);
			}
			os.flush();
			*/
			
			// 바이트 배열 단위 복사
			byte[] buffer = new byte[1024];
			int readByte = 0;
			while ((readByte=is.read(buffer))>-1) {
				os.write(buffer, 0, readByte); // 1024개 단위이므로 마지막 읽은 바이트 계산해야 함
			}
			os.flush();
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	} // main

} // class






























