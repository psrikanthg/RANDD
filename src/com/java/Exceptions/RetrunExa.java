package com.java.Exceptions;
import static java.lang.System.out;

public class RetrunExa {
	 int array[];
	public void doConfue(Object ob){
		System.out.println("boj");
	}
	//array is also object type, null is int[] array type
	public void doConfue(int[] arra){
		int b[] = new int[5];
		System.out.println("double array ->>"+arra+" "+b);
	}
	
	
	public static void main(String args[]){
		
		 out.println( new RetrunExa().array); //as array type is object, it prints null
		 new RetrunExa().doConfue(null); //it calls array type
		System.out.println(doStaff());
	}
	
	static boolean doStaff(){
		
		try{
			return true;
		}finally{
			return false;
		}
	}

}
