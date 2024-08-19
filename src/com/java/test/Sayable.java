package com.java.test;

public interface Sayable {

	void say();
	
	private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}
