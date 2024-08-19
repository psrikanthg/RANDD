package com.java.builder;

public class CDBuilder {

	
	
	public CDType buildSoney() {
		CDType cd = new CDType();
		cd.add(new Soney());
		return cd;
	}
	
	public CDType buildSamsung() {
		CDType cd = new CDType();
		cd.add(new Samsung());
		return cd;
	}
	
	 
}
