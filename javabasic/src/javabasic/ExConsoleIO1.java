package javabasic;

import java.util.Scanner;

public class ExConsoleIO1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("곱하실 두 수를 입력해 주세요!");
		
		int firstInt = scanner.nextInt();
		int secondInt = scanner.nextInt();
		
		int multi = firstInt * secondInt;
		
		System.out.println("두 수의 곱은 " + multi + " 입니다!");
		
	}

}










