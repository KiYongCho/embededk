package javabasic.exio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXIO2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("파일명을 입력해 주세요!");
		String fileName = scanner.nextLine();
		
		System.out.println("문자열을 입력해 주세요!");
		String str = scanner.nextLine();
		
		FileWriter fw = null;
		
		try {
			
			File f = new File("D:\\embededk\\files\\" + fileName + ".txt");
			
			fw = new FileWriter(f);
			fw.write(str);
			fw.flush();
					
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fw.close();
				scanner.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main
	
} // class







