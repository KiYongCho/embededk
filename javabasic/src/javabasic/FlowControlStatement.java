package javabasic;

public class FlowControlStatement {
	
	public static void main(String[] args) {
		
		// 조건문 if
		int i1 = 5;
		
		if (i1 > 5) {
			System.out.println("i1은 5보다 큽니다!");
		} else {
			System.out.println("i1은 5보다 크지 않습니다!");
		}
		
		i1 = 35;
		if (i1 < 10) {
			System.out.println("i1은 10보다 작습니다!");
		} else if (i1 < 20) {
			System.out.println("i1은 20보다 작습니다!");
		} else if (i1 < 30) {
			System.out.println("i1은 30보다 작습니다!");
		} else {
			System.out.println("i1은 30보다 작지 않습니다!");
		}
		
		// 조건문 switch
		int yoil = 3;
		switch (yoil) {
			case 0: System.out.println("일요일"); break;
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일");
		}
		
		// 위 switch 구문을 if로 변경
		if (yoil==0) System.out.println("일요일");
		else if (yoil==1) System.out.println("월요일");
		else if (yoil==2) System.out.println("화요일");
		else if (yoil==3) System.out.println("수요일");
		else if (yoil==4) System.out.println("목요일");
		else if (yoil==5) System.out.println("금요일");
		else if (yoil==6) System.out.println("토요일");
		
		// switch 구문의 값으로 문자열이 올 수 있음
		switch ("남자") {
			case "남자": System.out.println("male"); break;
			case "여자": System.out.println("female");
		}
		
		// 반복문 for
		// 구문 : for (초기식; 조건식; 증감식;) { 수행할 구문들... }
		// 실행순서
		// 1. 초기식 수행 (int i=0)
		// 2. 조건식 수행 (i<10)
		// 3. 조건식이 참이면 for블럭 수행
		// 4. 증감식 수행 (i++)
		// 3~4를 조건식이 false일때까지 반복
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		// for문을 이용해서 1~100 정수 중에서 홀수만 출력
		for (int i=1; i<100; i=i+2) {
			System.out.println(i);
		}
		
		// 실습 : for문을 이용해서 50부터 100까지 정수 중에서 3의 배수만 출력
		for (int i=51; i<100; i=i+3) {
			System.out.println(i);
		}
		
		// 반복문 while
		// 조건이 참인 동안 반복적으로 while블럭을 수행
		// 무한루프에 빠지지 않도록 조건이 false일 수 있도록 로직을 구성해야 함
		int i2 = 1;
		while (i2 < 10) {
			System.out.println(i2);
			i2++;
		}
		
		// 반복문 do ~ while
		// 한번은 do블럭을 수행하고 while의 조건이 참인 동안 반복 수행
		do {
			System.out.println(i2);
			i2++;
		} while (i2<5);
		
		// 실습 : while문을 이용해서 1~100 중에서 짝수만 출력
		int i3 = 1;
		while (i3<=100) {
			if (i3%2 == 0) System.out.println(i3++);
		}
		
		// 실습 : while문을 이용해서 50부터 100까지 정수 중에서 7의 배수만 출력해 보자
		int i4 = 50;
		while (i4<=100) {
			if (i4%7 == 0) System.out.println(i4++);
		}
		
	} // main

} // class



















