package com.java.test;

public class SwtichExample {

	
	public static void main(String args[]) {
		
		
		String str =null;
		switchExample(str);
	}
	
	public  static void switchExample(String partnerId) {
		
		switch(partnerId){
		case "DOG":
		case "CAT":
			System.out.println("CAT");
			break;
		default:
			 System.out.println("default working");
		}
	}
}
