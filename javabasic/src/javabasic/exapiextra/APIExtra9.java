package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIExtra9 {
	
	public static void main(String[] args) {
		
		char[] chArr = getText().toCharArray();
		
		// 합계 저장할 배열
		int[] countArr = new int[3];
		
		for (char ch : chArr) {
			// 문자를 문자열로 변환
			String str = String.valueOf(ch);
			if (str.matches("[가-힣]")) { // 한글
				countArr[0]++;
			} else if (str.matches("[a-zA-Z]")) { // 영문
				countArr[1]++;
			}  else if (str.matches("[\\W_]")) { // 기호
				countArr[2]++;
			}
		}
		
		System.out.printf("한글:%d개, 영문:%d개, 기호:%d개", 
				countArr[0], countArr[1], countArr[2]);		
		
	}
	
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

}
