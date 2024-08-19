package com.java.collections;

import java.util.Arrays;

public class HashTest  {
	
	 static void show(){
		 
	 }
	 static void show(int a){
		 
	 }
	 public static void display(Long l){
		 System.out.println("Long..."+l);
	 }
	 
	 public static void display(Short s){
		 System.out.println("Short..."+s);
	 }
	 
	 public static void display(int i){
		 System.out.println("int.."+i);		 
	 }
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
    	
        HashTest h1 = new HashTest("2");        
        String s1 = new String("1");        
        Integer integer = new Integer(1)+new Integer(2);
        short s=10; //cast to int
        long l=20; //cast to long
        
        display(s);
        display(l);
        
        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;
        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}