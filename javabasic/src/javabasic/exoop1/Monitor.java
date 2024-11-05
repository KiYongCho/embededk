package javabasic.exoop1;

public class Monitor {
	
	private String company;
	private String model;
	private int inch;
	private int price;
	
	public Monitor() {
	}

	public Monitor(String company, String model, int inch, int price) {
		super();
		this.company = company;
		this.model = model;
		this.inch = inch;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
