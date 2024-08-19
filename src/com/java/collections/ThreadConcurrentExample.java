package com.java.collections;

import java.util.Map;
import static java.lang.System.out;

public class ThreadConcurrentExample implements Runnable {
	
	java.util.Map<String, String> concurrentMap = new java.util.concurrent.ConcurrentHashMap<String, String>();
	
	
	@Override
	public void run() {
		out.println(" enterd into run method");
		for(int i=0; i<5; i++)
			concurrentMap.put(String.valueOf(i), String.valueOf(i));
		
		
		out.println(concurrentMap.size());
	}

	public void showMap(){
		
		java.util.Iterator<Map.Entry<String, String>> iterator = concurrentMap.entrySet().iterator();
		out.println(concurrentMap.size());
		while(iterator.hasNext()){
			java.util.Map.Entry<String, String> entry =  iterator.next();
			
			out.println(entry.getKey());
		}
	}
	
	public static void main(String ...args) throws InterruptedException{
		
		Thread t1 = new Thread(new ThreadConcurrentExample());
		
		Thread t2 = new Thread(new ThreadConcurrentExample());
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		Thread.sleep(1000);
		new ThreadConcurrentExample().showMap();
		
	}
	
}

