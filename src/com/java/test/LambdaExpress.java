package com.java.test;

public class LambdaExpress {
	
	public static void main(String args[]) {
		
		Printable pt =(msg) -> System.out.println(msg);
		pt.print("Welcome to Lambda Expressions ");
		
		Addable ad =(a, b)-> a+b;
		System.out.println(ad.add(10, 20));
		
		Addable add =(int a, int b)-> a+b;
		System.out.println(add.add(20, 30));
		
	}

}


interface Printable{
	
	void print(String msg);
}

interface Addable{
	int add(int a, int b);
}
