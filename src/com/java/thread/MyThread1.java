package com.java.thread;

public class MyThread1 extends Thread {
  Table t1;
  
  public MyThread1(Table t1) {
	this.t1 =t1;
   }
  
  @Override
  public void run() {
	  t1.printTable(5);
  }
	
	
}
