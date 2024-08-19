package com.java.sorting;

import java.util.Arrays;

public class BubbleSort2 {
	
	public static void main(String args[]) {
		
		int arr[] = {5, 6, 1, 2, 4, 9};
		
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Sorting");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int arr[]) {
		//buble sort is simple sorting algoritham
		//it will sort two adjacent elements until it sorts
		
		boolean b = false;
		
		while(b ==false) {
			b=true;
			
			for(int i=0; i< arr.length-1; i++) {
				if(arr[i+1]<arr[i]) {
					int temp =  arr[i+1];
					arr[i+1] = arr[i];
					arr[i] =temp;
					b = false;
				}
			}
		}
		
	}

}
