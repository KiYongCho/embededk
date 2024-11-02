package javabasic.oop;

public class PC {
	
	String company;
	int price;
	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;
	
	public PC() {
	}
	
	public PC(String company, Monitor monitor, Desktop desktop
			, Keyboard keyboard) {
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	
	int getPrice() {
		return this.price;
	}
	
	void setPrice() {
		this.price = monitor.price + desktop.price + keyboard.price; 
	}

} // class










