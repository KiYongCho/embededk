package javabasic.exapiextra;

public class APIExtra2 {
	
	public static void main(String[] args) {
		
		char[] charArr = Util.getLineText(1)[0].toCharArray();
		
		int sum = 0;
		for (char ch : charArr) {
			sum += (int)ch;
		}
		System.out.println(sum);
		
	}

}
