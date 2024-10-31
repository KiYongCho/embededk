package javabasic;

public class ExMethod2 {
	
	public static void main(String[] args) {
		System.out.println("세 실수의 총합은 " + sum(1.1, 2.2, 3.3) + " 입니다!");
	}
	
	static double sum(double d1, double d2, double d3) {
		return d1 + d2 + d3;
	}

}
