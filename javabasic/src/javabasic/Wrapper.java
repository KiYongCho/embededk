package javabasic;

public class Wrapper {
	
	public static void main(String[] args) {
		
		// 자바의 기본타입 8가지
		byte b = 1; // 1바이트 정수
		short s = 2; // 2바이트 정수
		int i = 3; // 4바이트 정수, 정수의 기본값
		long l = 4; // 8바이트 정수
		float f = 3.14f; // 4바이트 실수
		double d = 2.1; // 8바이트 실수, 실수의 기본값
		char c = 'A'; // 2바이트 유니코드 문자
		boolean bool = true; // 1바이트, (true 또는 false의 값)
		
		// Wrapper class
		// Wrapping : 기본타입의 값을 갖는 참조타입을 생성하는 것 = Boxing
		Byte wb = new Byte(b); // byte의 래퍼 => byte값을 갖는 참조타입 Byte
		Short ws = new Short(s);
		Integer wi = new Integer(i);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Character wc = new Character(c);
		Boolean wbool = new Boolean(bool);
		
		// Unwrapping : 참조타입이 가진 기본타입의 값을 꺼내는 것 = Unboxing
		System.out.println(wb.byteValue());
		System.out.println(ws.shortValue());
		System.out.println(wi.intValue());
		System.out.println(wl.longValue());
		System.out.println(wf.floatValue());
		System.out.println(wd.doubleValue());
		System.out.println(wc.charValue());
		System.out.println(wbool.booleanValue());
		
		// Unwrapping ex)
		// 1. 참조타입 + 기본타입 연산 시도
		// 2. 참조타입이 가진 기본타입 값을 꺼내서 기본타입 + 기본타입 연산을 수행 (auto unwrapping)
		int sum = wi + 2;
		
	} // main 

} // class
















