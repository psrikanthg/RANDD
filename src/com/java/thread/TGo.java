package com.java.thread;

public class TGo implements Runnable {
	
	
	@Override
	public void run(){
		
		try{
			while(true){
				Thread.sleep(1000);
				System.out.println(" looping a while");
				Thread.yield();
			}
		}catch(InterruptedException e){
			
			
		}
		
	}
	
	public static void main(String ...args) throws InterruptedException{
		
		TGo t = new TGo();
		Thread thread = new Thread(t);
		thread.start();
		thread.join();
	}

}
