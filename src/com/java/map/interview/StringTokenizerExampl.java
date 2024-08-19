package com.java.map.interview;

import java.util.StringTokenizer;

public class StringTokenizerExampl {
	
	public static void main(String args[]) {
		
		StringTokenizer token = new StringTokenizer("my name is khan", " ");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}
