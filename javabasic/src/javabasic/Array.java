package javabasic;

public class Array {
	
	public static void main(String[] args) {
		
		// 배열 선언 : 타입과 변수명을 정함, 아직까지 메모리에는 없음
		int[] intArr;
		// int intArr[]; 문법적으로 이렇게 선언 가능하지만 int타입과 혼동되기 쉬우므로 비추
		
		// 배열 초기화
		// 메모리에 5개의 int를 저장할 공간이 생성됨 (20byte)
		// int의 기본값이 0이므로 다섯개의 공간이 0으로 초기화 됨
		// 배열의 크기 = 요소(element)의 개수 = length (여기서는 5)
		// 배열 요소의 순서 = index (여기서 index의 범위는 0~4까지)
		// index의 범위 = 0 ~ length-1
		intArr = new int[5];
		
		// 배열 할당
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		// 문법적 오류가 없으므로 컴파일에는 문제 없음
		// index범위는 0~4, 5인덱스는 범위 밖 => 실행 시에 ArrayIndexOutOfBoundsException
		// intArr[5] = 6;
		
		// 배열내의 요소들의 값을 출력
		// intArr.length는 5로 확정되어 있고 변경도 불가
		// intArr.length 연산은 1번이면 족한다.
		// for문의 조건식에 사용하면 for문 반복 회수만큼 연산하게 된다
		// 마이크로소프트 : code complete
		// 마틴 파울러 : refactoring
		int intArrLength = intArr.length;
		for (int i=0; i<intArrLength; i++) {
			System.out.println(intArr[i]);
		}
		
		// 배열 선언, 초기화, 할당을 동시에 하는 코드
		int[] intArr2 = {1, 2, 3, 4, 5};
		
		// 향상된 for문 (enhanced for statement)
		// 요소의 length만큼 반복하면서 각 요소의 값을 앞에 선언한 변수에 할당
		for (int i : intArr2) {
			System.out.println(i);
		}
		
		// 문자열 배열
		String[] strArr = {"hello", "java", "programming"};
		
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
		
	} // main

} // class




























