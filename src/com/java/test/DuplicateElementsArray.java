package com.java.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
	
	public static void main(String args[]) {
		
		int arr[] = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		Set<Integer> set = new HashSet<>();
		
		int dup[] =  Arrays.stream(arr).boxed().filter(s -> !set.add(s)).mapToInt(s -> s).toArray();
		System.out.println("Dup elements: "+Arrays.toString(dup));
		
		
		
	}

}
