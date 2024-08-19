package com.java.diamond;

public interface InterfaceWithDefaultAndStaticMethod {
	
	void abstractMethod();
	default void defaultMethod() {
		System.out.println("it is a default method");
	}
	
	static void staticMethod() {
		System.out.println("It is a static method");
	}

}
