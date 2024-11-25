package javabasic.thread;

public class OddThread extends Thread {

	private int i = 1;
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("OddThread : " + i);
			i +=2 ;
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	} // run
	
} // class
























