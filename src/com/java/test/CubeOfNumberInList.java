package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfNumberInList {
	
	public static void main(String args[]) {
		
		List<Integer> nums =  Arrays.asList(10, 20, 30, 50, 50);
		
		List<Integer> cubeList =  nums.stream().map(n -> n*n*n).filter(n -> n>50).collect(Collectors.toList());
		
		cubeList.forEach(System.out::println);
		
	}

}
