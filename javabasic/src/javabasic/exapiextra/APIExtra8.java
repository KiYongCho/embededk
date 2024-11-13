package javabasic.exapiextra;

public class APIExtra8 {
	
	public static void main(String[] args) {
		
		// 한 줄 입력
		String line = Util.getLineText(1)[0];
		
		// 문자배열로 변환
		char[] chArr = line.toCharArray();
		
		int[] countArr = new int[4];
		
		// 문자배열 순회
		for (char ch : chArr) {
			byte b = (byte)ch;
			if (b>=65 && b<=90) { // 대문자
				countArr[0]++;
			} else if (b>=97 && b<=122) { // 소문자
				countArr[1]++;
			} else if (b>=48 && b<=57) { // 숫자
				countArr[2]++;
			} else { // 기호
				countArr[3]++;
			}
		}
		
		System.out.printf(
				"대문자는 %d개 소문자는 %d개 숫자는 %d개 기호는 %d개",
				countArr[0], countArr[1], countArr[2], countArr[3]
		);
		
	} // main

} // class













