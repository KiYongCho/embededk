package javabasic.exception;

public class ExceptionMain1 {
	
	public static void main(String[] args) {

		try {
			// 예외 발생 가능한 코드들...
			// 문법적으로 문제가 없어서 컴파일시에는 오류가 없음
			
			// 실행하면 RuntimeException 중에 ArithmeticException 발생 (divide by zero)
			// ArithmeticException이 발생하면 catch (Arithmetic... 구문으로 예외객체를 전달
			int i = 10 / 0;
			
			// 실행하면 NumberFormatException 발생
			// NumberFormatException이 발생하면 catch (IllegalArgument... 구문으로 예외객체를 전달
			int i2 = Integer.parseInt("백");
			
		// RuntimeException 중에서 ArithmeticException 처리
		} catch (ArithmeticException ae) { // catch 여러개 일때는 위에서부터 하위예외클래스
			System.out.println(ae.getClass().getName());
			ae.printStackTrace();
		// RuntimeException 중에서 IllegalArfumentException 처리
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getClass().getName());
			iae.printStackTrace();
		// RuntimeException 중에서 ArithmeticException이 아닌 예외 처리
		} catch (RuntimeException re) {
			System.out.println(re.getClass().getName());
			re.printStackTrace();
		// Exception 중에서 RuntimeException이 아닌 예외 처리
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			// 발생한 예외를 처리하는 코드들...
			e.printStackTrace();
		} finally { // 선택사항
			// 예외 발생하든 안하든 처리할 코드들...
			System.out.println("예외발생 여부에 상관없이 이 코드는 수행된다!");
		}
		
	} // main

} // class
























