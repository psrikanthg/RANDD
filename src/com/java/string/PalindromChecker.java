package com.java.string;

import java.util.stream.IntStream;

public class PalindromChecker {
	
	public static void main(String args[]) {
		
		     System.out.println(PalindromChecker.isPalindrome("nitin"));  
		    System.out.println(PalindromChecker.isPalindrome("jatin"));  
		    
		    String str ="nitin1";
		    
		    
		    boolean isPal =  IntStream.range(0, str.length()/2).noneMatch(s -> str.charAt(s)!=str.charAt(str.length()-1-s));
		    System.out.println("is Palindrom: "+isPal);
		    
		    boolean palindrom = true;
		    for(int i=0; i<str.length()/2; i++) {
		    	if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
		    		palindrom =false;
		    	}
		    }
		    
		    System.out.println(palindrom);
		    
		
	}
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		
		String rev = builder.toString();
		
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}

}
