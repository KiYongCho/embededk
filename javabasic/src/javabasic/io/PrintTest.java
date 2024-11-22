package javabasic.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest {
	
	public static void main(String[] args) {

		File file = new File("D:\\embededk\\files\\print.dat");
		
		// PrintStream은 OutputStream의 확장판
		// 1. print 기능을 강화
		// 2. 자동으로 flush
		// 3. 자동으로 close
		PrintStream ps = null;
		
		try {
			ps = new PrintStream(file);
			ps.print("홍길동");
			ps.println("강감찬"); // 줄바꿈문자 : window에서는 \n, unix/linux에서는 \r\n
			ps.printf("%s은 %d살 입니다!", "이순신", 30);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		File file2 = new File("D:\\embededk\\files\\print2.txt");

		// PrintStream은 OutputStream의 확장판
		// 1. print 기능을 강화
		// 2. 자동으로 close	
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(file2);
			pw.print("안녕하세요!");
			pw.println("하이!");
			pw.printf("%s은 %d살 입니다!", "이순신", 30);
			pw.flush();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		
		
	} // main

} // class





















