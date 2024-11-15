package javabasic.exexception;

public class ExceptionTest3 {
	
	public static void main(String[] args) {
		
		// 5개의 Person객체를 생성
		makePerson("홍길동", "산적");
		makePerson("강감찬", "장군");
		makePerson("이순신", "장군");
		makePerson("임꺽정", "산적");
		makePerson("권율", "장군");
		
	}
	
	private static void makePerson(String name, String job) {
		// 생성된 Person객체의 직업이 산적이면
		if (new Person(name, job).getJob().equals("산적")) {
			try {
				// JobException을 발생 시킴
				throw new JobException();
			// JobException을 처리함
			} catch (JobException je) {
				System.out.println(name + "님 " + je);
			}
		};
	}

} // class
















