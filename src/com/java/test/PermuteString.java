package com.java.test;

public class PermuteString {
	
	public static void main(String args[]) {
		String str = "ABC";
		int len = str.length();
		int i =0;
		System.out.println("All permutations:::");
		generatePermute(str, i, len);
		
	}
	
	public static String swapString(String a, int i, int j) {
		char ch;
		char chr[] = a.toCharArray();
		ch =chr[i];
		chr[i] = chr[j];
		chr[j] = ch;
		
		return String.valueOf(chr);
		
		
	}
	
	public static void generatePermute(String a, int start, int end) {
		
		if(start == end-1) {
			System.out.println(a);
		}else {
			for(int i=start; i<end;i++) {
				
				a = swapString(a, start, i);
				generatePermute(a, start+1, end);
				a = swapString(a, start, i);
			}
		}
	}

}
