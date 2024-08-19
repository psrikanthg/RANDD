package com.scjp.mock.test;

import java.util.Arrays;

public class RemoveDuplicateElementsInArray {
	
	public static void main(String args[]){
		
		String strArra[] = new String[4];
		
		for(String str: strArra){
			
			System.out.println(str);
		}
		
		int arr[] = {1,2 ,4, 6, 2, 9};
		
		Arrays.sort(arr);
		//1, 2, 2, 4, 6, 9
		// result 1 , 0, 0, 0, 0, 0
		//result [1, 2, 0, 0, 0, 0]
		
		int result[] = new int[arr.length];
		
		int previous = arr[0];
		result[0] = previous;
		
		for(int i=1; i<arr.length; i++){
			int ch =  arr[i];
			if(previous != ch){
				
				result[i] = ch;
			}
			
			
			previous = ch;
		}
		
		for(int k=0; k<result.length; k++){
			System.out.println(result[k]);
		}
		
	}

}
