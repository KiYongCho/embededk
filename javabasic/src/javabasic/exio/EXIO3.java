package javabasic.exio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EXIO3 {
	
	public static void main(String[] args) {

		System.out.println("학생 3명의 이름,국어점수,영어점수,수학점수를 입력해 주세요!");
		System.out.println("입력 예) 홍길동,100,100,100");
		
		Scanner scanner = new Scanner(System.in);
		
		List<Student> studentList = new ArrayList<Student>();
		
		for (int i=0; i<3; i++) {
			String lineStr = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(lineStr, ",");
			studentList.add(
				new Student(
							st.nextToken(), 
							new Score(
									Integer.parseInt(st.nextToken()), 
									Integer.parseInt(st.nextToken()), 
									Integer.parseInt(st.nextToken())
							)
						)
			);
		}
		
		OutputStream os = null;
		Reader reader = null;
		
		try {
			
			File file = new File("D:\\embededk\\files\\student.dat");
			
			os = new FileOutputStream(file);
			
			for (Student student : studentList) {
				os.write(student.getName().getBytes());
				os.write(String.valueOf(student.getScore().getKor()).getBytes());
				os.write(String.valueOf(student.getScore().getEng()).getBytes());
				os.write(String.valueOf(student.getScore().getMath()).getBytes());
			}
			
			os.flush();
			
			reader = new InputStreamReader(new FileInputStream(file));
			int i = 0;
			while ((i=reader.read()) > -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				reader.close();
				os.close();
				scanner.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class


















