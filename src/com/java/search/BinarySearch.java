package com.java.search;

public class BinarySearch {
	
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		binarySearch(arr, 0, arr.length-1, 10);
	}
	
	public static void binarySearch(int arr[], int left, int right, int element) {
		
		  int mid = arr[(left+right)/2];
		  
		  while(left<=right) {
			  
			  if(arr[mid] < element) {
				  left =mid+1;
			  }else if(arr[mid] == element) {
				  System.out.println("Element fount at index: "+mid);
				  break;
			  }else {
				  
				  right =  mid-1;
			  }
			  
			  mid = (left+right)/2;
		  }
		  
		  if(left>right) {
			  System.out.println("No Index fount at the element: ");
		  }
	}

}
