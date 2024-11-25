package javabasic.thread;

public class EvenThread extends Thread {

	private int i = 0;
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("EvenThread : " + i);
			i +=2 ;
			try {
				
				// 다른 쓰레드 실행 종료때까지 현재 쓰레드 실행 대기
				// OddThread쓰레드 종료때까지 대기하므로 OddThread만 실행됨
				// this.join();
				
				// Thread를 종료시키려면 interrupt메소드를 이용
				if (i==10) this.interrupt();
				
				
				Thread.sleep(2000);
				
			} catch (InterruptedException ie) {
				System.exit(0);
			}
		}
		
	} // run
	
} // class
























