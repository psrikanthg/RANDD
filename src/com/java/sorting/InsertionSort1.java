package com.java.sorting;

import java.util.Arrays;

public class InsertionSort1 {
	
	public static void main(String args[]) {
		int arr[] = {12, 31, 25, 8, 32, 17};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		
		int count = arr.length;
		
		for(int i=1; i<count; i++) {
			int key = arr[i];
			int j =  i-1;
			while(j>=0 && arr[j] >key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] =key;
		}
		
		
	}

}
