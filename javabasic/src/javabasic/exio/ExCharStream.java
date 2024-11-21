package javabasic.exio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class ExCharStream {
	
	public static void main(String[] args) {
		
		Writer writer = null;
		Reader reader = null;
		
		try {
			
			File file = new File("D:\\embededk\\files\\name.txt");
			writer = new FileWriter(file);
			writer.write("홍길동");
			writer.flush();
			
			reader = new FileReader(file);
			System.out.print((char)reader.read());
			System.out.print((char)reader.read());
			System.out.print((char)reader.read());
			
			/* 2)
			int i = 0;
			while((i=reader.read()) > -1) {
				System.out.print((char)i);
			}
			*/
			
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












