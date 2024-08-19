package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifferenceInArray {
	
	public static void main(String args[]) {
     List<Integer> ints = new ArrayList<Integer>();
		
		ints.add(15);
		ints.add(2);
		ints.add(4);
		ints.add(10);
		
		System.out.println(absoluteMiniDiff(ints));
	}
	
	
	public static int absoluteMiniDiff(List<Integer> list) {
		
		int arr[] = list.stream().mapToInt(Integer::valueOf).toArray();
		
		Arrays.sort(arr);
		
		int min =2000000000;
		
		for(int i=0; i<arr.length-1; i++) {
			min = Math.min(min, Math.abs(arr[i] - arr[i+1]));
		}
		
		
		return min;
		
	}

}
