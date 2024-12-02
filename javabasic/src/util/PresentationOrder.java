package util;

import java.util.Scanner;

// 발표 순번 랜덤 추출 프로그램
public class PresentationOrder {

	static String[] students = {
			"박혜원", "손성진", "박승호", "구슬기", "김희라", "김시윤", "최경락", ""
	};
	static String[] presentors = {"", "", "", "", "", "", "", ""};	
	
	public static void main(String[] args) {
		
		int count = inputNum();
		
		while (count>0) {
			String name = students[(int)(Math.random()*students.length)];
			if (isDuplicated(name)==true) {
				continue;
			} else {
				presentors[count] = name;				
			}
			count--;
		}
		
		printPresentors();
		
		System.out.println("축하드립니다!!!");
		
	} // main
	
	static int inputNum() {
		System.out.println("학생 수를 입력하세요!");
		return new Scanner(System.in).nextInt();
	}
	
	static boolean isDuplicated(String name) {
		int studentsLength = students.length;
		for (int i=0; i<studentsLength; i++) {
			if (presentors[i].equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	static void printPresentors() {
		int studentsLength = students.length;
		for (int i=0; i<studentsLength; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			if (!presentors[i].equals("")) {
				System.out.println("당첨 축하 : " + presentors[i]);
			}
		}
	}
	
} // class









