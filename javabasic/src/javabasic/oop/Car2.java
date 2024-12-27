package javabasic.oop;

/*
  정보은닉 (Information hiding) = 캡슐화 (Encapsulation)
  	- 클래스의 변수들을 private 접근지정을 하고 변수값들을 가져가거나(getter)
  	   변경(setter)하는 getter/setter 메소드를 public 으로 제공
  	- 클래스 내부에 변수들의 값의 임의 변경하거나 가져가는 것을 제어할 목적
 */

public class Car2 {

	private String company;
	private String model;
	private String name;
	private int price;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 클래스 외부에서 price변수의 원래 값을 알지 못하게 하려면 getter에서 값을 조절
	public int getPrice() {
		return price + 1000;
	}

	// 클래스 외부에서 price변수값의 변경을 막고 싶으면 setter를 제공하 않으면 됨
	public void setPrice(int price) {
		this.price = price;
	}

}











