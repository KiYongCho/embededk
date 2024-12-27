package javabasic.oop;

public class Car2Main {
	
	public static void main(String[] args) {
		
		Car2 audi = new Car2();
		audi.setCompany("AUDI KOREA");
		audi.setModel("A8");
		audi.setName("AUDI");
		
		// Car2에서 setPrice를 제공하지 않으면audi의 price를 변경할 방법이 없음
		// audi.price = 500;
		// audi.setPrice(500);
		
		audi.setPrice(500);
		
		System.out.println(audi.getCompany());
		System.out.println(audi.getModel());
		System.out.println(audi.getName());
		System.out.println(audi.getPrice());
		
	}

}









