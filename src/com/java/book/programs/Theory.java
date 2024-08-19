package com.java.book.programs;

public class Theory {
	
	public static void main(String args[]) {
		
		//what is output
		byte[][] ba = {{1, 2, 3, 4}, {1, 2, 3}};
		System.out.println(ba[1].length+" "+ba.length);
		
		
		String[] str = new String[3]; //String array have to use length
		System.out.println(str.length);
		
		String strLe ="srikanth"; //for String, have to use Length
		System.out.println(strLe.length());
		
		String x= "big surprise";
		System.out.println(x.toString());
		
		
		String y ="0123456789";
		System.out.println(y.substring(5)); //56789
		System.out.println(y.substring(5, 8)); //567
		
		//what is output here
		int[][] a = {{1, 2}, {3,4}};
		int []b =(int[])a[1];
		Object o1=a;
		int[][] a2=(int[][])o1;
		int[] b2=(int[])o1; //here o1 is array of array try to cast to array, it throws run time error, classcast exception
		System.out.println(b[1]);
		
		
	}

}
