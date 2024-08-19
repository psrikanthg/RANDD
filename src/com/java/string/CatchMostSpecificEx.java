package com.java.string;
//Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
public class CatchMostSpecificEx {
	  public static void main(String args[]) {
	        try {
	            String arr[] = new String[10];
	            arr = null;
	            arr[0] = "one";
	            System.out.print(arr[0]);
	        } catch(Exception ex) {
	            System.out.print("exception");
	        } catch(NullPointerException nex) {
	            System.out.print("null pointer exception");
	        }   
	    }
}

