package com.java.interface1;

import com.java.statics.StaticExam;


/*
 * implements class can throw Runt Time Exceptions, not the checkedExceptions
 * 
 * 
 * 
 */
public class Class1 extends StaticExam implements InterEx, interface1 {

	@Override
	public void show() throws NullPointerException {
		
		
	}

	@Override
	public void display() {
		
		/*
		 * 
		 * Exception must be same as not broader one
		 */
	}
	
	
	public static void main(String args[]){
		
		Class1 class1 = new Class1();
		//System.out.println(class1.x); if the same instance variable is in two interfaces
		//in implementing class it shows ambiguous error compile error
		//we can solve this by using below one
		
		InterEx ex;
		ex = class1;
		if(ex instanceof InterEx){
			
			System.out.println("Yes Ex instance of interEx");
		}
		Boolean b = new Boolean("true");
		//StringBuffer buffer ="abc"; //we need to create string buffer using new operator
		
		System.out.println(b);
		System.out.println(ex.x);
		interface1 interface1;
		interface1 = class1;
		System.out.println(interface1.x);
		
	}
	
	

}
