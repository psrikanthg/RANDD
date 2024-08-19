package com.java.sorting;

import java.util.Arrays;

public class MergeSort6 {
	
	public static void main(String args[]) {
		
		int arr[] = {5, 3, 2, 6, 9};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int leftarray[] = new int[n1];
		
		int rightarray[] = new int[n2];
		
		for(int i=0; i<n1; i++) {
			leftarray[i] = arr[left+i];
		}
		
		for(int i=0; i<n2; i++) {
			rightarray[i] = arr[mid+1+i];
		}
		
		int i=0, j=0, k=left;
		
		while(i<n1 && j<n2) {
			if(leftarray[i]<=rightarray[j]) {
				arr[k++] = leftarray[i++];
			}else {
				arr[k++] = rightarray[j++];
			}
		}
		
		
		while(i<n1) {
			arr[k++] = leftarray[i++];
		}
			
		
		while(j<n2) {
			arr[k++] = rightarray[j++];
		}
			
		
	}

}
