package com.java.string;

//immutable class are String, Integer, Boolean, Byte, Short, Long, Float, Double etc.

//class should be final
//fileds should be final, must be initialized with constructor
//no setters, only getters
public final class ImmutableClass {
	
	private final String name;
	
	public ImmutableClass(String name) {
		this.name =name;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String args[]) {
		ImmutableClass e = new ImmutableClass("Srikanth");
		String s = e.getName();
		System.out.println("Pan Card Number:: "+s);
	}
	
	

}
