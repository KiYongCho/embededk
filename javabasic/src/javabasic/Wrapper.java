package javabasic;

public class Wrapper {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		int i = 3; // 정수타입의 기본타입
		long l = 4;
		float f = 3.14f;
		double d = 2.1; // 실수타입의 기본타입
		char c = 'A';
		boolean bool = true;

		Byte wb = new Byte(b);
		Short ws = new Short(s);
		Integer wi = new Integer(i);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Character wc = new Character(c);
		Boolean wbool = new Boolean(bool);
		
		int sum = 1 + wi;
		System.out.println(sum);
		
		System.out.println(wb);
		System.out.println(ws);
		System.out.println(wi);
		System.out.println(wl);
		System.out.println(wf);
		System.out.println(wd);
		System.out.println(wc);
		System.out.println(wbool);
		
	}

}
