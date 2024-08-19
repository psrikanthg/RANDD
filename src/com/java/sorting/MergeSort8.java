package com.java.sorting;

import java.util.Arrays;

public class MergeSort8 {
	
	public static void main(String args[]) {
		int arr[] = {5, 3, 2, 6, 9};
		System.out.println("Before Merge Sort: "+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After Merge Sort: "+Arrays.toString(arr));
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		
		if(left <right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int leftArrary[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for(int i=0; i<n1; i++) {
			leftArrary[i] = arr[left+i];
		}
		
		for(int i=0; i<n2; i++)
			rightArray[i] =  arr[mid+1+i];
		
		int i=0, j=0, k =left;
		
		while(i<n1 && j<n2) {
			if(leftArrary[i]<= rightArray[j]) {
				arr[k++] = leftArrary[i++];
			}else {
				arr[k++] = rightArray[j++];
			}
		}
		
		while(i<n1) {
			arr[k++] = leftArrary[i++];
		}
		
		while(j<n2) {
			arr[k++] = rightArray[j++];
		}
	}

}
