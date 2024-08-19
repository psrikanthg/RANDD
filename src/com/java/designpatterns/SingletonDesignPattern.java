package com.java.designpatterns;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern designPattern = null;
	
	private SingletonDesignPattern() {
		
	}
	
	
	public static SingletonDesignPattern getInstance() {
		
		if(designPattern == null) {
			synchronized (SingletonDesignPattern.class) {
				if(designPattern ==null) {
					designPattern = new SingletonDesignPattern();
				}
			}
		}
		
		return designPattern;
	}
	
	public static void main(String args[]) {
		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		System.out.println(instance);
	}

}
