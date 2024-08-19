package com.java.test;

public class StringTest {
	
	public static void main(String args[]) {
		String s1=  new String("digitalocean");
		String s2 = new String("DIGITALOCEAN");
		System.out.println(s1=s2);
		
		String s11 = new String("abc");
		String s22 = new String("abc");
		String s3 = s11;
		System.out.println(s11 == s22);
		System.out.println(s3 == s11);
		
		
		String s12 = "abc";
		StringBuffer s21= new StringBuffer(s12);
		System.out.println("using equals method");
		System.out.println(s12.equals(s21));
		System.out.println("using content Equals ");
		System.out.println(s12.contentEquals(s21));
		
		System.out.println("intern example");
		String s13 = "abc";
		String s23 = new String("abc");
		s23.intern();
		System.out.println(s13 == s23);
		
		
		
	}

}
