package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectTest2 {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\object2.dat");
		
		class Score implements Serializable {
			private static final long serialVersionUID = 38924723892343L;
			int kor;
			int eng;
			Score(int kor, int eng) {
				this.kor = kor;
				this.eng = eng;
			}
		}
		
		class Person implements Serializable {
			private static final long serialVersionUID = 890234578893245L;
			String name;
			transient String ssn; // 주민번호, transient:직렬화 제외 키워드
			int age;
			Score score;
			public Person(String name, String ssn, int age, Score score) {
				this.name = name;
				this.ssn = ssn;
				this.age = age;
				this.score = score;
			}
		}
		
		Person hong = new Person("홍길동", "000000-0000000", 20, 
				new Score(100, 90));
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(hong);
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Person h = (Person)ois.readObject();
			System.out.println(h.name);
			System.out.println(h.ssn); // transient 키워드가 붙으면 타입의 기본값으로 직렬화
			System.out.println(h.age);
			System.out.println(h.score.kor);
			System.out.println(h.score.eng);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
	} // main
	
} // class
































