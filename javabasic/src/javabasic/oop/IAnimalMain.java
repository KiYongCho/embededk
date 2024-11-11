package javabasic.oop;

public class IAnimalMain {

	public static void main(String[] args) {
		
		// 멍멍 짓는 강아지
		IAnimal mungDog = new Dog2();
		mungDog.sound();
		
		// 왈왈 짓는 강아지
		IAnimal walDog = new AnimalAdapter() {
			@Override
			public void sound() {
				System.out.println("왈왈");
			}
		};
		walDog.sound();
		

	} // main

} // class




































