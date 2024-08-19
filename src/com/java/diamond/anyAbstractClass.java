package com.java.diamond;

public abstract class anyAbstractClass {
	
	private int a;
	protected int b;
	public int c;
	int d;
	static int e;
	
	final int f  =10;
	
	public anyAbstractClass() {
		System.out.println("Abstract class can have constructors");
	}
	
	abstract void abstractMethod();// Abstract class can have abstract method
	
	private  static void staticMethod() {
		System.out.println("Static Method allowed for abstract");
	}
	
	public void privateMethod() {
		System.out.println("private methods allowed for abstract");
	}
	
	protected void protectedMethod() {
		System.out.println("abstract class can have protected method");
	}
	
	final void finalMethod() {
		System.out.println("Abstract class can have final method");
	}
	

}
