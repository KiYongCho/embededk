package javabasic.exapiextra;

import java.util.Scanner;

public class Util {
	
//	public static String getLineText() {
//		System.out.println("문자열을 한 줄 입력해 주세요!");
//		Scanner scanner = new Scanner(System.in);
//		String lineText = scanner.nextLine();
//		scanner.close();
//		return lineText;
//	}
	
	public static String[] getLineText(int lineCount) {
		System.out.println("문자열을 " + lineCount + " 줄 입력해 주세요!");
		Scanner scanner = new Scanner(System.in);
		String[] lineTextArr = new String[lineCount];
		for (int i=0; i<lineCount; i++) {
			lineTextArr[i] = scanner.nextLine();
		}
		scanner.close();
		return lineTextArr;
	}	

}
