package com.java.structuraldesign;

public class ConsoleBasedLogger  extends Logger{
     
	public ConsoleBasedLogger(int levels) {
		this.level=levels;
	}
	
	@Override
	protected void displayLogInfo(String msg) {
		
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}

}
