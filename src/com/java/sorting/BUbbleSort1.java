package com.java.sorting;

import java.util.Arrays;

public class BUbbleSort1 {
	
	public static void main(String args[]) {
		int arr[] = {6, 5, 4, 3, 1, 7, 8, 9};
		
		System.out.println("Before Sort: "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After Sort: "+Arrays.toString(arr));
	}
	
	public static void bubbleSort(int arr[]) {
		
		boolean flag = false;
		
		while(flag == false) {
			flag =true;
			
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag =false;
				}
			}
			
		}
	}

}
