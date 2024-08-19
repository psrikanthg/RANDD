package com.java.test;

import java.util.Arrays;

public class SortArrayConvertIntoStream {
	
	
	public static void main(String args[]) {
		
		int arr[] = {99, 55, 203, 99, 4, 91};
		
		Arrays.parallelSort(arr);
		Arrays.sort(arr);
        
		Arrays.stream(arr).forEach(System.out::println);
	}

}
