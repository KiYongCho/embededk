package javabasic.api;

public class Person implements Cloneable{
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

}










