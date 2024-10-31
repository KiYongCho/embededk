package javabasic;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 1.0f;
		double d = 2.0;
		char c = 'A';
		boolean bool = true;
		
		s = b;
		// 자동형변환 = 묵시적형변환
		// b는 1바이트 정수, s는 2바이트 정수, 컴파일러는 데이터의
		// 손실이 없음을 알고 (short) 형변환 연산을 해줌
		// s = (short)b;
		
		// 강제형변환 = 명시적형변환
		// s는 2바이트 정수, b는 1바이트 정수, 컴파일러는 데이터의
		// 손실이 발생할 수 있으므로 형변환 연산을 해주지 못함
		// b = s;
		// 개발자가 데이터의 손실을 책임지겠다라는 의미(=1바이트를 버리겠다)로
		// 형변환 연산을 해줘야 한다
		b = (byte)s;
		
		l = i;	// 자동형변환
		// i = l;
		i = (int)l; // 강제형변환
		
		d = f; // 자동형변환
		// f = d;
		f = (float)d; //강제형변환
		
		b = 65;
		// 예외적으로
		// char는 0부터 양의 정수만 갖는 비트패턴이므로 byte를 자동형변환 해줄 수 없음
		// c = b;
		c = (char)b; 
		System.out.println(c);
		
		char c2 = '김';
		short s2 = (short)c2;
		System.out.println(s2);
		
		// boolean타입은 다른 타입들과 형변환이 불가하다
		// bool = b;
		// b = bool;
		
		long l2 = 10;
		float f2 = 1.0f;
		// long은 8바이트 정수, float는 4바이트 실수이지만
		// 정수와 실수는 비트배열패턴이 달라서 크기만으로 형변환 불가
		// 또, float는 4바이트이지만 8바이트인 long 보다 값의 표현범위가 넓음
		// l2 = f2;
		l2 = (long)f2;
		
		
		
	} // main

} // class



















