package com.java.book.programs;

public interface Java8Interface {
	
	//default methods must be public by definition, public modifier is optional
	//default methods can not be marked as private, protected, static, final or abstract
	//default methods must have a concrete method body
	//default methods are declared by using the default keyword, the default keyword can be used only
	//with interface method signature, not class method signatures.
	
	
	default int m1() {
		return 1;
	}
	
	public default void m2() {
		
	}
	
	//static default void m3() {} //illegarl, default can not be marked static
	
	//default void m4(); //illegal, default must have amethod body
	
	//static interface methods are declared by using static keyword
	//static interface methods are public by default and the public modifier is optional
	//static interface methods are can not be marked as private, protected, final or abstract
	//static int m1(){return 42;}
	public static void me() {};
	static int m3() {return 42; }

	 //by default public static final variables
	
}
