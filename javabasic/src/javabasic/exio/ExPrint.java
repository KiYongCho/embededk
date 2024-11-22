package javabasic.exio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ExPrint {
	
	public static void main(String[] args) {
		
		PrintStream ps = null;
		PrintWriter pw = null;
		
		try {
			
			ps = new PrintStream("D:\\embededk\\files\\ExPrint.dat");
			ps.write((byte)65);
			
			pw = new PrintWriter("D:\\embededk\\files\\ExPrint.txt");
			pw.write((char)65);
			pw.flush();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
	}

}
