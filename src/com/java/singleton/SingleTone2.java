package com.java.singleton;

public class SingleTone2 {
	
	private static SingleTone2 singleTone2;
	
	private SingleTone2() {
		
	}
	
	
	public static SingleTone2  getInstance() {
		
		if(singleTone2 ==null) {
			synchronized (SingleTone2.class) {
				if(singleTone2 ==null) {
					singleTone2 =new SingleTone2();
				}
			}
		}
		
		return singleTone2;
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
	}

}
