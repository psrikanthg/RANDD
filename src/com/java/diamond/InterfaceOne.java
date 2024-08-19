package com.java.diamond;

public interface InterfaceOne {
	
	default void anyMethod() {
		System.out.println("Hi... from Interface one..");
	}

}
