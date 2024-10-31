package javabasic;

public class Method1 {
	
	public static void main(String[] args) {
		
		// print메서드 호출 (Invocation = Call)
		print("Hello Java!"); 
		print("Java Programming");
		
		// add메서드 호출
		int sum = add(1, 2);
		System.out.println(sum);
		System.out.println(add(3, 4));
		System.out.println(Method1.add(5,  6)); // static메서드는 클래스로 호출 가능
		
	} // main
	
	// static메서드 : 객체 생성 없이 접근할 수 있는 메서드
	// void : 메서드 실행 후 반환값이 없다
	// String str : 메서드 실행에 필요한 값을 저장하는 변수 = 파라미터(parameter) 변수
	static void print(String str) {
		System.out.println(str);
		// return; 리턴하는 값이 없으면 return; 구문을 생략할 수 있다
	}
	
	static int add(int a, int b) {
		return a + b;
	}

}









