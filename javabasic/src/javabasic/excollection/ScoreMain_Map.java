package javabasic.excollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class ScoreMain_Map {

	public static void main(String[] args) {
		
		System.out.println("3명의 이름과 국어,영어,수학 성적을 입력하세요!");
		System.out.println("입력형식 : 이름,국어성적,영어성적,수학성적");
		
		Scanner scanner = new Scanner(System.in);
		
		Map<Student, Score> studentMap = new HashMap<Student, Score>();
		
		StringTokenizer st;
		
		for (int i=0; i<3; i++) {
			
			st = new StringTokenizer(scanner.next());
			
			String name = st.nextToken();
			
			Score score = new Score(
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())
			);
			
			studentMap.put(new Student(name, score), null);
			
		}
		
		Set<Student> keySet = studentMap.keySet();
		
		Iterator<Student> it = keySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		scanner.close();
		
	} // main
	
} // class




















