package com.java.abstractex;

public strictfp abstract class AbstracConstruct {
	
	public static int hight, widht;
	public static final int a=10;
	transient int c;
	
	int d;
	public int e;
	private int f;
	protected int g;
	
	final String name ="srikanth";
	static String lastName;
	public final static String gendar="male";
	volatile int h;
	//strictfp float i; // strictfp can not be applied to variables.
	//strictf can be applied to classes and methods
	public AbstracConstruct(){
		this.hight =20;
		this.widht =20;
		
	}
	
	public strictfp void d3(){
		
	}
	public static final void show2(){
		
	}
	public native void show3();
	
	public synchronized void show4(){
		
	}
	
	abstract void display();
	
	abstract void display(int a);
	
	abstract void display(String a);
	
	abstract void display(float b);
	
	
	public abstract void show();

}
