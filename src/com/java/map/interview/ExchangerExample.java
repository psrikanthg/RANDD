package com.java.map.interview;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
 
	 public static void main(String args[]) {
		 
		 Exchanger<String> exchanger = new Exchanger<>();
		 
		 Thread producedThread = new Thread(() ->{
			 
	             try {
					String data = "hello from producer thread";
					 System.out.println("Producer thread is sending: "+data);
					 String receivedData =  exchanger.exchange(data);
					 System.out.println("producer thread received: "+receivedData);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	
		 });
		 
		 Thread consumerThread = new Thread(() -> {
			  
			 try {
				String data ="hello from consumer thread";
				 System.out.println("Consumer thread is sending: "+data);
				 String receivedData = exchanger.exchange(data);
				 System.out.println("Consumer Thread Received: "+receivedData);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 });
		 
		 producedThread.start();
		 consumerThread.start();
		 
		 
	 }
}
