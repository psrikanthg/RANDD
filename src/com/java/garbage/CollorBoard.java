package com.java.garbage;

import java.util.HashMap;

public class CollorBoard {
	int x, y;
	public CollorBoard(){
		this.x=0;
		this.y=9;
	}
	public CollorBoard go(CollorBoard c){
		 c= null;
		return c;
	}
	
	public static void main(String args[]){
		
		CollorBoard ck = new CollorBoard();
		CollorBoard cd = new CollorBoard();
		CollorBoard c3 = ck.go(cd);
		System.out.println("OUt println");
		HashMap<String, String> d = new HashMap<String, String>();
		System.out.println(d.get("srikanth"));
	}

}
