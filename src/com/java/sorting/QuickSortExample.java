package com.java.sorting;

import java.util.Arrays;

//Quick sort means select pivot element based (left+right)/2
//Divide, first pick up a pivot element, after that partition or rearrange the array into 
//subarrays such that each element in left sub-array is less than or equal to pivot element
//each element in the right array is larger than the pivot element
public class QuickSortExample {
	
	public static void main(String args[]) {
		int array[] = {4, 6, 7, 8, 1, 2, 3, 9, 5, 10};
		
		for(int a: array) {
		System.out.print(a);
		}
		QuickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
		
	}
	
	
	public static void QuickSort(int arr[], int left, int right) {
		
		int index = partition(arr, left, right);
		
		if(left < index-1) {
			QuickSort(arr, left, index-1);
		}
		
		if(index < right) {
			QuickSort(arr, index, right);
		}
	}

	
	public static int  partition(int arr[], int left, int right) {
		
		int pivot = arr[(left+right)/2];
		
		while(left<=right) {
			while(arr[left]<pivot)
				left++;
			
			while(arr[right]>pivot)
               right--;
			
			if(left <=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] =temp;
				
				left++;
				right--;
			}
			
		}
		
		return left;
	}
}
