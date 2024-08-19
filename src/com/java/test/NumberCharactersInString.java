package com.java.test;

public class NumberCharactersInString {
	
	public static void main(String args[]) {
		String str = "This ! ? is my ' %^ #first String";
		int count =0;
		int vowles =0;
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) != ' ') {
				//count++;
			}
			

			if (str.substring(i, i+1).matches("[^A-Za-z0-9 ]")) {
				count++;
				}
		
			if (str.substring(i, i+1).matches("[aeiouAEIOU ]")) {
				vowles++;
				}
			
		}
		
		System.out.println(count+" "+str.length()+" "+vowles);
		
	}

}
