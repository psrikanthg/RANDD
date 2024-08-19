package com.java.test;

import java.util.Arrays;
import java.util.List;

public class ArrayLongestStringLength {
	
	public int height;
	public int width;
	
	public String toString(){
		
		return String.valueOf(height);
	}
	
	public static void main(String args[]) {
		ArrayLongestStringLength cc = new ArrayLongestStringLength();
		System.out.println(cc);
		
		String str[] = new String[] {"potato", "kayak"};	
		ArrayLongestStringLength so = new ArrayLongestStringLength();
		
 		System.out.println(so.solution(str));
		
			
			
	}
	
	public int solution(String str[]) {
		int length =0;
		char duplicate[] = new char[100];
		List<String> list = Arrays.asList(str);
		for(int i=0; i<list.size(); i++) {
			String str1= str[i];
			
			for(int j=0; j<str1.length(); j++) {
				
				duplicate[j]+= str1.charAt(j);
				
				if(str1.charAt(j)==duplicate[j]) {
					length =0;
				}
				else {
					
				}
			}
		}
		
		return duplicate.length;
	}

}
