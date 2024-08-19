package com.java.sorting;

import java.util.Arrays;

//the comparison-based on algorithm builds the sorted output one item at a time.
public class InsertionSort {
	
	public static void main(String args[]) {
		
		int arr[] = {12, 31, 25, 8, 32, 17};
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void insertionSort(int arr[]) {
		int n =arr.length;
		
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] >key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] =key;
		}
	}
	

}
