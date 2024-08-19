package com.java.sorting;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String args[]) {
		
		int arr[] = {6, 5, 4, 3, 1, 7, 8, 9};
		
		System.out.println("Before Sort: "+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
		
	}
	
	public static void sort(int arr[]) {
		
		
		int n = arr.length;
		
		for(int i =0; i<n; i++) {
			
			int min =i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min])
					min =j;
				
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
