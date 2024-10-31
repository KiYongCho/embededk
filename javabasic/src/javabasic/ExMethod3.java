package javabasic;

import java.util.Scanner;

public class ExMethod3 {
	
	public static void main(String[] args) {
		System.out.println("두개의 정수와 연산자(+,-,*,/)를 입력해 주세요!");
		input();
	}
	
	static void input() {
		Scanner scanner = new Scanner(System.in);
		print(calc(scanner.nextInt(), scanner.nextInt(), scanner.next()));
	}
	
	static int calc(int a, int b, String operator) {
		switch (operator) {
			case "+": return a + b;
			case "-": return a - b;
			case "*": return a * b;
			case "/": return a / b;
			default: return 0; 
		}
	}
	
	static void print(int result) {
		System.out.println(result);
	}

}
