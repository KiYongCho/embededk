package javabasic.thread;

// 계좌 클래스
public class Account {
	
	private String name;
	private int money;
	
	public Account() {
	}

	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
} // class




































