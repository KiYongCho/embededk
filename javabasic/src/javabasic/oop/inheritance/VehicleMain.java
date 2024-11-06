package javabasic.oop.inheritance;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		System.out.println(v1); // Vehicle 참조값, toString오버라이딩하면 toString이 실행됨
		System.out.println(v1.getName()); // 탈것
		
		Vehicle v2 = new Car();
		System.out.println(v2); // Car 참조값, toString오버라이딩하면 toString이 실행됨
		System.out.println(v2.getName()); // 자동차
		
		Vehicle v3 = new Bicycle();
		System.out.println(v3); // Bicycle 참조값, toString오버라이딩하면 toString이 실행됨
		System.out.println(v3.getName()); // 자전거
		
	}

}
