package javabasic.excollection;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo2 {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("홍길동", "20"));
		personList.add(new Person("강감찬", "30"));
		personList.add(new Person("이순신", "50"));
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
	} // main
	
} // class






