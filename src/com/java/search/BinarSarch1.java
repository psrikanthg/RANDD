package com.java.search;

import java.util.Arrays;

public class BinarSarch1 {
	
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Before Sort: "+Arrays.toString(arr));
		binarySarch(arr, 0, arr.length-1, 12);
		
	}
	
	public static void binarySarch(int arr[], int left, int right, int element) {
		
		int mid = (left+right)/2;
		
		while(left<=right) {
			
			if(arr[mid] <element) {
				left = mid+1;
				
			}else if(arr[mid] ==element) {
				System.out.println("Element Index found at: "+mid);
				break;
			}else {
				right =  mid-1;
			}
			
		   mid = (left+right)/2;
			
		}
		
		if(left>right) {
			System.out.println("No Element Found");
		}
		
	}

}
