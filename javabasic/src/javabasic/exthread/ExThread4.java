package javabasic.exthread;

public class ExThread4 {

	public static void main(String[] args) {
		
		TVFactory tvFactory = new TVFactory(100);
		
		Thread pt = new ProducerThread(tvFactory);
		pt.start();
		
		Thread ct = new ConsumerThread(tvFactory);
		ct.start();
		
		
	} // main
	
} // class












