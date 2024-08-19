package com.java.sorting;

import java.util.Arrays;

public class SelectionSort2 {
	
	public static void main(String args[]) {
		int arr[] = {6, 5, 4, 3, 1, 7, 8, 9};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[]) {
		int count = arr.length;
		
		for(int i=0; i<count; i++) {
			int min =i;
			
			for(int j=i+1; j<count; j++) {
				if(arr[j]< arr[min])
					min =j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
	}

}
