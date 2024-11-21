package javabasic.exio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExConvBufferStream {
	
	public static void main(String[] args) {

		System.out.println("문자열을 입력해 주세요!");
		
		Scanner scanner = new Scanner(System.in);
		
		FileWriter fw = null;
		FileReader fr = null;
		
		File file = new File("D:\\embededk\\files\\scanner1.txt");
		
		try {
			
			fw = new FileWriter(file);
			fw.write(scanner.nextLine());
			fw.flush();
			
			fr = new FileReader(file);
			int i = 0;
			while ((i=fr.read()) > -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
				scanner.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class






















