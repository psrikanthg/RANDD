package com.java.designpatterns;

public class CDBuilder {
	
	
	public CDType buildSonyCD() {
		CDType cdType = new CDType();
		cdType.addItem(new Sony());
	    return cdType;	
	}
	
	
	public CDType buildSamsungCD() {
		CDType cdType = new CDType();
		cdType.addItem(new Samsung());
		return cdType;
	}

}
