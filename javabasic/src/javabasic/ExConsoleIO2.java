package javabasic;

import java.util.Scanner;

public class ExConsoleIO2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력해 주세요!");
		
		// 불리언인 것의 개수를 저장할 변수
		int booleanCount = 0;
		
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}
		
		scanner.next();
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}		
		
		scanner.next();
		if(scanner.hasNextBoolean()) {
			booleanCount = booleanCount + 1; // booleanCount++;
		}
		
		System.out.println("총 " + booleanCount + "개의 boolean이 있습니다!");
		
		scanner.close();
		
	} // main

} // class

















