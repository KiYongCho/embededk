package javabasic.exexception;

import java.util.Scanner;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("나눗셈할 두 정수를 입력하세요!");
		
		// (3)번까지 다 하신 분은...
		// 1. 입력한 것이 숫자인 경우는 정수로 변환하기
		// 2. 입력한 것이 숫자이지만 int의 범위를 넘어가면 예외처리 하기
		// 3. 입력한 것이 숫자가 아닌 경우에 대해 예외처리 하기
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 사용자 입력을 double 2개에 저장
			double d1 = scanner.nextDouble();
			double d2 = scanner.nextDouble();
			// int로 변환해서 저장할 변수 2개
			int i1 = 0;
			int i2 = 0;			
			
			// 숫자면 int로 형변환
			if (!Double.isNaN(d1)) { i1 = (int)d1; }
			if (!Double.isNaN(d2)) { i2 = (int)d2; }
			
			// int의 범위를 넘는지 확인
			if (i1>Integer.MAX_VALUE || i1<Integer.MIN_VALUE) {
				try {
					// 예외를 발생시킴
					throw new Exception();
				} catch (Exception ex) {
					System.out.println("int의 범위를 넘었습니다!");
				}
			}
			System.out.println(i1/i2);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력해 주세요!");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			scanner.close();
		}
		
	}

}
