package com.java.methodPasing;

public class PassByValueRefere {
	
	public static void main(String args[]){
		
		int x =10;
		mulitple(x);
		System.out.println(x);
		
		int arg[] = {10, 20}; //array pass by reference
		changeArray(arg);
		for(int ar: arg){
			
			System.out.println(ar);
		}
	}
	
	public static void mulitple(int y){
		
		y = y*2;
		
	}
	
	public static void changeArray(int arr[]){
		
		arr[0] = 100;
	}

}
