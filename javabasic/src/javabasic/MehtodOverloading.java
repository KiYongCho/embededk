package javabasic;

public class MehtodOverloading {
	
	public static void main(String[] args) {
		
		// Overloading
		// - 파라미터의 개수, 타입, 순서를 달리해서 같은 이름의 메서드를 호출해서 사용
		// - 비슷한 기능을 하는 메서드들의 이름을 일원화 할 수 있음
		// - 메서드 오버로딩의 조건
		//   1) 동일한 반환 타입
		//   2) 동일한 메서드명
		//   3) 파라미터의 개수, 타입, 순서 중 하나라도 달라야 함
		//   4) 파라미터 변수명은 오버로딩과 관련 없음 (컴파일러는 타입만 체크)
		printStr("Hello");
		printStr("Hi", 5);
		printStr("Hello", " Java", 3);
		
		
	} // main
	
	static void printStr(String str) {
		System.out.println(str);
	}
	
	static void printStr(String str, int loopCount) {
		for (int i=0; i<loopCount; i++) {
			System.out.println(str);
		}
	}
	
	static void printStr(String str1, String str2, int loopCount) {
		for (int i=0; i<loopCount; i++) {
			System.out.println(str1 + " " + str2);
		}
	}

} // class






















