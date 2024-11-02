package javabasic.exoop1;

public class Keyboard {
	
	private int keyCount;
	private boolean wireless;
	private int price;
	
	public Keyboard() {
	}
	
	public Keyboard(int keyCount, boolean wireless, int price) {
		super();
		this.keyCount = keyCount;
		this.wireless = wireless;
		this.price = price;
	}

	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
