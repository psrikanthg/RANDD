package com.java.sorting;

import java.util.Arrays;

public class SelectionSort6 {
	
	public static void main(String args[]) {
		
		int arr[] = {5, 3, 2, 6, 9};
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		selectionSort(arr, 0, arr.length-1);
		System.out.println("After Sorting: "+Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[], int left, int right) {
		
		int count = arr.length;
		
		for(int i=0; i< count; i++) {
			int min = i;
			
			for(int j=i+1; j<count; j++) {
				if(arr[j] < arr[min]) {
					min =j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
	}

}
