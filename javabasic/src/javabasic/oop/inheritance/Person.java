package javabasic.oop.inheritance;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 이름과 나이가 같으면 equals가 true를 반환하도록 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this.name.equals(((Person)obj).name) 
				&& this.age==((Person)obj).age) {
			return true;
		} else {
			return false;
		}
	}

}








