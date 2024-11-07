package javabasic.oop;

public class InkjetPrinter extends AbstractPrinter {
	
	public InkjetPrinter(String company, String name, int price) {
		super(company, name, price);
		this.sort = "잉크젯프린터";
	}

	@Override
	public void print() {
		System.out.println(
				company + "회사의 프린터 "
				+ name + "은 잉크를 이용해 출력하고 "
				+ "가격은 " + price + "원 입니다!"
		);
	}

}
