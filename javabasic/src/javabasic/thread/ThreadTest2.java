package javabasic.thread;

public class ThreadTest2 {
	
	public static void main(String[] args) {
		
		// 짝수 출력 쓰레드 생성 후 시작
		Thread evenThread = new EvenThread();
		evenThread.start();
		
		// 홀수 출력 쓰레드 생성 후 시작
		Thread oddThread = new OddThread();
		oddThread.start();
		
	} // main

} // class






















