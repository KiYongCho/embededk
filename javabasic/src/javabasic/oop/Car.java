package javabasic.oop;

public class Car {
	
	// static member variable
	// 1. 객체 생성 없이 클래스를 통해서 사용 가능한 변수
	// 2. 클래스를 통해서 생성되는 객체들이 값을 공유하는 변수
	static int carCount = 0; // 생성된 자동차 수
	
	// non-static member variable
	// 1. 객체를 생성한 후 객체를 통해서 사용 가능한 변수
	// 2. 객체마다 값을 각각 가지게 되는 변수
	String company; // 제조회사
	String model; // 모델명
	String name; // 이름
	int price; // 판매가
	
	// static member method
	// 객체 생성없이 클래스를 통해서 사용가능한 메소드
	public static int getCarCount() {
		return carCount;
	}
	
	// non-static member method
	// 객체를 생성한 후 객체를 통해서 사용가능한 메소드
	public int getPrice() {
		return price;
	}

} // class






























