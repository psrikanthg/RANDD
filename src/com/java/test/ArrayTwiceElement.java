package com.java.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayTwiceElement {
	
	public static void main(String args[]) {
		
		//List<Integer> nums = Arrays.asList(10, 20, 30, 40,10);
		//Integer[] numsArray =  nums.stream().toArray(Integer[]::new);
		
		int[] nums = new int[] {1,2,3,1};
		
		List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
		
		Set<Integer> setList =  new HashSet<>(list);
		
		if(setList.size()==list.size()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}
