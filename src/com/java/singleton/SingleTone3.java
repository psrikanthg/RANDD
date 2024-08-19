package com.java.singleton;

public class SingleTone3 {
	
	private static  SingleTone3 singleTone3;
	
	private SingleTone3() {
		
		if (singleTone3 != null) {
            throw new IllegalStateException("Already initialized.");
        }
		
	}
	
	public static SingleTone3 getInstance() {
		if(singleTone3 ==null) {
			
			synchronized (SingleTone3.class) {
				
				if(singleTone3 ==null) {
					singleTone3= new SingleTone3();
				}
				
			}
		}
		
		return singleTone3;
	}
	
	public static void main(String args[]) {
		
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		new Thread(() ->{
			SingleTone3 obj = SingleTone3.getInstance();
			System.out.println(obj);
		}).start();
		
		
		
		
	}

}
