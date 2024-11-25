package javabasic.exthread;

public class ConsumerThread extends Thread {
	
private TVFactory tvFactory;
	
	ConsumerThread(TVFactory tvFactory) {
		this.tvFactory = tvFactory;
	}

	@Override
	public void run() {
		while(true) {
			int amt = (int)(Math.random()*6) + 3;
			System.out.println(amt + "개의 TV 판매!");
			synchronized (tvFactory) {
				tvFactory.setTotal(tvFactory.getTotal() - amt);
			}
			System.out.println("총 재고수량 : " + tvFactory.getTotal());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
}
