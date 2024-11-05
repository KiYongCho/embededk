package javabasic.oop;

// JavaBeans 규약
// Javabean(데이터 클래스)
// 1. public 클래스
// 2. private 멤버변수
// 3. public 생성자
// 4. public getter / setter
public class Person {
	
	private String name; // 이름
	private String job; // 직업
	private int age; // 나이
	private float height; // 키
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String job) {
		this(name);
		//this.name = name;
		this.job = job;
	}

	public Person(String name, String job, int age) {
		this(name, job);
//		this.name = name;
//		this.job = job;
		this.age = age;
	}

	public Person(String name, String job, int age, float height) {
		this(name, job, age);
//		this.name = name;
//		this.job = job;
//		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", age=" + age + ", height=" + height + "]";
	}
	
} // clas










