package javabasic.oop;

// PC가 Monitor, Desktop, Keyboard를 사용하는 두가지 방법
// 1. 상속 (is a) : 자바는 단일 상속만 지원, 즉 한 클래스가 한 클래스만 상속이 가능
//                       => 강한 의존 관계 = 강한 결합 (Strong Coupling)
// 2. 의존 (has a) : PC가 Monitor, Desktop, Keyboard를 멤버변수로 가짐
//                       => 약한 의존 관계 = 약한 결합 (Weak Coupling)
// 상속은 확장(Extention)의 개념, 의존은 위임(Delegation)의 개념

public class PC {

	// PC클래스와 PC클래스의 멤버변수들의 관계는 has a 관계
	// => PC타입 객체가 생성되려면 Monitor타입 객체, Desktop타입 객체, 
	//       Keyboard타입 객체가 먼저 생성되어야 함
	// => PC 객체는 Monitor객체, Desktop객체, Keyboard객체에 의존(dependency)한다
	String company;
	int price;	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;

}






