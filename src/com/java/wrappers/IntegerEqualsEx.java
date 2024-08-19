package com.java.wrappers;

public class IntegerEqualsEx {
	
	/**
	 * @param args
	 */
	public static void main(String ...args){
		Integer integer =1000; //range -128 to 127
		Integer integer2 = 1000;
		
		Integer n1 =5;
		Integer n2 =5;
		
		if(n1 !=n2) {
			System.out.println("Referring two same object");
		}
		
		if(integer != integer2){
			
			System.out.println("referring same object ");
		}
		
		if(integer == integer2){
			System.out.println(" values are smae bye ==");
		}
		
		if(integer.equals(integer2)){
			System.out.println(" values are smae by equal ");
		}
			
			System.out.println(" values are equall by compareTo method"+integer.compareTo(integer2));
		
		
		
	}

}
