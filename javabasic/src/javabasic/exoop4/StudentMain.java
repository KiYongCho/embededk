package javabasic.exoop4;

public class StudentMain {
	
	public static void main(String[] args) {
		
		makeStudent("홍길동", 100, 90, 80);
		makeStudent("강감찬", 90, 80, 70);
		makeStudent("이순신", 80, 70, 60);
		
	} // main
	
	public static void makeStudent(String name, int kor, int eng, int math) {
		Student student = new Student(name);
		student.score = student.new Score(kor, eng, math, 0, 0.0f);
		printScore(student);		
	}
	
	public static void printScore(Student student) {
		System.out.println(
				student.name 
				+ " 학생의 국어점수는 " + student.score.kor
				+ ", 영어점수는 " + student.score.eng
				+ ", 수학점수는 " + student.score.math
				+ ", 총점은 " + student.score.getSum()
				+ ", 평균은 " + student.score.getAvg()
		);
	}

} // class

















