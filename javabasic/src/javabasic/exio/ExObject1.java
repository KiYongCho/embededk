package javabasic.exio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExObject1 {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\ExObject1.dat");
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(new Person("홍길동", 20));
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Person hong = (Person)ois.readObject();
			System.out.println(hong);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
	}

}







