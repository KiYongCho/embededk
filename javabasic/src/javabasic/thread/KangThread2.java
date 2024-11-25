package javabasic.thread;

public class KangThread2 extends Thread {
	
	private Account2 kangAccount2;
	
	public KangThread2(Account2 account2) {
		this.kangAccount2 = account2;
	}
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			
			// 강계좌에 500원을 입금
			// kangAccount2.setMoney(kangAccount2.getMoney() + 500);
			
			// 1. 메소드 동기화
			kangAccount2.deposit();
			
			// 2. 객체 동기화 (동기화 블럭)
			//synchronized (kangAccount2) {
			//	kangAccount2.setMoney(kangAccount2.getMoney() + 500);
			//}			
			
			System.out.println("강감찬의 계좌에 500원 입금!");
			System.out.println(kangAccount2 + "\n");		

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	} // run
	
} // class










