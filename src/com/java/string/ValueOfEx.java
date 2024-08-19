package com.java.string;
/* 
 * we have 9 overloadded methods inside the string class
 * 
 * public static String valueOf(boolean b)
 * public static String valueOf(char c)
 * public static String valueOf(Char []c)
 * public static String valueof(Char[] data, int offSet, int count)
 * public static String valueOf(int i)
 * public Static String valueOf(long l)
 * public static String valueOf(float f)
 * public static String valueOf(double d)
 * public static String valueOf(Object ob)
 * 
 * 
 */

public class ValueOfEx {
	
	public static void main(String... args){
		
		String s = null;
		String s1 = s.valueOf("srikanth");
		System.err.println(" value of s1 is "+s1);
		
		String s2 = s.valueOf("True");
		System.out.println(" value of s2 is "+s2);
		
		String s3 = new String().valueOf(new Integer("12345")); //we can pass object type..
		
		System.out.println(" value of s3 is "+s3);
	    
		
		String s4 = new String().valueOf(new Integer(8686));
		
		System.out.println(" value of s4 is "+s4);
		
		boolean b = false;
		System.out.println(String.valueOf(b));
		
		char cr =65;
		System.out.println("The value of char is "+String.valueOf(cr));
		
		byte bs =12;
		System.out.println("The byte value is "+String.valueOf(bs));
		
		short st =14;
		
		System.out.println("The short value is "+String.valueOf(st));
		
		int abc[] ={1, 23, 4};
		System.out.println("The integer array is "+String.valueOf(abc));
		
		float f =32.3333f;
		System.out.println("The float value is "+String.valueOf(f));
		
		double  dble = 12.1234578d;
		System.out.println(" The double value is "+String.valueOf(dble));
		
		char[] arry ={65, 66, 67, 68};
		
		System.out.println("the char array is "+String.valueOf(arry));
		
		System.out.println(" new inter valie is "+new Integer(null));
		
	}
	


}
