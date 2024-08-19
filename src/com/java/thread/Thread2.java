package com.java.thread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
	System.out.println(" Thread name is "+Thread.currentThread().getName());
		
	}

	  public static void main(String... args){
		  
		  Thread t1=  new Thread(new Thread2());
		  t1.start();
		  
	  }
	
	
}
