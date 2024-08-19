package com.java.thread;

public class Thread1 extends Thread{

	public Thread1(){
		//we can not declare constructor as synchronized, if we want we can implement synchronized block
		synchronized (Thread1.class) {
			System.out.println(" Hello..."+getName());
		}
	}
	
	public static void main(String... args){
		
		Thread t1 =  new Thread1();
		Thread t = new Thread(t1);
		System.out.println(" Before starting thread "+t1.getState());
		
		t1.start();
		System.out.println(" after starting thread "+t1.getState());
		
		try {
			t1.join(); // join means wait until current thread die
		} catch (InterruptedException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		System.out.println(" after calling Join thread "+t1.getState());
		
		Runnable runnable = new Thread1();
		
		Thread thread1  = new Thread(runnable);
		
		thread1.start();
		
		
		
	 }
}



