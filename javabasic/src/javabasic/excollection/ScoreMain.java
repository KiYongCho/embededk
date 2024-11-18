package javabasic.excollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreMain {

	public static void main(String[] args) {
		
		System.out.println("3명의 이름과 국어,영어,수학 성적을 입력하세요!");
		System.out.println("입력형식 : 이름,국어성적,영어성적,수학성적");
		
		Scanner scanner = new Scanner(System.in);
		
		List<Student> studentList = new ArrayList<Student>();
		
		StringTokenizer st;
		
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(scanner.next());
			studentList.add(new Student(
					st.nextToken(","),
					new Score(
							Integer.parseInt(st.nextToken(",")),
							Integer.parseInt(st.nextToken(",")),
							Integer.parseInt(st.nextToken(","))
					)
			));
		}
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		scanner.close();
		
	} // main
	
} // class




















