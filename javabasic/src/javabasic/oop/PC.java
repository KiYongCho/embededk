package javabasic.oop;

// PC객체를 생성하려면 Monitor, Desktop, Keyboard가 있어야 함
// *** has a 관계 (위임관계, delegation)
// 상속받지 않아도 가지고 있으므로 사용할 수 있는 관계
// PC has a Monitor
// PC has a Desktop
// PC has a Keyboard
public class PC {
	
	String company; // 제조회사
	int price; // 가격
	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;
	
	public PC() {
	}

	public PC(String company, Monitor monitor, Desktop desktop, Keyboard keyboard) {
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	// PC의 가격은 모니터 가격 + 데스크탑 가격 + 키보드 가격
	public void setPrice() {
		this.price = monitor.price + desktop.price + keyboard.price;
	}
	
	

} // class














