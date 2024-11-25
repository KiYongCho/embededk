package javabasic.exthread;

public class FiveThread extends Thread {
	
	int i = 0;
	
	@Override
	public void run() {
		while (true) {
			System.out.println("5의 배수" + 5*i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
