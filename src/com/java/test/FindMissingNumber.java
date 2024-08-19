package com.java.test;

import java.util.Arrays;

public class FindMissingNumber {
	
	 public static int calculateSumOfNNumbers(int n){
	        return (n * (n + 1))/2;
	    }

	    public static int calculateSum(int [] array){
	        return Arrays.stream(array).sum();
	    }
	
	public static void main(String args[] ) {
		
		     int n = 9;
	         int[] numbers = {1, 2, 3, 9, 7, 8, 5, 6};
		     //int numbers[] = new int[] {1, 3, 6, 4, 1, 2};
	        int nNumberSum = FindMissingNumber.calculateSumOfNNumbers(n);
	        int sumOfArray = calculateSum(numbers);

	        int missingNumber = nNumberSum - sumOfArray;
	        System.out.println(String.format("The missing number is: %s", missingNumber));
		
	}

}
