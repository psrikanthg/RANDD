package com.java.test;

public class ArrayEvenPosition {
	
	public static void main(String args[]) {
		
		int arr[] =  new int [] {1, 2, 3, 4, 5, 6};
		
		for(int i=1; i<=arr.length;i =i+2) {
			System.err.println(arr[i]);
			
		}
		
		int min = Math.min(5,7);
		System.out.println(min);
	}

}
