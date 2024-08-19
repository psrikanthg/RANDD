package com.java.arithmatic;

public class LocalVariableIncrement {
	
	public static void main(String args[]){
		
		int x=5;
		doStuff(x);
		System.out.println(" x ->"+x);
	}
	
	public static void doStuff(int x){
		
		System.out.println(++x);
	}

}
