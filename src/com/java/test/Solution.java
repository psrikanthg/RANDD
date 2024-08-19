package com.java.test;
import java.util.Arrays;
//write a program to rotate array elements to left
public class Solution {
	
	public int[] solution(int arra[], int n) {
		
		for(int i =0; i<n; i++) {
			
			int last =  arra[arra.length-1];
			for(int j=arra.length-1; j>0; j--) {
				arra[j] = arra[j-1];
			}
			arra[0] =  last;
		}
		
		return arra;
	}
	
	public static void main(String args[]) {
		//rotate array elements right side
		int arr[] =  new int[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(arr, 2)));
		
	}

}
