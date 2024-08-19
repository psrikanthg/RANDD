package com.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringToken {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    if(s.trim().isEmpty()) {
	        System.out.println(0);
	    }
	    else {
	        System.out.println(s.trim().split("[!,?. @_']+").length);
	        for(String a : s.trim().split("[!,?. @_']+")){
	            System.out.println(a);
	            }
	        }
	    scan.close();
	    }

}
