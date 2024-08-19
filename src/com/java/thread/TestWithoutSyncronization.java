package com.java.thread;

public class TestWithoutSyncronization {
	
	public static void main(String args[]) {
		Table t1 = new Table();
		MyThread1 thread1 = new MyThread1(t1);
		MyThread2 thread2= new MyThread2(t1);
		
		thread1.start();
		thread2.start(); //OUT PUT DIFFERENT
	}

}
