package javabasic;

public class ExMethod1 {
	
	public static void main(String[] args) {
		System.out.println(printBigger(3, 5));
	}
	
	static int printBigger(int a, int b) {
		if (a>=b) return a;
		else return b;
	}

}
