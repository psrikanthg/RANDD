package com.java.thread;

public class ThreadDemo {
	
	public static void main(String ...args){
		
		Message message = new Message("Hello World!!!!");
		
		Waiter waiter = new Waiter(message);
		Thread waiterMessage = new Thread(waiter, "Waier Thread");
		waiterMessage.start();
		
		Notifier notifier = new Notifier(message);
		
		Thread notifierThread = new Thread(notifier, "notiifer Thread");
		notifierThread.start();
		
	}

}
