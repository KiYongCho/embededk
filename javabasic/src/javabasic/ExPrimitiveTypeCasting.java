package javabasic;

public class ExPrimitiveTypeCasting {
	
	public static void main(String[] args) {

		// float > int 형변환 = 소수점 잘린 효과
		int i = (int)3.14f;
		System.out.println(i); // 3
		
		double d1 = 100; // int 100 > double 100
		// double d2 = (double)100;
		double d3 = 100d;
		double d4 = 100D;
		
		float f = 3.12345678901234567890f;
		System.out.println(f); // 소수점 7째자리까지 표시
		
		double d = 3.12345678901234567890;
		System.out.println(d); // 소수점 16째자리까지 표시
		
	} // main

} // class














