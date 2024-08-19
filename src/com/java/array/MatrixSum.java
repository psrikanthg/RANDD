package com.java.array;
import static java.lang.System.out;

import java.util.Arrays;


public class MatrixSum {
	
	public static void main(String ...args){
		
		int a[][] = new int[5][5];
		
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				a[i][j] =j;
				
			}
		}
		
		for(int d[]:a){
			for(int e: d){
				out.print(e);
			}
		}
		int result =0;
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				
				 if(i==j)
					 result+=a[i][j];
			}
			
		}
		
		out.println(result);
		
		int ar[] = {20, 45};
		
		System.out.println(Arrays.toString(ar));
	}
  
}

