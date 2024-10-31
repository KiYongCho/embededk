package javabasic;

public class ExMethod5 {
	
	public static void main(String[] args) {
		
		String[][] scoreArray = {
				{"홍길동", "100", "90", "80", "0", "0"},
				{"강감찬", "90", "80", "70", "0", "0"},
				{"이순신", "80", "70", "60", "0", "0"}
		};
		
		calcScore(scoreArray);
		
		printScore(scoreArray);
		
	} // main
	
	static void calcScore(String[][] scoreArray) {
		for (int i=0; i<scoreArray.length; i++) {
			int sum = 0;
			int avg = 0;
			for (int j=1; j<4; j++) {
				sum += Integer.parseInt(scoreArray[i][j]);
			}
			avg = sum / scoreArray.length;
			scoreArray[i][4] = "" + sum;
			scoreArray[i][5] = "" + avg;
		}
	}
	
	static void printScore(String[][] scoreArray) {
		for (int i=0; i<scoreArray.length; i++) {
			for (int j=0; j<scoreArray[0].length; j++) {
				System.out.print(scoreArray[i][j] + " ");
			}
			System.out.println();
		}		
	}
	
} // class





