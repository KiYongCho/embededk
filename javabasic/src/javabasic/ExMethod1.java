package javabasic;

public class ExMethod1 {
	
	public static void main(String[] args) {
		printBigger(3, 5);
		printBigger(4, 4);
		printBigger(5, 3);
	}
	
	static void printBigger(int a, int b) {
		if (a>b) {
			System.out.println(a + "가 " + b + " 보다 큽니다!");
		} else if (a==b) {
			System.out.println(a + "와 " + b + " 는 같습니다!");
		} else {
			System.out.println(a + "이 " + b + " 보다 작습니다!");
		}
	}

}
