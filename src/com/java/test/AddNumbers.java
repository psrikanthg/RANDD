package com.java.test;

public class AddNumbers {
	
	public static void main(String args[]) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println(1> 0? 1: 0);
		
		
	}
	
	public static int add(int a, int b) {
		System.out.println("two args method");
		return a+b;
	}
	
	public static int add(int... args) {
		System.out.println("Var arguments method called");
		int sum =0;
		for(int arg: args) {
			sum+= arg;
		}
		return sum;
	}

}
