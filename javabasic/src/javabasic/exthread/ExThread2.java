package javabasic.exthread;

public class ExThread2 {
	
	boolean flag;
	
	public static void main(String[] args) {
		
		ExThread2 et2 = new ExThread2();		
		
		Thread ut = new UpperThread(et2);
		ut.start();
		
		Thread lt = new LowerThread(et2);
		lt.start();
		
	}

}
