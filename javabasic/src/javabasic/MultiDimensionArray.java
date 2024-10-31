package javabasic;

public class MultiDimensionArray {
	
	public static void main(String[] args) {
		
		// 2차원 배열 선언과 초기화를 동시에 하는 코드
		// intArr의 length : intArr은 1차원 int[] 3개의 요소가 있으므로 length는 3 (인덱스 0~2)
		// intArr[0]의 length : intArr[0]은 1차원 배열이므로 length는 3 (인덱스 0~2)
		// [3][3] => 3행 3열
		int[][] intArr = new int[3][3]; // 0이 9개 3행 3열로 초기화 됨
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		intArr[0][2] = 3;
		intArr[1][0] = 4;
		intArr[1][1] = 5;
		intArr[1][2] = 6;
		intArr[2][0] = 7;
		intArr[2][1] = 8;
		intArr[2][2] = 9;
		
		int intArrLength = intArr.length; // 2차원 배열의 요소의 수 (길이 = length)
		int intArr0Length = intArr[0].length; // 1차원 배열의 요소의 수
		for (int i=0; i<intArrLength; i++) { // 행 반복
			for (int j=0; j<intArr0Length; j++) { // 열 반복
				System.out.println(intArr[i][j]);
			}
		}
		
		int[][] intArr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for (int[] iArr : intArr2) {
			for (int j : iArr) {
				System.out.println(j);
			}
		}
		
		String[][] strArr = {
				{"홍길동", "강감찬", "이순신"},
				{"서울", "부산", "제주"},
				{"학생", "직장인", "가수"}
		};
		
		for (String[] sArr : strArr) {
			for (String str : sArr) {
				System.out.println(str);
			}
		}
			
	} // main

} // class






















