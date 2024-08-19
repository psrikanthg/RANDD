package com.java.Exceptions;
import static java.lang.System.out;
public class ArthmaticException {
	
	public static void main(String ...args){
		
		try{
			
			int c= 10/0;
			out.println("after devide ");
		}catch(java.lang.ArithmeticException exc){
			
			out.print("<- catch successfull");
			//return ; // finally executes and there after code does not execute
			//System.exit(0); //if we use system.exit(), finally and there after code does not work
		}
		
		finally{
			
			out.println("<-- finally caught");
		}
		
		out.println(" after finally ");
		
	}

}
