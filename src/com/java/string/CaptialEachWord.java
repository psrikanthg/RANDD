package com.java.string;

import java.util.Arrays;
import java.util.stream.Collectors;
//Java Program to tOGGLE each word in String
//same program first.toLowerCase()+second.toUpperCase()
public class CaptialEachWord {
	
	public static void main(String args[]) {
		
		String str = "this is javat point";
        String rev ="";
        
       String words[] = str.split(" ");
       for(String word: words) {
    	   String first = word.substring(0, 1);
    	   String second = word.substring(1);
    	   rev+=first.toUpperCase()+second+" ";
       }
         
       
       System.out.println("Captial of Each letter: "+rev);
       
       String str1 = "this is javat point";
       String reverse =  Arrays.stream(str1.split(" ")).filter(word -> word.length() > 0).map(s -> s.substring(0, 1).toUpperCase()+s.substring(1)).collect(Collectors.joining(" "));
       System.out.println(reverse);
        
        
        
		
	}

}
