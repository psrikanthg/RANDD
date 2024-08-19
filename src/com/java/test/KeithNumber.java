package com.java.test;

import java.util.ArrayList;
import java.util.Collections;

public class KeithNumber {
	
	public static void main(String args[]) {
		int num =742;
		int temNumber = num;
		ArrayList<Integer> temp = new ArrayList<>();
		int n=0;
		while(temNumber > 0) {
			temp.add(temNumber%10);
			temNumber = temNumber/10;
			n++;
		}
		
		Collections.reverse(temp);
		
		System.out.println("Reverse Number: "+temp+" Number: "+n);
		
		int nextTerm =0, i =n;
		while(nextTerm < num) {
			nextTerm =0;
			for(int j=1; j<=n; j++)
				nextTerm =  nextTerm+temp.get(i-j);
			    temp.add(nextTerm);
			   i++;
		}
			
		if(nextTerm == num) {
			System.out.println("it is keith Number: "+nextTerm+" "+num);
		}
			    
			
		System.out.println("Total Records:: "+temp);		
		
		
		
	}

}
