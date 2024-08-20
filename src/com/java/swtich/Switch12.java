package com.java.swtich;

public class Switch12 {
	
	public static void main(String args[]) {
		
		String days = "MONDAY";

        System.out.println(getTextBefore12(1));
        System.out.println(getTextBefore12(3));
        System.out.println(getTextBefore12(6));
        System.out.println(getTextBefore12(10));
		
		
     }
	
	
	 //Switch Expressions are supported from Java 14 onwards only
	  private static String getTextViaArrow(int number) {
	        String result = switch(number) {
	            case 1, 2 -> "one or two";
	            case 3 -> "three";
	            case 4, 5, 6 -> "four or five or six";
	            default -> "unknown";
	        };
	        return result;
	    }
	
	 // Traditional switch statement
    private static String getTextBefore12(int number) {
        String result = "";
        switch (number) {
            case 1:
            case 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
            case 5:
            case 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }
 }
