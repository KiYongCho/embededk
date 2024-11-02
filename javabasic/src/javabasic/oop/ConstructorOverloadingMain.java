package javabasic.oop;

public class ConstructorOverloadingMain {
	
	public static void main(String[] args) {
		
		Person choi1 = new Person();
		printData(choi1);
		
		Person choi2 = new Person("최영");
		printData(choi2);
		
		Person choi3 = new Person("최영", "장군");
		printData(choi3);
		
		Person choi4 = new Person("최영", "장군", 20);
		printData(choi4);
		
		Person choi5 = new Person("최영", "장군", 20, 170.5f);
		printData(choi5);
		
		
	} // main
	
	static void printData(Person person) {
		System.out.printf("이름:%s\t직업:%s\t나이:%d\t신장:%4.1f\n", person.getName(), person.getJob(), person.getAge(), person.getHeight());
	}	

} // class
