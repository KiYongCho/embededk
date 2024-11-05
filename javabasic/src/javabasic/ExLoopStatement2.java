package javabasic;

import java.util.Scanner;

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
		
		// Extra 실습)
		// 별찍기
		// 1) 배열 미사용 버젼
		// 2) 배열 사용 버젼
		// 3) 3이상의 홀수를 입력하면 최대 별의 개수가
		//     입력한 별의 개수가 되는 다이아몬드 별찍기
		//      *
		//    ***
		//  *****
		//    ***
		//      *	
		// i ( 줄 )  : 0 1 2 3 4
		// j ( 별 )  : 1 3 5 3 1
		// k (공백) : 2 1 0 1 2
		// k = (5-j)/2 // 5는 줄의 수, 2는 i의 중간값
		// k = Math.abs(2-i)
		// (5-j)/2 = |2-i|
		// 1) (5-j)/2 = 2-i
		//      5-j = 4-2i
		//      j = 1 + 2i
		// 2) (5-j)/2 = -2+i
		//      5-j = -4+2i
		//      j = 9 - 2i	
		
		// 1)
//		int lineNums = 5; // 줄의 수
//		int middleLineNum = lineNums/2; // 가운데 줄 번호
//		int kEnd = 0; // k 반복의 끝 값 = 공백의 수
//		int jEnd = 0; // j 반복의 끝 값 = 별의 수
//		
//		for (int i=0; i<lineNums; i++) {
//			if (i<=middleLineNum) {
//				kEnd = middleLineNum - i;
//				jEnd = 2*i + 1;
//			} else {
//				kEnd = i - middleLineNum;
//				jEnd = (lineNums*2-1) - 2*i;
//			}
//			for (int k=0; k<kEnd; k++) System.out.print("o");
//			for (int j=0; j<jEnd; j++) System.out.print("*");
//			System.out.println();
//		}
		
		System.out.println();
		
		// 2)
//		int[][] starArr = {
//				{0, 0, 1, 0, 0},
//				{0, 1, 1, 1, 0},
//				{1, 1, 1, 1, 1},
//				{0, 1, 1, 1, 0},
//				{0, 0, 1, 0, 0}				
//		};
//		int starArrLength = starArr.length;
//		int starArr0Length = starArr[0].length;
//		for (int i=0; i<starArrLength; i++) {
//			for (int j=0; j<starArr0Length; j++) {
//				if (starArr[i][j]==0) System.out.print("o");
//				else System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.println();
		
		// 3)
		System.out.println("별의 최대길이를 3이상 홀수로 입력해 주세요!");
		int lineNums = new Scanner(System.in).nextInt(); // 줄의 수
		int middleLineNum = lineNums/2; // 가운데 줄 번호
		int kEnd = 0; // k 반복의 끝 값 = 공백의 수
		int jEnd = 0; // j 반복의 끝 값 = 별의 수
		
		for (int i=0; i<lineNums; i++) {
			if (i<=middleLineNum) {
				kEnd = middleLineNum - i;
				jEnd = 2*i + 1;
			} else {
				kEnd = i - middleLineNum;
				jEnd = (lineNums*2-1) - 2*i;
			}
			for (int k=0; k<kEnd; k++) System.out.print("o");
			for (int j=0; j<jEnd; j++) System.out.print("*");
			System.out.println();
		}
	
	} // main	

} // class













