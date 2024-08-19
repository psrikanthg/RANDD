package com.java.sorting;

/*
 * select sort algorithm examples 
 * 
 * In selection sort, the smallest value among the unsorted elements of 
 * the array is selected in every pass and inserted to its appropriate position into the array
 * 
 */
public class SelectionSort {
	
	/**
	 * 
	 */
		public static void main(String args[]){
			
			
	
		
		int arr[] = {3, 2, 5, 6, 7};
		
		//2 3 5, 6, 7
		
		int count = arr.length;
		
		System.out.println("UnSorted Array");
		for(int l=0; l<count; l++){
			
			System.out.printf("%d", arr[l]);
			
		}
		
		for(int i =0; i<count; i++){
			int min = i;
			for(int j=i+1; j<count; j++)
			{
				if(arr[j] < arr[min]){
					
					min = j;
				}
				
			}
			
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println("sorted order is ");
		
		for(int k=0; k<count; k++){
			System.out.printf("%d", arr[k]);
		}
	}
		
	

}
