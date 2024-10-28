package javabasic;

public class CommandLineArguments {
	
	// String[] args : 명령행 인자 배열
	// main실행 시 main메소드에 전달할 문자열들
	public static void main(String[] args) {
		
		System.out.println("첫번째 명령행 인자 : " + args[0]);
		System.out.println("두번째 명령행 인자 : " + args[1]);
		System.out.println("세번째 명령행 인자 : " + args[2]);
		
	} // main

} // class
