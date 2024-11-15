package javabasic.exexception;

public class ExceptionTest1 {
	
	long[] longArr = new long[1024*1024*1024];
	
	public static void main(String[] args) {
		
		// OutOfMemory Error
		// new ExceptionTest1();
		
		// StatckOverflow Error
		//a();
	}
	
	private static void a() {
		System.out.println("a() 호출됨!");
		b();
	}
	
	private static void b() {
		System.out.println("b() 호출됨!");
		a();
	}

} // class










