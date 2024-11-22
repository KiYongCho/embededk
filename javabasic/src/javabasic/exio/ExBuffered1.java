package javabasic.exio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExBuffered1 {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\gimi.txt");
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			br = new BufferedReader(new FileReader(file));
			
			pw = new PrintWriter(System.out);
			
			String line = null;
			while ((line=br.readLine()) != null) {
				pw.write(line);
			}
			pw.flush();
			
			
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
