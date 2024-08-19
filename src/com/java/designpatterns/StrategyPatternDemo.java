package com.java.designpatterns;

/**
 * in Strategy design pattern, A class behavior or its algorithm can be changed at run time, 
 * this type of design pattern comes under behavior pattern.
 * 
 * 
 * 
 * @author admin-pamangundla
 *
 */
public class StrategyPatternDemo {
	
	public static void main(String args[]) {
		
		Context add = new Context(new OperationAdd());
		System.out.println("10+5 ="+add.execute(10, 5));
		
	}

}
