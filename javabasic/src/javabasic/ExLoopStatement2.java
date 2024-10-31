package javabasic;

// 별찍기
public class ExLoopStatement2 {
	
	public static void main(String[] args) {
		
		// (6) - 1
		// i=0 > j=0, i=1 > j=0,1, i=2 > j=0,1,2 ...
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<i+1; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();
		
		// (6) - 2
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<5-i; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();		
		
		// (6) - 3
		// i=0 > j=0,1,2,3,4 i=1 > j=0,1,2,3 ...
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<i; j++) { // 공백의 수
				System.out.print("o");
			}
			for (int j=0; j<5-i; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();	
		
		// (6) - 4
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=4-i; j>0; j--) { // 공백의 수
				System.out.print("o");
			}			
			for (int j=0; j<=2*i; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();	
		
		// (6) - 5
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<5; j++) { // 별의 수
				if (i%4==0 ||  j%4==0) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();	
		
		// (6) - 6
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<5; j++) { // 별의 수
				if (i==j || 4-i==j) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();	
		
		// (6) - 7
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<5; j++) { // 별의 수
				if (i==j || 4-i==j || i%4==0 ||  j%4==0) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();				
		
	} // main

} // class













