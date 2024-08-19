package com.java.test;

public class ThreadClass {
	
	public static void main(String args[]) {
		
		Runnable r = ()->{
			System.out.println("Hello Runnable Thread");
		};
		
		Thread t  = new Thread(r);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}

}
