package javabasic.exthread;

public class ThreeThread extends Thread {
	
	int i = 0;
	
	@Override
	public void run() {
		while (true) {
			System.out.println("3의 배수" + 3*i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
