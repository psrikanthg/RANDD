package com.child.functional.interfa;

public class TestFunctionalInterface {
	
	public static void main(String args[]) {
		
		FunctionalInterfaceExample ex =(a, b) ->(a+b);
		System.out.println(ex.randomCalculate(10, 20));
		
	}

}
