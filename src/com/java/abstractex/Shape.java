package com.java.abstractex;

public class Shape extends  AbstracConstruct{

	
	
	public static void main(String args[]){
		
		AbstracConstruct ab = new Shape();
		System.out.println(ab.hight+" "+ab.widht);
		
		ab.hight =50;
		System.out.println(ab.hight);
	}

	@Override
	public void show() throws NullPointerException{
		
	}
}
