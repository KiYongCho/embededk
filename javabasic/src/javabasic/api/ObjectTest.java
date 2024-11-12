package javabasic.api;

public class ObjectTest {
	
	public static void main(String[] args) {
		
		// Object clone() : 객체를 복제 = 같은 내용을 가진 다른 객체를 생성
		// Cloable인터페이스를 구현하고 clone메소드를 오버라이딩해야 클론이 가능
		try {
			Person origin = new Person("홍길동", 20);
			Person clone = (Person)origin.clone(); // 객체 복제
			System.out.println(origin.hashCode()); // 해쉬코드값
			System.out.println(clone.hashCode());
			System.out.println(origin==clone);
			System.out.println(origin.equals(clone)); // 객체 동일성 비교
			// Person에서 toString을 오버라이딩 하기 전에는 객체의 문자열 표현을 반환 (타입@16진수참조값)
			// System.out.println(origin.toString());
			System.out.println(origin.toString()); // Person에서 오버라이딩한 toString 호출
			System.out.println(clone.name + " " + clone.age);
			clone.finalize(); // 객체 메모리 해제 요청 (deprecated)
			Class personClass = origin.getClass(); // 객체의 클래스 정보, reflection
			System.out.println(personClass.getName()); // 클래스명 (Class클래스)
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		
	} // main

} // class








