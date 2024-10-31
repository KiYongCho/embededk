package javabasic;

import java.util.Scanner;

public class ExMethod4 {
	
	public static void main(String[] args) {
		
		System.out.println("별의 수를 정수로 입력해 주세요!");
		Scanner scanner = new Scanner(System.in);
		printStar(scanner.nextInt());
		scanner.close();
	}
	
	static void printStar(int starCount) {
		for (int i=0; i<starCount; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}





