package com.java.singleton;

public enum EnumSingleTon {
	   INSTANCE;
	
	public String getConfiguration(){
		return "asasdf";
	}
	
	public static EnumSingleTon getInstance() {
		return INSTANCE;
	}
	
	public static void main(String args[]) {
		
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.hashCode());
		}).start();
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.getConfiguration());
		}).start();
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.getConfiguration());
		}).start();
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.getConfiguration());
		}).start();
		
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.getConfiguration());
		}).start();
		
		new Thread(() ->{
			EnumSingleTon obj = EnumSingleTon.getInstance();
			System.out.println(obj.getConfiguration());
		}).start();
		
		
	}
}

