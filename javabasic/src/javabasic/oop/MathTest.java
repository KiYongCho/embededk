package javabasic.oop;

// java.lang.Math
// 수학 관련된 static 상수, 메소드

public class MathTest {
	
	public static void main(String[] args) {
		
		System.out.println(Math.E); // 수학의 E
		System.out.println(Math.PI); // 수학의 PI
		System.out.println(Math.abs(-10)); // 절대값
		System.out.println(Math.ceil(3.5)); // 천장값, 파라미터보다 크지만 가장 작은 정수
		System.out.println(Math.floor(3.5)); // 바닥값, 파라미터보다 작지만 가장 큰 정수
		System.out.println(Math.max(1.0, 2.5)); // 최대값
		System.out.println(Math.min(1.0, 2.5)); // 최소값
		System.out.println(Math.pow(2, 3)); // 2의 3승
		System.out.println(Math.random()); // 0.0보다는 크거나 같고 1.0보다는 작은 실수
		System.out.println(Math.rint(9.9)); // 주어진 수에 가장 가까운 정수
		System.out.println(Math.round(3.4)); // 반올림
		
	}
}
