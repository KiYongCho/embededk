package javabasic.oop;

public class PrinterMain {

	public static void main(String[] args) {
		
		// 잉크젯 프린터 하나 생성해서 켜고, 프린트하고, 꺼 보세요.
		
		// 인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.
		// why??? 프로그램 구현이 유연하고 확장성 있어 진다
		IPrinter inkjet = new InkjetPrinter("삼송", "잉크안막혀1", 1000);
		operate(inkjet);

		
		// 인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.		
		// 레이져 프린터 하나 생성해서 켜고, 프린트하고, 꺼 보세요.		
		IPrinter razor = new RazorPrinter("앱송", "종이다잘려1", 2000);
		operate(razor);
		
		// 배열에서 다형성을 활용
		
		// 잉크젯프린터 500개와 레이져프린터 500개를 갖는 배열을 생성
		IPrinter[] iprinterArr = new IPrinter[1000];
		
		// 배열에 잉크젯프린터 객체 500개, 레이져프린터 객체 500개 저장
		int iprinterArrLeng = iprinterArr.length; // 1000
		for (int i=0; i<iprinterArrLeng; i++) {
			if (i%2==0) {
				iprinterArr[i] = new InkjetPrinter(
						"제조사명"+(i+1), "Inkjet"+(i+1), 1000 
				);
			} else {
				iprinterArr[i] = new RazorPrinter(
						"제조사명"+(i+1), "Razor"+(i+1), 2000 
				);
			}
		}
		
		// 배열에 있는 것 모두 꺼내서 출력
		// 출력형태 : 잉크젯프린터 (제조사명1, Inkjet1, 1000원)
		//              레이져프린터 (제조사명1, Razor1, 2000원)
		//               ... (1000개)
		
		// 50점
		for (int i=0; i<iprinterArrLeng; i++) {
			if (i%2==0) {
				InkjetPrinter ink = (InkjetPrinter)iprinterArr[i];
				System.out.print("잉크젯프린터 (");
				System.out.print(ink.company);
				System.out.print(", ");
				System.out.print(ink.name);
				System.out.print(", ");
				System.out.print(ink.price);
				System.out.println(")");
			} else {
				RazorPrinter r = (RazorPrinter)iprinterArr[i];
				System.out.print("레이져프린터 (");
				System.out.print(r.company);
				System.out.print(", ");
				System.out.print(r.name);
				System.out.print(", ");
				System.out.print(r.price);
				System.out.println(")");				
			}			
		}
		
		// 80점
		for (int i=0; i<iprinterArrLeng; i++) {
			if (iprinterArr[i] instanceof InkjetPrinter) {
				System.out.print("잉크젯프린터");
			} else if (iprinterArr[i] instanceof RazorPrinter) {
				System.out.print("레이져프린터");
			}
			print(iprinterArr[i]);
		}
		
		// 100점
		// toString() 오버라이딩을 이용해 보자!
		// company, name, price는 AbstractPrinter가 가지고 있다!
		// 그러므로, AbstractPrinter에 toString()을 오버라이딩 하자!
		for (IPrinter iprinter : iprinterArr) {
			System.out.println((AbstractPrinter)iprinter);
		}
		
	} // main
	
	static void print(IPrinter iprinter) {
		System.out.print(((AbstractPrinter)iprinter).company);
		System.out.print(", ");
		System.out.print(((AbstractPrinter)iprinter).name);
		System.out.print(", ");
		System.out.print(((AbstractPrinter)iprinter).price);
		System.out.println(")");		
	}
	
	// IPrinter인터페이스의 역할 : InkjetPrinter, RazorPrinter의 타입을 일원화
	static void operate(IPrinter iprinter) {
		// iprinter가 가지고 있는 참조값에 따라서 각 클래스의 메소드가 호출됨
		iprinter.turnOn();
		iprinter.print();
		iprinter.turnOff();
	}

} // class




















