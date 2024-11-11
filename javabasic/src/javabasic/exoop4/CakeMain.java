package javabasic.exoop4;

public class CakeMain {
	
	public static void main(String[] args) {
		
		printCake("모카");
		printCake("쵸콜릿");
		printCake("바나나");
		
	} // main
	
	public static void printCake(String name) {
		Cake cake = new Cake(name) {
			@Override
			public String getName() {
				return name;
			}
		};
		System.out.println(cake.getName() + "케이크가 만들어 졌습니다!");				
	}

} // class























