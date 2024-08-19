package com.java.thread;

public class MyThread2 extends Thread {

	
	Table t1;
	
	public MyThread2(Table t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		
		t1.printTable(100);
	}
}
