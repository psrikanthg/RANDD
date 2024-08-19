package com.java.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysSort {
	
	public static void main(String args[]) {
		
		//int arr[] = new int[] {1, 3, 6, 4, 1, 2};
		int arr[] = new int[] {1, 2, 3, 9, 7, 8, 5, 6};
		//int arr[] = new int[] {-1, -3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int smalles =0;
		int index = 0;
		for(int i=0; i< arr.length -1; i++) {
			if(arr[i]<0) {
				smalles =1;
			}else if(arr[i]<= arr[i+1] && arr[i]==arr[i+1]) {
				continue;
			}
			if(arr[i]< arr[i+1] && arr[i]+1==arr[i+1]) {
				
			}else {
				index = arr[i]+1;
				break;
			}
		}
		if(smalles ==1) {
			System.out.println("smallest is "+smalles);
		} else if(index !=0) {
			System.out.println("smallest is "+index);
		}else {
			smalles = arr[arr.length-1]+1;
			System.out.println("smallest is "+smalles);
		}
		int arr1[] = new int[] {1, 3, 6, 4, 1, 2};
		System.out.println("before set::");
		System.out.println(Arrays.toString(arr1));
		
		Set<Integer> setIn = new HashSet<Integer>();
		for(int a: arr1) {
			setIn.add(a);
		}
		
		System.out.println(setIn);
		
		
		
	}

}
