package com.java.constructor;

public class Const2 extends Constractor1 {
  
	
	//Implicit super constructor Constractor1() is undefined. Must explicitly invoke another constructor
	public Const2(String name) {
		//super(name); uncomment this to avoid compiler error
	}
	
	
	public static void main(String args[]) {
		new Const2("constructor need default const");
		
	}
}
