package javabasic.exthread;

public class ProducerThread extends Thread {
	
	private TVFactory tvFactory;
	
	ProducerThread(TVFactory tvFactory) {
		this.tvFactory = tvFactory;
	}
	
	@Override
	public void run() {
		while(true) {
			int amt = (int)(Math.random()*6) + 5;
			System.out.println(amt + "개의 TV 생산!");
			synchronized (tvFactory) {
				tvFactory.setTotal(tvFactory.getTotal() + amt);
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


