package javabasic.exthread;

public class ExThread1 {
	
	public static void main(String[] args) {
		
		Thread tt = new ThreeThread();
		tt.start();
		
		Thread ft = new FiveThread();
		ft.start();
		
	}

}
