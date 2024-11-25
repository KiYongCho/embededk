package javabasic.exthread;

public class TVFactory {
	
	private int total;
	
	public TVFactory(int total) {
		this.total = total;		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "TVFactory [total=" + total + "]";
	}
	
}
