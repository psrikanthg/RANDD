package com.java.sorting;
//A simple comparison-based algorithm that 
//repeatedly steps through the list, compares adjacent elements,
//and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

public class BubbleSort {
	
	public static void main(String args[]){
		
		int arr[] = {5, 3, 2, 6, 9};
		
		int temp;
		boolean fixed = false;
		
		while(fixed==false){
			fixed = true;
			
			for(int i=0; i<arr.length -1; i++){
				
				if(arr[i] > arr[i+1]){
					
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					fixed = false;
				}
				
			}
			
		}
		
		for(int k=0; k<arr.length; k++){
			
			System.out.printf("%d", arr[k]);
		}
	}

}
