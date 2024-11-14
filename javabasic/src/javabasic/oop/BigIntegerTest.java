package javabasic.oop;

import java.math.BigInteger;

// BigInteger : long의 범위를 넘는 크거나 작은 정수
// BigDecimal : double의 범위를 넘는 크거나 작은 실수

public class BigIntegerTest {
	
	public static void main(String[] args) {
		
		// long범위 : -9,223,372,036,854,775,808 부터 9,223,372,036,854,775,807
		BigInteger bi1 = new BigInteger("320498324098320948239048923048230948320948230948");
		System.out.println(bi1);
		BigInteger bi2 = new BigInteger("230948329084230843904802384902384902384290348390");
		System.out.println(bi2);
		
		BigInteger bi3 = bi1.add(bi2); // 덧셈
		System.out.println(bi3);	
		
		System.out.println(bi1.subtract(bi2)); // 뺄셈
		System.out.println(bi1.multiply(bi2)); // 곱셈
		System.out.println(bi1.divide(bi2)); // 나눗셈
		
		BigInteger bi4 = bi1.max(bi2); // 최대값
		System.out.println(bi4);	
		
		BigInteger bi5 = bi1.min(bi2); // 최소값
		System.out.println(bi5);
		
		
		
		
	}

}













