package javabasic.oop;

public class CarMain {

	public static void main(String[] args) {
		
		// Car 객체 생성
		// Car() 생성자 호출 > 메모리에 Car타입객체 생성 > 생성된 객체의 주소
		// > 해시알고리즘을 사용해서 참조값(해시값)으로 변환 > 참조값을 bmw 참조변수에 저장
		Car bmw = new Car();
		// javabasic.oop.Car@5305068a : 클래스풀네임@객체참조값(16진수)
		System.out.println(bmw);
		System.out.println(bmw.hashCode()); // 객체참조값(10진수)
		
		// 객체의 멤버변수에 값을 할당
		bmw.carCount = 1;
		bmw.company = "BMW KOREA";
		bmw.model = "520D";
		bmw.name = "BMW";
		bmw.price = 1000;
		
		Car bentz = new Car();
		bentz.carCount = 2;
		bentz.company = "BENTZ KOREA";
		bentz.model = "AMG";
		bentz.name = "BENTZ";
		bentz.price = 2000;
		
		// bmw의 carCount 출력
		// static 멤버변수는 메모리에 하나만 생기고
		// 모든 객체들이 값을 공유
		System.out.println(bmw.carCount); // 2
		
		// bmw, bentz의 price 출력
		// non-static 멤버변수는 객체마다 갖게되고
		// 객체마다 다른 값을 저장
		bmw.price = 1500;
		System.out.println(bmw.price);
		bentz.price = 2500;
		System.out.println(bentz.price);
		
		// carCount를 클래스로 출력
		// static 멤버변수는 클래스로 접근 가능
		System.out.println(Car.carCount);
		Car.carCount = 3;
		System.out.println(bmw.carCount);
		System.out.println(bentz.carCount);
		
		// static 멤버메소드는 클래스, 객체로 접근 가능
		System.out.println(Car.getCarCount());
		System.out.println(bmw.getCarCount());
		System.out.println(bentz.getCarCount());

		// non-static 멤버메소드는 객체로 접근 가능
		// System.out.println(Car.getPrice());
		System.out.println(bmw.getPrice());
		System.out.println(bentz.getPrice());		
		
	} // main

} // class


























