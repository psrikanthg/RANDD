package com.java.test;

import java.util.Arrays;

public class DisappearingPairs {
	
	public static void main(String args[]) {
		DisappearingPairs ds = new DisappearingPairs();
	    System.out.println(ds.solution("ACCAABBC"));
	    
	    int arr[] = new int[] {3,60,35,2,45,320,5};
	    //find duplicate array elements uinsg two loops
	    for(int i=0; i<arr.length-1; i++) {
	    	for(int j=0; j<i; j++) {
	    		if(arr[j] ==arr[i]) {
	    			System.out.println(arr[i]);
	    		}
	    	}
	    }
	    
	    //write a bubble sort program
	    int n = arr.length;
	    int temp=0;
	    
	    	for(int i=0; i<n; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arr[j]> arr[i]) {
					temp = arr[j];
					arr[j]= arr[i];
					arr[i] =temp;
				}
			}
		}
	    
	    System.out.println("After sorting arrays: "+Arrays.toString(arr));
	    
	    
	    
	}
	
	public String solution(String s) {
		StringBuffer buffer = new StringBuffer();
		for(char ch: s.toCharArray()) {
			int size = buffer.length();
			if(size > 0 && buffer.charAt(size -1)==ch) {
				buffer.deleteCharAt(size -1);
			}else {
				buffer.append(ch);
			}
		}
		
		return buffer.toString();
	}

}
