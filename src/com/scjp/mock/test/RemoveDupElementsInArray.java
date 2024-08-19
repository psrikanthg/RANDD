package com.scjp.mock.test;

import java.util.Arrays;

public class RemoveDupElementsInArray {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2 ,4, 6, 2, 9};
		
		Arrays.sort(arr);
		
		int result[] = new int[arr.length];
		
		int previous = arr[0];
		result[0]= previous;
		
		for(int i=1; i<arr.length; i++) {
			
			int element = arr[i];
			
			if(previous!=element) {
				result[i] =element;
			}
			
			previous = element;
		}
		
		System.out.println("After Removing Duplicate Elements: ");
	    System.out.println(Arrays.toString(result));
	}

}
