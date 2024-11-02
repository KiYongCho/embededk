package javabasic.oop;

public class ConstructorMain {
	
	public static void main(String[] args) {
	
		Person hong = new Person();
		setData(hong, "홍길동", "산적", 20, 170.5f);
		printData(hong);
		
		Person kang = new Person();
		setData(kang, "강감찬", "장군", 30, 180.5f);
		printData(kang);
		
	} // main
	
	static void setData(Person person, String name, String job, int age, float height) {
		person.setName(name);
		person.setJob(job);
		person.setAge(age);
		person.setHeight(height);
	}
	
	static void printData(Person person) {
		System.out.printf("이름:%s\t직업:%s\t나이:%d\t신장:%4.1f\n", person.getName(), person.getJob(), person.getAge(), person.getHeight());
	}
	

} // class
