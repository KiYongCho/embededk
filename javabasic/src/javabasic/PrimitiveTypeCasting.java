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
		
		s = b; // s = (short)b; 과정이 자동으로 일어남 = 자동형변환 = 묵시적형변환
		b = (byte)s; // 형변환에 대해서 개발자가 책임짐 = 강제형변환 = 명시적형변환
		
		l = i;
		i = (int)l;
		
		d = f;
		f = (float)d;
		
		b = 65;
		// c = b; // char타입으로의 형변환은 강제형변환 해야 함
		c = (char)b;
		System.out.println(c); // A (ASCII CODE 65에 해당하는 문자)
		
		// boolean타입은 다른타입과 형변환이 불가
		// bool = b;
		// b = bool;
		
	} // main

} // class
























