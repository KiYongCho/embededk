package javabasic.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamTest {
	
	public static void main(String[] args) {
		
		Writer writer = null;
		Reader reader = null;
		
		try {
			
			File file = new File("D:\\embededk\\files\\file3.txt");
			
			// 파일에 문자를 쓰는 문자스트림
			writer = new FileWriter(file);
			writer.write(65); // ASCII 코드 65 = A
			writer.flush();
			
			// 파일에서 문자를 읽는 문자스트림
			reader = new FileReader(file);
			System.out.println((char)reader.read());
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class
























