package javabasic.exio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExObject2 {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\ExObject2.dat");
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			List<Product> productList = new ArrayList<Product>();
			productList.add(new Product("다보여", "grass01", 1000));
			productList.add(new Product("잘보여", "grass02", 2000));
			productList.add(new Product("더잘보여", "grass03", 4000));
			
			oos.writeObject(new Shop("안경샵", (ArrayList)productList));
			
			ois = new ObjectInputStream(new FileInputStream(file));
			
			System.out.println((Shop)ois.readObject());
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
	}

}
