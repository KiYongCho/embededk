package javabasic.thread;

public class ThreadTest4 {
	
	public static void main(String[] args) {
		
		// 쓰레드들이 공유해서 사용하는 계좌 객체 생성
		Account2 account2 = new Account2("커플계좌", 0);
		
		// HongThread2가 만들어 질때 공유 계좌 사용
		Thread hongThread2 = new HongThread2(account2);
		hongThread2.start();

		// KangThread2가 만들어 질때 공유 계좌 사용		
		Thread kangThread2 = new KangThread2(account2);
		kangThread2.start();
		
		try {
			Thread.sleep(11000);
			System.out.println("최종계좌 : " + account2);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}

}
