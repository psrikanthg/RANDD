package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChild {

	public static void main(String args[]) {
		List<Integer> ints = new ArrayList<Integer>();
		
		ints.add(15);
		ints.add(2);
		ints.add(4);
		ints.add(10);
		
		System.out.println(minimumAbsoluteDifferenc(ints));
		
	}
	
	public static int minimumAbsoluteDifferenc(List<Integer> arr) {
		//2, 4, 10,15
		//i, j, i<j then j-1 is mininum equal difference
		//2<4, 4-2 =2, 10<15 , 15-10 =5 , 4<10, 4-10 =6
		int  intarr[] =  arr.stream().mapToInt(Integer::intValue).toArray();
		int min = 2000000000;
		Arrays.sort(intarr);
		for(int i=0; i<intarr.length-1; i++) {
			min = Math.min(min, Math.abs(intarr[i] - intarr[i+1]));
		}
		
	     return min;
	}
	
}
