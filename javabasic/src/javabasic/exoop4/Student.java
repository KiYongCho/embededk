package javabasic.exoop4;

public class Student {
	
	String name;
	Score score;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, Score score) {
		this(name);
		this.score = score;
	}
	
	class Score {
		
		int kor;
		int eng;
		int math;
		int sum;
		float avg;
		
		public Score(int kor, int eng, int math, int sum, float avg) {
			super();
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sum = sum;
			this.avg = avg;
		}
		
		public int getSum() {
			return kor + eng + math;
		}
		
		public float getAvg() {
			return getSum() / 3;
		}
		
	} // Score

} // Student










