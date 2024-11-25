package javabasic.exthread;

public class LowerThread extends Thread {
	
	int i = 97;
	ExThread2 et2;
	
	LowerThread(ExThread2 et2) {
		this.et2 = et2;
	}	
	
	@Override
	public void run() {
		while (true) {
			synchronized (et2) {
				if (et2.flag) {
					System.out.println((char)i++);
				}
				et2.flag = false;
			}
			try {
				if(i==123) this.interrupt();
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				System.exit(0);
			}
		}
	}

}
