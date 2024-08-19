package com.java.designpatterns;

public class BuilderDemo {
	
	public static void main(String args[]) {
		
		//Construct complex object from simple objects using step-by-step approach
		CDBuilder cdBuilder=new CDBuilder();  
		CDType    sony =  cdBuilder.buildSonyCD();
		sony.showItems();
		
		CDType samsung = cdBuilder.buildSamsungCD();
		samsung.showItems();
	}

}
