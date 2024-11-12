package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
	
	static String[][] infoArr = new String[5][4];
	
	public static void main(String[] args) {
		
		System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
		System.out.println("형식:홍길동 000-0000-0000");
		
		inputInfo();
		
		printInfo();
		
	} // main
	
	private static void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		
		int infoArrLeng = infoArr.length;
		String line = "";
		
		for (int i=0; i<infoArrLeng; i++) {
			line = scanner.nextLine();
			infoArr[i][0] = line.substring(0, line.indexOf(' '));
			StringTokenizer st 
				= new StringTokenizer(line.substring(line.indexOf(' ')+1), "-");
			int j = 1;
			while (st.hasMoreTokens()) { 
				infoArr[i][j] = st.nextToken();
				j++;
			}
		}
		
		scanner.close();
	} // inputInfo
	
	private static void printInfo() {
		int infoArrLeng = infoArr.length;
		int infoArr0Leng = infoArr[0].length;
		for (int i=0; i<infoArr0Leng; i++) {
			for (int j=0; j<infoArrLeng; j++) {
				System.out.print(infoArr[j][i] + " ");
			}
			System.out.println();
		}
	}

} // class










