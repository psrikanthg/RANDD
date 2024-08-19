package com.java.sorting;

import java.util.Arrays;

public class InsertionSort4 {
	
	public static void main(String args[]) {
		int arr[] = {5, 3, 2, 6, 9};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		
		int count = arr.length;
		
		for(int i=1; i<count; i++) {
			int key = arr[i];
			
			int j = i-1;
			
			while(j>=0 && arr[j] >key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			
		}
		
	}

}
