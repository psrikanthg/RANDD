package com.java.booelan;

public class TryMe {
    
    public static void printB(String str) {
         System.out.print(Boolean.valueOf(str) ? "true" : "false"); 
    }
    
    public static void main(String args[]) {
        printB("tRuE");
        printB("false");
        
        boolean b = true;
        if(b == false){
        	
        	System.out.println(" unbeliverable");
        }
    }
    //output is true false
}
