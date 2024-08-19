package com.java.diamond;

public interface InterfaceTwo  extends InterfaceOne{

	
	@Override
	
	default void anyMethod() {
		System.out.println("Hi .... from interface two");
	}
}
