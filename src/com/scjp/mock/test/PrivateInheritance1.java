package com.scjp.mock.test;

public class PrivateInheritance1  extends PrivateInheritance{
	
	public void printNames(){
		
		System.out.println(" Name --PrivateInheritance1");
	}
	
	public void test2(){
		System.out.println(" test2");
	}
	
	public static void main(String args[]){
		PrivateInheritance inheritance = new PrivateInheritance();
		PrivateInheritance b = new PrivateInheritance1();
		b.printNames();
		
		((PrivateInheritance1) b).test2();
	}

}
