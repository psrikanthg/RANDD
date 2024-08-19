package com.java.singleton;

public class MultiThreadSingleTone {
	
	private static MultiThreadSingleTone myInstance;
	
	
	private MultiThreadSingleTone() {
		
	}
	
	public static MultiThreadSingleTone getInstance() {
		
		if(myInstance ==null) {
			synchronized (MultiThreadSingleTone.class) {
				if(myInstance ==null) {
					myInstance = new MultiThreadSingleTone();
				}
			}
		}
		
		return myInstance;
		
	}
	
	public static void main(String args[]) {
		/*
		 * MultiThreadSingleTone instance = MultiThreadSingleTone.getInstance();
		 * System.out.println(instance);
		 * 
		 * MultiThreadSingleTone instance1 = MultiThreadSingleTone.getInstance();
		 * System.out.println(instance1);
		 * 
		 * MultiThreadSingleTone instance2 = MultiThreadSingleTone.getInstance();
		 * System.out.println(instance2);
		 */
		
		new Thread(() ->{
			MultiThreadSingleTone instance3 = MultiThreadSingleTone.getInstance();
			System.out.println(instance3);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance4 = MultiThreadSingleTone.getInstance();
			System.out.println(instance4);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance3 = MultiThreadSingleTone.getInstance();
			System.out.println(instance3);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance4 = MultiThreadSingleTone.getInstance();
			System.out.println(instance4);
		}).start();
		
		
		new Thread(() ->{
			MultiThreadSingleTone instance3 = MultiThreadSingleTone.getInstance();
			System.out.println(instance3);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance4 = MultiThreadSingleTone.getInstance();
			System.out.println(instance4);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance5 = MultiThreadSingleTone.getInstance();
			System.out.println(instance5);
		}).start();
		
		new Thread(() ->{
			MultiThreadSingleTone instance6 = MultiThreadSingleTone.getInstance();
			System.out.println(instance6);
		}).start();
	}

}
