package javabasic.exoop2;

public class PC {
	
	private String company;
	private int price;
	
	private Monitor monitor;
	private Desktop desktop;
	private Keyboard keyboard;
	
	public PC() {
	}
	
	public PC(String company, Monitor monitor, Desktop desktop
			, Keyboard keyboard) {
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice() {
		this.price = monitor.getPrice() + desktop.getPrice()
			+ keyboard.getPrice(); 
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Desktop getDesktop() {
		return desktop;
	}

	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
} // class