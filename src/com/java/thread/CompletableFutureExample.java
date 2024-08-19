package com.java.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
	
	public static void main(String args[]) {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
		    try {
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    return "Hello, world!";
		});

		future.thenAccept(result -> System.out.println(result));
	}

}
