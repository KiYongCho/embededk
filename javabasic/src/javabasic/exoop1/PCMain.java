package javabasic.exoop1;

public class PCMain {
	
	public static void main(String[] args) {
		
		Monitor monitor = new Monitor("알파스캔", "AS30", 30, 50000);
		
		Desktop desktop = new Desktop("I9", "16G", 100000);
		
		Keyboard keyboard = new Keyboard(101, true, 50000);
		
		PC pc = new PC("LG", monitor, desktop, keyboard);
		pc.setPrice();
		System.out.println(pc.getCompany() + "회사 PC의 총 가격은 "
				+ pc.getPrice() + "원 입니다!");
		
	}

}
