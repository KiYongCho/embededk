package javabasic.oop.inheritance;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20);
		Person kang = new Person("강감찬", 30);
		
		System.out.println(hong.equals(kang)); // false
		
		Person person1 = new Person("사람", 20);
		Person person2 = new Person("사람", 20);
		
		System.out.println(person1.equals(person2)); // false, 오버라이딩하면 true
		
	} // main

} // class












