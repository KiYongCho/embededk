package javabasic.exio;

import java.io.Serializable;
import java.util.ArrayList;

public class Shop implements Serializable {
	
	private static final long serialVersionUID = 984395934858793489L;
	
	private String name;
	private ArrayList<Product> productList;
	
	public Shop() {
	}

	public Shop(String name, ArrayList<Product> productList) {
		this.name = name;
		this.productList = productList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	@Override
	public String toString() {
		return "상점명:"+name+", 제품리스트:"+productList;
	}

}
