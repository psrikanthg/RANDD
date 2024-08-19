package com.java.diamond;

public interface AnyInterface {

	
	 public static final int i=10; //can have public static final 
	 //private int b =10; only public static final allowed
	 
	 void abstractMethod(); //abstract method
	 
	 default void defaultMethod() {
		 System.out.println("Interface can have default method");
	 }
	 
	 static void staticMethod() {
		 System.out.println("Interface can have static method");
	 }
	 
	 //No Constructor in interface
	 //no non static, non final variable in an interface
	 //no private fields, methods in an interface
	 //No Protected fields and methods in an interface
	 //No final methods in an interface
	 
}
