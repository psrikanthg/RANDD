package com.java.structuraldesign;

public class ErrorBasedLogger  extends Logger{

	public ErrorBasedLogger(int level) {
		this.level=level;
	}
	
	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR BASED LOGGER: "+msg);
		
	}

	
}
