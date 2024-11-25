package javabasic.exthread;

public class UpperThread extends Thread {
	
	private int i = 65;
	ExThread2 et2;
	
	UpperThread(ExThread2 et2) {
		this.et2 = et2;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (et2) {
				if (!et2.flag) {
					System.out.println((char)i++);
				}
				et2.flag = true;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
