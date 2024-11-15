package javabasic.exception;

public class Under15Exception extends Exception {
	
	@Override
	public String toString() {
		return "15세 이하 관람불가!";
	}

}
