package com.java.sorting;

import java.util.Arrays;

public class QuickSort9 {
	
	public static void main(String args[]) {
		int arr[] = {5, 3, 2, 6, 9, 0, 1};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
	    System.out.println("After Sorting: "+Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[], int left, int right) {
		
		int index = partition(arr, left, right);
		if(left< index-1)
			quickSort(arr, left, index-1);
		
		if(index < right) {
			quickSort(arr, index, right);
		}
		
	}
	
	public static int partition(int arr[], int left, int right) {
		
		int pivot =  (left+right)/2;
		
		while(arr[left]< arr[pivot])
			left++;
		
		while(arr[right] > arr[pivot])
			right--;
		
		if(left<=right) {
			int temp =arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return left;
	}

}
