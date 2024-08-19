package com.java.sorting;

import java.util.Collections;

public class QuickSortingAlgorithm {
	
	
	
	public static void QuickSort(int arr[], int left, int right){
		
		int index  = partition(arr, left, right);
		
		if(left < index -1)
			QuickSort(arr, left, index-1);
		
		if(index < right)
			QuickSort(arr, index, right);
			
	}
	
	
	public static int partition(int arr[], int left, int right){
		
		int pivot = arr[(left+right)/2];
		
		while(left <= right){
			
			while(arr[left] < pivot)
				left++;
			
			while(arr[right] > pivot)
				right--;
			
			 if(left <= right){
				  int temp = arr[left];
				  arr[left] = arr[right];
				  arr[right] = temp;
				  
				  left++;
				  right--;
			 }
		}
		
		return left;
		
	}

	
	public static void main(String... args){
		
		int array[] = {4, 6, 7, 8, 1, 2, 3, 9, 5, 10};
		
		QuickSort(array, 0, array.length-1);
		for(int i=0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		
		
		
	}
}
