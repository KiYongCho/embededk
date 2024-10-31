package javabasic;

public class Method2 {
	
	public static void main(String[] args) {
		
		// Method2타입의 객체 method2를 생성
		// Method2타입의 객체를 생성해서 객체참조값을 method2변수에 저장
		Method2 method2 = new Method2();
		
		// non-static메서드는 static인 main메서드 내에서 직접 호출 불가
		// 객체를 생성해서 객체로 호출해야 한다!
		method2.print("Hello Java!");
		//print("Hello Java!");
		//Method2.print("Hello Java!");
		
		int sum = method2.add(1, 2);
		System.out.println(sum);
		System.out.println(method2.add(3, 4));
		
	} // main
	
	// non-static메서드 : 객체 생생해서 객체로 호출(접근)하는 메서드
	void print(String str) {
		System.out.println(str);
	}
	
	int add(int a, int b) {
		return a + b;
	}

} // class



















