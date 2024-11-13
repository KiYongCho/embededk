package javabasic.exapiextra;

public class APIExtra5 {
	
	public static void main(String[] args) {
		
		String[] strArr = Util.getLineText(2);
		
		int idx = -1;
		int count = 0;
		while((idx=strArr[0].indexOf(strArr[1], idx+1)) >= 0) {
			count++;
		}
		System.out.println(strArr[0] + "문자열내에는 " + strArr[1] 
				+ "문자열이 " + count + "개 있습니다!");
		
	}

}
