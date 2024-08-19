package com.java.sorting;

import java.util.Arrays;

public class BubbleSortEx {
	
	public static void main(String args[]) {
		
		int arr[] = {5, 3, 2, 6, 9};
		
		boolean flag =false;
		
		while(flag ==false) {
			flag =true;
			
			for(int i=0; i< arr.length-1; i++) {
				
				if(arr[i] >arr[i+1]) {
					int temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;
					flag =false;
					
				}
			}
		}
		
		System.out.println("Bubble Sort: "+Arrays.toString(arr));
		
		
	}

}
