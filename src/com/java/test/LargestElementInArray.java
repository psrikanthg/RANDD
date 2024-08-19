package com.java.test;

public class LargestElementInArray {
	
	public static void main(String args[]) {
		
		int arr[] = new int[] {10, 20,55, 45, 15};
		
		int max = arr[0];
		
		for(int i=0; i<=arr.length-1; i++) {
			if(max<arr[i]) {
				
				max = arr[i];
			}
		}
		System.out.println("Max Elements are :"+max);
	}

}
