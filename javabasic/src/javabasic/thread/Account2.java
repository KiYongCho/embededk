package javabasic.thread;

// 계좌 클래스
public class Account2 {
	
	private String name;
	private int money;
	
	public Account2() {
	}

	public Account2(String name, int money) {
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
		return "Account2 [name=" + name + ", money=" + money + "]";
	}
	
	// 동기화 메소드
	// HongThread가 withdraw메소드를 실행하는 동안 다른 쓰레드들은 withdraw내에 있는
	// 모든 객체의 락을 얻을 수 없음 = HongThread에게만 락을 부여
	public synchronized void withdraw() {
		this.setMoney(this.getMoney() - 500);
	}
	
	public synchronized void deposit() {
		this.setMoney(this.getMoney() + 500);
	}	
	
} // class




































