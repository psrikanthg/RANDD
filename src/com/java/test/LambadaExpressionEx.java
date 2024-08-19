package com.java.test;

public class LambadaExpressionEx {
 
	public static void main(String args[]) {
		
		Sayable sb =()->{
			System.out.println("Hello Lambada Expression");
		};
		
		sb.say();
	}
	 
}
