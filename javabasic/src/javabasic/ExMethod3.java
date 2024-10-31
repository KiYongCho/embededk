package javabasic;

public class ExMethod3 {
	
	public static void main(String[] args) {
		System.out.println(calc(10, 5, '+'));
		System.out.println(calc(10, 5, '-'));
		System.out.println(calc(10, 5, '*'));
		System.out.println(calc(10, 5, '/'));
	}
	
	static int calc(int a, int b, char op) {
		switch (op) {
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': return a / b;
			default: return 0; 
		}
	}

}
