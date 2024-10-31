package javabasic;

import java.util.Scanner;

public class ConsoleIO {
	
	public static void main(String[] args) {
		
		// 키보드 입력을 처리하는 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// scanner.hasNext() : 키보드를 통해 읽어들인 문자열이 있으면 true
		/*
		while (scanner.hasNext()) {
			// 키보드를 통해 읽어들인 문자열을 nextStr 변수에 저장 (console input)
			String nextStr = scanner.next();
			// 문자열을 화면에 출력 (console output)
			System.out.println(nextStr);
		}
		*/
		
		// 두 수를 입력받아 합계를 출력하는 프로그램
		System.out.println("두 수를 입력해 주세요!");
		
		String firstStr = "";	// 첫번째 입력받은 문자열을 저장할 변수 생성
		int firstInt = 0; // 첫번째 문자열을 int로 변환한 값을 저장할 변수 
		
		String secondStr = "";
		int secondInt = 0;
		
		if (scanner.hasNext()) { // 첫번째 입력받은 문자열이 있다면
			firstStr = scanner.next(); // firstStr에 저장
			firstInt = Integer.parseInt(firstStr); // int로 변환해서 firstInt에 저장
		}
		
		if (scanner.hasNext()) {
			secondStr = scanner.next();
			secondInt = Integer.parseInt(secondStr);
		}
		
		int sum = firstInt + secondInt; // 두 수의 합을 sum에 저장
		System.out.println("두 수의 합은 " + sum + " 입니다!");
		
	} // main

} // class










