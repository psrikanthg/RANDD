package com.scjp.mock.test;

public class WrapperEqualls {
	
	public static void main(String ...args){
		
		Integer i =34;
		int l =34;
		
		if(i.equals(l)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		//For values within the range of -128 to 127, Java uses a cache for Integer objects to optimize memory usage. 
		//When comparing two Integer objects within this range, the “==” operator will 
		//		return true if they have the same value, as they are referring to the same cached object.
		
		//However, for values outside this range, Java creates separate Integer objects for each value.
		//When comparing two Integer objects outside the range of -128 to 127 using the “==” operator, 
		//		it will return false, even if they have the same value. 
		//				This is because they are distinct objects in memory.
		//To compare two Integer values in Java, it is recommended to use the equals() method or the intValue() method of the Integer class.
		
		
		Integer a=128;
		Integer  b=128;
		int min = a.min(10, 20);
		System.out.println(min+" Max Value"+a.MAX_VALUE+" Min Value: "+a.MIN_VALUE);
		
		if(a==b){
			System.out.println("Both are referring same address ==");
		}
		
		if(a!=b){
			System.out.println("Both are different objects..");
		}
		
		//best way to compare two int values are use equal or intValue method
				if(a.intValue() == b.intValue()) {
					System.out.println(" now comparing two intv values");
				}
		
		
		Integer c=127;
		Integer  d=127;
		
		if(c==d) {
			System.out.println("Both are referring same object as it is within range -128 to 127 ==");
		}
		
		
	}

}
