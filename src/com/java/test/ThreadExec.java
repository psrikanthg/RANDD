package com.java.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExec {
	
	public static void main(String args[]) {
		ExecutorService exec = Executors.newFixedThreadPool(1);
		
		Runnable task1 = () -> {
            System.out.println("Task 1 is executing...");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 is executing...");
        };
        
        Runnable task3 = ()->{
        	System.out.println("Task 3 is executing...");
        };

        exec.submit(task1);
        exec.submit(task2);
        exec.submit(task3);

        exec.shutdown();
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> System.out.println("Task executing in thread: " + Thread.currentThread().getName()));
        }
        
        executorService.shutdown();
        
		
	}

}
