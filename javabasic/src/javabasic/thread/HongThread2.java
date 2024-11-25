package javabasic.thread;

public class HongThread2 extends Thread {
	
	private Account2 hongAccount2;
	
	public HongThread2(Account2 account2) {
		this.hongAccount2 = account2;
	}
	
	@Override
	public void run() {
		
		// 객체동기화 방법
		// 1. 메소드동기화 : 메소드 앞에 synchronized, 메소드내의 모든 객체가 동시에 동기화
		// 2. 동기화블럭 : synchronized(동기화할객체) {}, 블럭내에서 지정한 객체만 동기화
		
		for (int i=0; i<10; i++) {
			
			// 홍계좌에서 500원을 출금
			// hongAccount2.setMoney(hongAccount2.getMoney() - 500);
			
			// 1. 메소드 동기화
			hongAccount2.withdraw();
			
			// 2. 객체 동기화 (동기화 블럭)
			//synchronized (hongAccount2) {
			//	hongAccount2.setMoney(hongAccount2.getMoney() - 500);
			//}
			
			System.out.println("홍길동의 계좌에서 500원 출금!");
			System.out.println(hongAccount2 + "\n");		

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	} // run
	
} // class







