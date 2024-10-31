package javabasic;

public class Variable2 {
	
	// Variable2클래스의 static 멤버 변수 (클래스로딩 타임에 메모리에 생김)
	static int si = 1;
	
	// Variable2클래스의 non-static 멤버 변수 (실행타임에 메모리에 생김)
	int nsi = 2;
	
	public static void main(String[] args) {
		
		// nsi = 5;
		si = 2;
		
		// main메소드의 지역 변수 (실행타임에 메모리에 생김)
		int li = 3;
		
	}

}



