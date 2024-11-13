package javabasic.exapiextra;

public class APIExtra7 {
	
	public static void main(String[] args) {
		
		// 한 줄 입력
		String line = Util.getLineText(1)[0];
		
		// 문자배열로 변환
		char[] chArr = line.toCharArray();
		
		// StringBuilder 생성
		StringBuilder sb = new StringBuilder();
		
		// 문자배열 순회
		for (char ch : chArr) {
			if ((byte)ch<91) { // 대문자
				sb.append((char)(ch+32));
			} else { // 소문자
				sb.append((char)(ch-32));
			}
		}
		
		System.out.println(sb);
		
	}

}
