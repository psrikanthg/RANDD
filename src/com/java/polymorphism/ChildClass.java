package com.java.polymorphism;

public class ChildClass extends ParentClass {

	//the same method also exists in the ParentClass  
	//it does not override, actually it is method hiding  
	public static void display() {
		System.out.println("child class static method");
	}
	
	public static void main(String args[]) {
		
		ParentClass p = new ChildClass();
		//calling parent static method
		//
		p.display();
		
	}
}
