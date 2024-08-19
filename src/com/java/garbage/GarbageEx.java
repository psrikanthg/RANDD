package com.java.garbage;

/*
 * HEAP
 * 1000x: GarbageExobj: name(2000x) , i 30
 * 2000x: srikanth
 * 3000x: GarabageExOb: name(4000x), i 50
 * 4000x: ABC
 * 
 * 
 * STACK:
 * starts from main method
 * args  null
 * ex: 1000x
 * M1_Stack
 * es: 1000X
 * es : 3000X
 *  clears M1_Stack once the method over
 * 
 */
public class GarbageEx {
	
	private String name;
	private int i;
	
	public GarbageEx(String name, int i){
		this.name = name;
		this.i = i;
	}
	
	public void setId(int i){
		
		this.i = i;
		
	}
	public int getId(){
		return i;
	}
	
	public static final void main(String args[]){
		
		GarbageEx  ex = new GarbageEx("Srikanth", 20);
		m1(ex);
		System.out.println("The value of i is "+ex.getId());
	}
	
	public static void m1(GarbageEx es){
		es.setId(30);
		es = new GarbageEx("ABC", 25); //this object eligible to GC
		es.setId(50);
		
	}

}
