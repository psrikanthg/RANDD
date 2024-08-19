package com.java.search;

public class BinarySearchExam {
	
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		binarySearch(arr, 8);
		binarySearch(arr, 3);
		binarySearch(arr, 12);
	}
	
	public static void binarySearch(int arr[],  int element) {
		int left =0, right = arr.length-1;
		
		int mid =(left+right)/2;
		
		while(left<=right) {
			
			if(arr[mid] <element) {
				left = mid+1;
			}else if(arr[mid] ==element) {
				System.out.println("Element Found at "+left);
				break;
			}else {
				right = mid-1;
			}
			
			mid =(left+right)/2;
		}
		
		if(left>right) {
			System.out.println("No Element Found");
		}
	}

}
