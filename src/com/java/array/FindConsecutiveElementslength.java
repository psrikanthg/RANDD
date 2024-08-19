package com.java.array;

import java.util.HashSet;

public class FindConsecutiveElementslength {
	
	public  static int findLength(int arr[], int n){
		
		int ans=0;
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0; i<n; i++)
			hashSet.add(arr[i]);
		
		for(int i=0; i<n; i++){
			
			if(!hashSet.contains(arr[i]-1)){
				
				int j= arr[i];
				while(hashSet.contains(j))
					j++;
				
				if(ans<j-arr[i])
					ans=j-arr[i];
				
			}
		}
		return ans;
		
	}
	
	
	
	public static void main(String args[]){
		
		int arr[] = {1, 9, 0, 20,2,  3, 4, 5};
		
		int n = arr.length;
		System.out.println("1, 2, 3, 4, 5 is "+findLength(arr, n));
		
		
	}

}
