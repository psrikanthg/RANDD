package com.java.designpatterns;

public class SingleTonePattern {
	
	private static SingleTonePattern instance=null;
	
	private SingleTonePattern() {
		
	}
	
	
	public static SingleTonePattern getInstance() {
		
		if(instance ==null) {
			
			synchronized (SingleTonePattern.class) {
				instance = new SingleTonePattern();
			}
		}
		
		
		return instance;
	}
	
	
	public static void main(String args[]) {
		SingleTonePattern instance = SingleTonePattern.getInstance();
		System.out.println(instance);
	}
	

}
