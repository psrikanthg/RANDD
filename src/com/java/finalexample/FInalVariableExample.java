package com.java.finalexample;

public class FInalVariableExample {
	
	final int i; //final can be blank finale, but can initialize value in constructor
	
	public FInalVariableExample() {
		this.i = 0;
		
		
	}
	
	public static void main(String args[]) {
		FInalVariableExample example = new FInalVariableExample();
		System.out.println(example.i);
	}

}
