package javabasic.exoop1;

public class Desktop {
	
	private String cpu;
	private String memory;
	private int price;
	
	public Desktop() {
	}

	public Desktop(String cpu, String memory, int price) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
