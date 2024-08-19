package com.java.thread;

import java.util.Date;

public class Notifier implements Runnable {

	 public Message message;
	 
	 public Notifier(Message message){
		 this.message = message;
	 }
	@Override
	public void run(){
		
		System.out.println(" notifier is sleeping for 5 seconds");
		try{
			
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
			
		}
		synchronized(message){
			
			message.setMessage(" notifer took 5 seconds ");
			System.out.println(" notifier is notifying a waiting thread to wake up"+new Date());
			message.notify();
		}
	}
}
