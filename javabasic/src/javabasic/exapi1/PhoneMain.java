package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
	
	// 이름과 휴대폰번호 저장할 배열, 5명이 각각 4개의 데이터(이름, 국번, 앞자리, 뒷자리)
	static String[][] infoArr = new String[5][4];
	
	public static void main(String[] args) {
		
		System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
		System.out.println("형식:홍길동 000-0000-0000");
		
		// 데이터 저장 함수 호출
		inputInfo();
		
		// 데이터 출력 함수 호출
		printInfo();
		
	} // main
	
	// 데이터를 저장할 메소드
	private static void inputInfo() {
		// 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		// 행의 수
		int infoArrLeng = infoArr.length;
		// 사용자가 입력한 한 줄의 문자열을 저장할 변수
		String line = "";
		
		// 행의 수만큼 반복
		for (int i=0; i<infoArrLeng; i++) {
			// 한 줄의 문자열을 저장
			line = scanner.nextLine();
			// 이름을 각 행의 첫번째 열에 저장 
			// 홍길동 010-1234-5678 입력 => 홍길동
			infoArr[i][0] = line.substring(0, line.indexOf(' '));
			// 휴대폰번호를 - 기준으로 자르는 토크나이저 생성
			// 010-1234-5678 > 010 1234 5678
			StringTokenizer st 
				= new StringTokenizer(line.substring(line.indexOf(' ')+1), "-");
			// 열 인덱스
			int j = 1;
			// 토큰이 있는동안 반복
			while (st.hasMoreTokens()) { 
				// 국번, 앞자리번호, 뒷자리번호 배열에 저장
				infoArr[i][j] = st.nextToken();
				j++;
			}
		}
		
		scanner.close();
	} // inputInfo
	
	// 데이터 출력 메소드
	private static void printInfo() {
		// 행의 수
		int infoArrLeng = infoArr.length;
		// 열의 수
		int infoArr0Leng = infoArr[0].length;
		// 열의 수만큼 반복
		for (int i=0; i<infoArr0Leng; i++) {
			// 행의 수만큼 반복
			for (int j=0; j<infoArrLeng; j++) {
				// 출력
				System.out.print(infoArr[j][i] + " ");
			}
			System.out.println();
		}
	}

} // class










