package com.java.structuraldesign;
/*
 * 
 * 
 */
public abstract class Logger {

	
	public static int OUTPUTINFO =1;
	public static int ERRORINFO =2;
	public static int DEBUGINFO =3;
	
	protected int level;
	
	protected Logger nextLevelLogger;
	
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}
	

	 public void logMessages(int levels, String msg) {
		 
		 if(this.level<=levels) {
			 displayLogInfo(msg);
		 }
		 
		 if(nextLevelLogger!=null) {
			 nextLevelLogger.logMessages(levels, msg);
		 }
	 }
	 
	 protected abstract void displayLogInfo(String msg);
	
	
}
