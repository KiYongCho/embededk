package javabasic.oop;

public class Person {
	
	private String name;
	private String job;
	private int age;
	private float height;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String job) {
		this(name);
		this.job = job;
	}	
	
	public Person(String name, String job, int age) {
		this(name, job);
		this.age = age;
	}	
	
	public Person(String name, String job, int age, float height) {
		this(name, job, age);
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
}
