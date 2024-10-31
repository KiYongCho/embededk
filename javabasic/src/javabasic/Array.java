package javabasic;

public class Array {
	
	public static void main(String[] args) {
		
		// 배열 선언
		int[] intArr;
		// int intArr[]; (이렇게 선언도 가능하지만 int타입과 혼동되므로 위의 방법으로 선언하는 것이 좋음)
		
		// 배열 초기화
		// 메모리에 int 5개를 저장할 공간을 생성
		// int의 기본값 0이므로 초기화 하면 intArr배열에는 0이 5개 들어 있음
		intArr = new int[5]; // 크기(length)가 5, 인덱스 범위 0~4
		
		// 배열에 값을 할당
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		// 인덱스 5를 참조하면 실행시간에 ArrayIndexOutOfBoundsException 발생
		// intArr[5] = 6;
		
		// 배열내의 요소들의 값을 출력
		// refactoring : 마틴 파울러 책
		// code complete : MS 책
		int intArrLength = intArr.length;
		for (int i=0; i<intArrLength; i++) {
			System.out.println(intArr[i]);
		}
		
		// 배열 선언, 초기화, 할당을 동시에 하는 코드
		int[] intArr2 = {1, 2, 3, 4, 5};
		
		// 향상된 for문 (enhanced for statement)
		for (int i : intArr2) {
			System.out.println(i);
		}
		
		String[] strArr = {"hello", "java", "programming"};
		
		for (String str : strArr) {
			System.out.println(str);
		}		
		
	} // main

} // class










