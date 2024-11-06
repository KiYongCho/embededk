package javabasic.oop.inheritance;

public class Bicycle extends Vehicle {
	
	private boolean hasChain;
	
	@Override
	String getName() {
		return "자전거";
	}
	
	@Override
	public String toString() {
		return "Bicycle의 toString()";
	}

}
