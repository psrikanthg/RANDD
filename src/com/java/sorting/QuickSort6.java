package com.java.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QuickSort6 {
	
	public static void main(String args[]) {
		int arr[] = {6, 5, 4, 3, 1, 7, 8, 9};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		int fact =5;
		
		int totalFact = IntStream.rangeClosed(1, 5).reduce(1, (a, b) -> a*b);
		System.out.println(totalFact);
		
		int isPalindrom =  121;
		int pal  = IntStream.iterate(isPalindrom, i ->i!=0, i -> i/10).map(n -> n%10).reduce(0,  (a, b) -> a*10+b);
		System.out.println("is Palindrom Number: "+pal);
		
		int isArm =  153;
		int len = String.valueOf(isArm).length();
		int arm =  IntStream.iterate(isArm, i -> i!=0, i -> i/10).limit(len).map(n -> (int)Math.pow(n%10, len)).sum();
		System.out.println(arm);
		//write a program to print finbobacci series
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f ->f[0]).forEach(System.out::println);
		
		
		
		
	}
	
	public static void quickSort(int arr[], int left, int right) {
		
		int index = partition(arr, left, right);
		
		if(left < index -1)
			quickSort(arr, left, index -1);
		
		if(index <right)
			quickSort(arr, index, right);
	}
	
	public static int partition(int arr[], int left, int right) {
		
		int pivot = arr[(left+right)/2];
		
		while(left <= right) {
			
			while(arr[left] <pivot)
				left++;
			
			while(arr[right] > pivot)
				right--;
			
			if(left <= right) {
				
				int temp = arr[left];
				arr[left] =  arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		return left;
		
	}

}
