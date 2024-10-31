package javabasic;

public class ExArray2 {
	
	public static void main(String[] args) {
		
		String[] nameArr = {"홍길동", "강감찬", "이순신"};
		String[] scoreArr = {"A", "D", "B"};
		
		int nameArrLength = nameArr.length;
		for (int i=0; i<nameArrLength; i++) {
			System.out.println(nameArr[i] + "학생의 성적은 " + scoreArr[i] + "입니다");
		}
		
	}

}
