package com.java.test;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxElementInArray {
	
	public static void main(String args[]) {
		
		int[] array = new int[] {10, 20, 40, 60, 5, 9, 8};
		
		int result = Arrays.stream(array).max().getAsInt();
		
		System.out.println("Result:: "+result);
	}

}
