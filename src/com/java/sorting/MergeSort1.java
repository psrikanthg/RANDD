package com.java.sorting;

import java.util.Arrays;

public class MergeSort1 {
	
	public static void main(String args[]) {
		int arr[] = {5, 3, 2, 6, 9};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		sort(arr, 0, arr.length-1);
		System.out.println("After Sort: "+Arrays.toString(arr));
	}
	
	public static void sort(int arr[], int left, int right) {
		
		if(left <right) {
			int mid =  (left+right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			mergeSort(arr, left, mid, right);
		}
		
	}
	
	public static void mergeSort(int arr[], int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 =  right-mid;
		
		int leftarr[] = new int[n1];
		int rightarr[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			leftarr[i] = arr[left+i];
		
		for(int i=0; i<n2; i++)
			rightarr[i] = arr[mid+i+1];
		
		int i=0, j=0, k =left;
		
		while(i<n1 && j<n2) {
			if(leftarr[i] < rightarr[j]) {
				arr[k++] = leftarr[i++];
			}else {
				arr[k++] = rightarr[j++];
			}
		}
			
		while(i<n1) {
			arr[k++] = leftarr[i++];
		}
		
		while(j<n2) {
			arr[k++] = rightarr[j++];
		}
		
	}

}
