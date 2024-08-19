package com.java.structuraldesign;
/**
 * A chain of Responsiblity Pattern says that just avoid coupling the sender of a request
 * to its receiver by giving multiple objects a chance to handle the request
 * 
 * @author admin-pamangundla
 * 
 * A chain of responsibility pattern says that just avoid coupling the sender of a request
 * to its receiver by giving multiple objects a chance to handle the request
 *
 */
public class ChainOfResponsiblityClient {
	
	public static Logger doChaining() {
		
		Logger consLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
		
		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		errorLogger.setNextLevelLogger(consLogger);
		
		Logger debugLogger = new DebuggerBasedLogger(Logger.DEBUGINFO);
		debugLogger.setNextLevelLogger(errorLogger);
		
		return consLogger;
	}
	
	public static void main(String args[]) {
		
		Logger logger = doChaining();
		
		logger.logMessages(Logger.OUTPUTINFO, " Enter the sequence of values");
		logger.logMessages(Logger.ERRORINFO, "An error is occured now");
		logger.logMessages(Logger.DEBUGINFO, "This was the error now debugging is compeled");  

		
	}

}
