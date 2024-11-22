package javabasic.exio;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 329847932749327492L;
	
	private String name;
	private String no;
	private int price;
	
	public Product() {
	}

	public Product(String name, String no, int price) {
		super();
		this.name = name;
		this.no = no;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "상품명:"+name+", 상품번호:"+no+", 상품가격:"+price;
	}

}
