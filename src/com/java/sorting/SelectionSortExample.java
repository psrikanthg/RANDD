package com.java.sorting;

import java.util.Arrays;

public class SelectionSortExample {
	
	public static void main(String args[]) {
		int arr[] = {3, 2, 5, 6, 7};
		
		selectionSort(arr);
		System.out.println("Selection Sort: "+Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			int min =i;
			
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[j] < arr[min]) {
					min =j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}

}
