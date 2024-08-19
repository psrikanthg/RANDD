package com.java.thread;
public class JoinExam implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new JoinExam());
        a.start();
        a.join(); //terminate the threads
        System.out.print("Begin");
        System.out.print("End");
        System.out.println("Max: "+Math.max(10, 30));
    }
    
    public void run() {
        System.out.print("Run");
    }
}