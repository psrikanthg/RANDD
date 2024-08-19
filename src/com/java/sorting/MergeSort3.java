package com.java.sorting;

import java.util.Arrays;

public class MergeSort3 {
	
	public static void main(String args[]) {
		int arr[] = {6, 5, 4, 3, 1, 7, 8, 9};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After Sorting: "+Arrays.toString(arr));
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		
		if(left<right) {
			int mid =(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
			
		}
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 =  right -mid;
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			leftArray[i] = arr[left+i];
		
		for(int i=0; i<n2; i++)
			rightArray[i] = arr[mid+1+i];
		
		int i=0, j=0, k=left;
		
		while(i<n1 && j<n2) {
			if(leftArray[i] < rightArray[j]) {
				arr[k++] = leftArray[i++];
			}else {
				arr[k++] = rightArray[j++];
			}
		}
		
		while(i<n1)
			arr[k++] = leftArray[i++];
		
		while(j<n1)
		     arr[k++] = rightArray[j++];
	}

}
