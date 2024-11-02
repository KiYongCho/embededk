package javabasic.oop;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.company = "BMW KOREA";
		bmw.model = "520D";
		bmw.name = "BMW";
		bmw.price = 1000;
		
		System.out.println(
				"제조사명 : " + bmw.company + "\n"
				+ "모델명 : " + bmw.model + "\n"
				+ "이름 : " + bmw.name + "\n"
				+ "판매가격 : " + bmw.price
		);
		
		Car audi = new Car();
		audi.company = "AUDI KOREA";
		audi.model = "A8";
		audi.name = "AUDI";
		audi.price = 1500;
		
		System.out.println(
				"제조사명 : " + audi.company + "\n"
				+ "모델명 : " + audi.model + "\n"
				+ "이름 : " + audi.name + "\n"
				+ "판매가격 : " + audi.price
		);		
		
	} // main

} // class








