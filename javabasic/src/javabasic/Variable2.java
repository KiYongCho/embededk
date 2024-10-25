package javabasic;

public class Variable2 {
	
	static int si = 1;
	int nsi = 2;
	
	public static void main(String[] args) {
		
		int li = 3;
		System.out.println(li);
		
		Variable2 v2 = new Variable2();
		System.out.println(v2.si);
		System.out.println(v2.nsi);
		
		System.out.println(Variable2.si);
	}

}
