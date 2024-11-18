package javabasic.excollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fruits1 {
	
	public static void main(String[] args) {
		
		System.out.println("과일명 5개를 입력해 주세요!");
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> fruitList = new ArrayList<String>();
		
		for (int i=0; i<5; i++) {
			fruitList.add(scanner.next());
		}
		
		Iterator<String> it = fruitList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		scanner.close();
		
	} // main

} // class















