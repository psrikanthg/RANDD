package com.java.search;

public class BinarySearch1 {
	
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		search(arr, 0, arr.length-1, 3);
		search(arr, 0, arr.length-1, 7);
		search(arr, 0, arr.length-1, 2);
		search(arr, 0, arr.length-1, 10);
	}
	
	
	public static void search(int arr[], int left, int right, int element) {
		
		int mid = (left+right)/2;
		
		while(left <=right) {
			
			if(arr[mid] < element) {
				left = mid+1;
			}else if(arr[mid] == element) {
				System.out.println("Element Found At index: "+mid);
				break;
			}else {
				right = mid-1;
			}
			
			mid = (left+right)/2;
		}
		
		if(left>right) {
			System.out.println("No Element Found");
		}
		
	}

}
