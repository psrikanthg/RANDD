package com.java.singleton;

public class SingleTone1 {
	
     private static SingleTone1 singleTone1;
     
     private SingleTone1() {
    	 
     }
     
     public SingleTone1 getInstance() {
    	 
    	 if(singleTone1 ==null) {
    		 synchronized (SingleTone1.class) {
				if(singleTone1 ==null) {
					singleTone1 = new SingleTone1();
				}
			}
    	 }
    	 
    	 return singleTone1;
     }
	
	public static void main(String args[]) {
		
		
	}

}
