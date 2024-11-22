package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectTest1 {
	
	public static void main(String[] args) {
		
		class Person implements Serializable {
			private static final long serialVersionUID = 30298478902384L;
			String name;
			int age;
			Person() {}
			Person(String name, int age) {
				this.name = name;
				this.age = age;
			}
		}
		
		Person hong = new Person("홍길동", 20);
		Person kang = new Person("강감찬", 30);
		
		File file = new File("D:\\embededk\\files\\object.dat");
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 파일에 객체를 저장
			oos = new ObjectOutputStream(new FileOutputStream(file));
			// 직렬화
			oos.writeObject(hong);
			oos.writeObject(kang);
			
			// 파일에 있는 객체를 가져옴
			ois = new ObjectInputStream(new FileInputStream(file));
			// 역직렬화
			Person h = (Person)ois.readObject();
			System.out.println(h.name + ", " + h.age);
			Person k = (Person)ois.readObject();
			System.out.println(k.name + ", " + k.age);
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
	} // main

} // class




























