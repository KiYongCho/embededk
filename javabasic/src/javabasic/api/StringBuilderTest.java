package javabasic.api;

/*
 * String은 문자열 불변, 즉 문자열 만들어지면 변경될 수 없음
 * 그래서 문자열 접합 연산을 하면 문자열들이 무수히 만들어짐
 * 그러므로 버퍼에 문자열 연산을 수행하고 최종적으로 문자열로 변경할 수 있도록
 * StringBuffer, StringBuilder 클래스를 제공
 * StringBuffer : Thread Safe, 속도는 StringBuilder보다 느림
 * StringBuilder : Thread Unsafe, 속도는 StringBuffer보다 빠름
 */

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println(sb1.capacity()); // 기본 용량 16
		
		sb1.append("H");
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		sb1.append(" ");
		sb1.append("J");
		sb1.append("a");
		sb1.append("v");
		sb1.append("a");
		
		System.out.println(sb1.capacity()); // 기본 용량 16, 문자 수 10
		
		sb1.append("H");
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		sb1.append(" ");
		sb1.append("J");
		sb1.append("a");
		sb1.append("v");
		sb1.append("a");		
		
		System.out.println(sb1.capacity()); // 용량 34, 문자 수 20
		
		System.out.println(sb1.toString()); // StringBuilder를 String으로 변환
		
		StringBuilder sb2 = new StringBuilder("안녕하세요 자바!");
		
		System.out.println(sb2.charAt(2)); // 하
		
		sb2.delete(2, 5);
		System.out.println(sb2); // 안녕 자바!
		
		System.out.println(sb2.deleteCharAt(5)); // 안녕 자바
		
		sb2.ensureCapacity(50); // 버퍼 용량을 50 이상으로 늘림
		System.out.println(sb2.capacity()); // 52
		
		sb2.trimToSize(); // 문자가 없는 버퍼를 제거
		System.out.println(sb2.capacity()); // 5
		
		System.out.println(sb2.indexOf("자바")); // 3
		
		StringBuilder sb3 = new StringBuilder("Java Java Java");
		
		// 5번 인덱스부터 Java가 처음 나오는 인덱스
		System.out.println(sb3.indexOf("Java", 5)); // 5
		
		System.out.println(sb3.insert(5, "Hi ")); // Java Hi Java Java
		
		System.out.println(sb3.lastIndexOf("Java")); // 13
		
		System.out.println(sb3.length()); // 17, 문자의 길이
		
		System.out.println(sb3.replace(5, 7, "Hello"));
		
		System.out.println(sb3.reverse());
		
		sb3.setCharAt(0, 'J');
		System.out.println(sb3);
		
		System.out.println(sb3.substring(5));
		System.out.println(sb3.substring(5, 9));
		
	} // main

} // class





























