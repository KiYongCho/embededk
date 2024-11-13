package javabasic.exapiextra;

public class APIExtra6 {
	
	public static void main(String[] args) {
		
		// 한 줄 입력
		String line = Util.getLineText(1)[0];
		
		// 문자배열로 변환
		char[] chArr = line.toCharArray();
		
		// StringBuilder 생성
		StringBuilder sb = new StringBuilder();
		
		// 문자배열 순회
		for (char ch : chArr) {
			// 공백문자가 아니면
			if (ch!=' ') {
				// StringBuilder에 문자를 추가
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
		
	}

}
