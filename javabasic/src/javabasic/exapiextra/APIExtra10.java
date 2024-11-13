package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIExtra10 {
	
	public static void main(String[] args) {
		
		 // 미국독립선언서(americadoi.txt) 파일내에서 영단어 중 길이가 가장 긴 단어부터
		 // 가장 짧은 단어를 순서대로 개수와 함께 출력
		 // 내일까지 꼭 해본닷!
		
	} // main

	// 파일의 내용을 한 줄씩 읽어서 모두 합쳐서 리턴하는 메소드
	private static String getText() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(
					new File("C:\\Users\\Administrator\\git\\embededk\\javabasic\\src\\javabasic\\exapiextra\\americadoi.txt")));
			String line = "";
			String gimiTxt = "";
			while ((line=br.readLine())!=null) {
				gimiTxt += line;
			}
			br.close();
			return gimiTxt;
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return null;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}		
	
} // class
