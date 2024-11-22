package javabasic.exio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExBuffered2 {
	
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			File orgfile = new File("D:\\embededk\\files\\kje_copy.jpg");
			File copyfile = new File("D:\\embededk\\files\\kje_copycopy.jpg");

			bis = new BufferedInputStream(new FileInputStream(orgfile));
			bos = new BufferedOutputStream(new FileOutputStream(copyfile));
			
			byte[] buffer = new byte[1024];
			int readCnt = 0;
			while ((readCnt=bis.read(buffer)) > -1) {
				bos.write(buffer, 0, readCnt);
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	} // main

} // class






























