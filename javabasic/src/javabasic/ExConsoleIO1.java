package javabasic;

import java.util.Scanner;

public class ExConsoleIO1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("곱셈하실 두 수를 입력해 주세요!");
		
		int firstInt = 0;
		int secondInt = 0;
		
		if (scanner.hasNext()) {
			firstInt = scanner.nextInt();
			secondInt = scanner.nextInt();
		}
		
		System.out.println("두 수의 곱은 " + firstInt*secondInt + "입니다!");
		
		scanner.close();
		
	} // main

} // class
