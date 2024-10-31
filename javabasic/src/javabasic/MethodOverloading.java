package javabasic;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		// 오버로딩의 조건
		// 1. 반환타입이 같아야 함
		// 2. 메서드명이 같아야 함
		// 3. 파라미터의 개수 또는 타입 또는 순서 중 하나라도 달라야 함
		
		printStr("Hello");
		printStr("Hi", 3);
		printStr("Hello", "Java", 3);
		
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





















