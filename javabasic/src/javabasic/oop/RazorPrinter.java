package javabasic.oop;

public class RazorPrinter extends AbstractPrinter {

	public RazorPrinter(String company, String name, int price) {
		super(company, name, price);
		this.sort = "레이져프린터";
	}

	@Override
	public void print() {
		System.out.println(
				company + "회사의 프린터 "
				+ name + "은 레이져를 이용해 출력하고 "
				+ "가격은 " + price + "원 입니다!"
		);
	}

}
