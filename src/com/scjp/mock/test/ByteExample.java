package com.scjp.mock.test;

public class ByteExample {
	
	public static void main(String args[]){
		
		byte b =6;
		b+=8;
		System.out.println(b);
		b =b+7; // int or smaller expressions always resulting in an int, so compiler complain about type: can 
		//not covert int to byt type for b =b+7; but b+=7; //no problem becuase +=, -=, *= and /= will put 
		//an implicit cast. b+=7  is same as b=(byte)b+7; so compiler not complain
		System.out.println(b);
	}

}
