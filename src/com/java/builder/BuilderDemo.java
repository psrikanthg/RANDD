package com.java.builder;

public class BuilderDemo {
	
	public static void main(String args[]) {
		
		CDBuilder  cd = new CDBuilder();
		CDType type = cd.buildSamsung();
		type.showItems();
		
		CDType soney = cd.buildSoney();
		soney.showItems();
		
		
	}

}
