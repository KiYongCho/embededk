package javabasic.exception;

public class ExceptionMain3 {
	
	public static void main(String[] args) {
		
		// 예외를 활용한 프로그래밍 기법
		// 변수의 값에 따라 또는 어떤 논리적인 상황들의 발생을 예측해서
		// 사용자정의예외를 생성해 두고 값이나 상황에 따라 예외를 발생시키고
		// 알맞은 처리를 해주는 프로그래밍 기법
		// => 예외상황에 대한 모듈화가 가능해짐 => 적극적으로 활용하자!!!
		
		int age = 17;
		
		try {
			// 나이가 15세 이하이면 Under15Exception을 발생시킴
			if (age<=15) throw new Under15Exception();
			// 나이가 19세 이하이면 Under19Exception을 발생시킴		
			else if (age<=19) throw new Under19Exception();
		} catch (Under15Exception u15e) {
			System.out.println(u15e);
		} catch (Under19Exception u19e) {
			System.out.println(u19e);
		}
		
	} // main

} // class


























