package javabasic;

public class ExLoopStatement2 {
	
	public static void main(String[] args) {
		
		// 1
		// i : 0,  j : 0
		// i : 1,  j : 0 1
		// i : 2,  j : 0 1 2
		// i : 3,  j : 0 1 2 3
		// i : 4,  j : 0 1 2 3 4
		for (int i=0; i<5; i++) { // 줄의 수 i
			for (int j=0; j<i+1; j++) { // 별의 수 j
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 3
		// i = 0, j = 0, k = 0 1 2 3 4
		// i = 1, j = 0 1, k = 0 1 2 3
		// i = 2, j = 0 1 2, k = 0 1 2
		// i = 3, j = 0 1 2 3, k = 0 1
		// i = 4, j = 0 1 2 3 4, k = 0
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<i; j++) { // 공백의 수
				System.out.print("o");
			}
			for (int k=0; k<5-i; k++) { // 별의 수
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // main

} // class















