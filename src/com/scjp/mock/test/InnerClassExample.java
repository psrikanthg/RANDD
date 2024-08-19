package com.scjp.mock.test;
//Types of Nested classes
//There are two types of nested classes non-static and static nested classes.
//
public class InnerClassExample {
	
	public class A1{
		
		
		public void printValue(){
			System.out.println("A a...");
		}
	}
	
	public static class A2{
		
		static String name="srikanth";
	}
	
	
	public static void main(String args[]){
		
		 InnerClassExample e = new InnerClassExample();
		 InnerClassExample.A1 a1=  e.new A1();
		 a1.printValue();
		 
		 InnerClassExample.A2  a2= new InnerClassExample.A2();
		 
		 System.out.println(a2.name);
		 
	}

}
