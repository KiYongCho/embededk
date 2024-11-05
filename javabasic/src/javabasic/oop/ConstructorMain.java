package javabasic.oop;

public class ConstructorMain {

	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		Person person2 = new Person("홍길동");
//		Person person3 = new Person("홍길동", "산적");
//		Person person4 = new Person("홍길동", "산적", 20);
//		Person person5 = new Person("홍길동", "산적", 20, 170.5f);
		
		Person[] personArr = {
				new Person(),
				new Person("홍길동"),
				new Person("홍길동", "산적"),
				new Person("홍길동", "산적", 20),
				new Person("홍길동", "산적", 20, 170.5f)
		};
		
		// non-static memeber variable는 초기화하지 않으면 각 변수 타입의 기본값으로 초기화 됨
		
		// 타입별 기본값
		// byte : 0
		// short : 0
		// int : 0
		// long 0
		// float : 0.0f
		// double : 0.0
		// char : ''
		// boolean : false
		// String : null
		
		printPerson(personArr);
		
		printfPerson(personArr);
		
	} // main
	
	static void printPerson(Person[] personArr) {
		int personArrLeng = personArr.length;
		for (Person person : personArr) {
			System.out.println(person);
		}
	}
	
	static void printfPerson(Person[] personArr) {
		int personArrLeng = personArr.length;
		for (Person person : personArr) {
			// formatting print (형식화 출력)
			// %s:문자열, %d:숫자, %f:실수, \t:탭문자, \n: 줄바꿈문자
			System.out.printf(
					"이름:%s\t직업:%s\t나이:%d\t키:%4.1f\n",
					person.getName(),
					person.getJob(),
					person.getAge(),
					person.getHeight()
			);
		}		
	}

} // class


















