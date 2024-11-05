package javabasic.oop;

import java.sql.Timestamp;

// 역할 : Robot 데이터 클래스
public class Robot {
	
	private String name; // 이름
	private String company; // 제조사
	private Timestamp mfd; // 제조년월
	private int weight; // 중량 (KG)
	
	public Robot() {
	}

	public Robot(String name, String company, Timestamp mfd, int weight) {
		this.name = name;
		this.company = company;
		this.mfd = mfd;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Timestamp getMfd() {
		return mfd;
	}

	public void setMfd(Timestamp mfd) {
		this.mfd = mfd;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", company=" + company + ", mfd=" + mfd + ", weight=" + weight + "]";
	}
	
}







