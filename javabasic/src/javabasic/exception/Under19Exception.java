package javabasic.exception;

public class Under19Exception extends Exception {
	
	@Override
	public String toString() {
		return "19세 이하 관람불가!";
	}

}
