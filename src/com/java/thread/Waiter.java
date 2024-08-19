package com.java.thread;

import java.util.Date;

public class Waiter implements Runnable {
	
	public Message message;

	public Waiter(Message message){
		this.message = message;
	}
	@Override
	public void run() {
		synchronized (message) {
			try{
				System.out.println(" waiter is waiting for the notifier at "+new Date());
				message.wait();
			}catch(InterruptedException e){
				
			}
		System.out.println("waiting done at "+new Date());
		System.out.println(" waiter received message "+message.getMessage());
			
		}
		
	}
	
	
	


}
