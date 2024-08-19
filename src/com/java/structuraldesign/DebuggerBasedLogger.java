package com.java.structuraldesign;

public class DebuggerBasedLogger  extends Logger{
	
	public DebuggerBasedLogger(int levels) {
		this.level=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUGGE BASED LOGGER: "+msg);
		
	}
	
	

}
