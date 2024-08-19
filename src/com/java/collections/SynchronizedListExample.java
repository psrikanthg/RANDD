package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;



public class SynchronizedListExample {
	
	static Random r = new Random();
	
  public static void main(String args[]) {
	  ArrayList<String> list = new ArrayList<String>();
	  
	  list.add("JAVA");
      
      list.add("STRUTS");
       
      list.add("JSP");
       
      list.add("SERVLETS");
       
      list.add("JSF");
      
      ArrayList<Integer> listNotThread = new ArrayList<>();
      
      Runnable r2 = ()->{
    	  while(listNotThread.size()<100) {
    		  listNotThread.add(r.nextInt(50));
    		  System.out.println("Thread Name: "+Thread.currentThread().getName());
    		  System.out.println(listNotThread);
    	  }
      };
      
      //ArrayList is not thread safe example, throws error at some point of time.
      //java.util.concurrentModificationExcepiton
      new Thread(r2, "t1").start();
      new Thread(r2, "t2").start();
      new Thread(r2, "t3").start();
      
     
      CopyOnWriteArrayList<Integer> numList = new CopyOnWriteArrayList<>();
      
      Runnable r1 = ()->{
    	  
    	  while(numList.size()<10) {
    		  numList.add(r.nextInt(50));
    		  System.out.println("Thread Name: "+Thread.currentThread().getName());
    		  System.out.println(numList);
    	  }
      };
	  //benefiting multi threading concenpt on copyonwriteArrayList
      new Thread(r1, "t1").start();
      new Thread(r1, "t2").start();
      new Thread(r1, "t3").start();
     
      
  }

}
