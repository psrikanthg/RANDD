package com.java.stack;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]) {
		
		String input = "cat";
		
		char []arr =  input.toCharArray();
		
		Stack<Character> list = new Stack<>();
		
		for(int i =0;i<arr.length; i++) {
			list.push(arr[i]);
		}
		
		System.out.println("Befor Reverse"+list);
		
	    System.out.println("After Reverse:");
	    String str = null;
	    for(int i =0; i<=list.size(); i++) {
	    	 System.out.print(list.pop());
	    }
	    System.out.print(list.pop());
	}

}
