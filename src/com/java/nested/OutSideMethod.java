package com.java.nested;

public class OutSideMethod {
	static float a[];
	static float b;
	public void show(){
		
		System.out.println("Hello..");
	}
	
	class OutSide{
		
		private int a;
		public String name;
		int b;
		
		public void show(){
			
			System.out.println(a+"  "+name+"    "+b);
		}
		
		
		
		
	}
	
	static class StaticNested{
		
		public void show(){
			// Cannot make a static reference to the non-
			/* static field b
				- Cannot make a static reference to the non-
				 static field a*/
			System.out.println(a+" srikanth "+b);
			
			
		}
		
		public static void display(){
			
			
		}
	}
	
	
	public static void main(String ...args){
		
	/*	OutSideMethod method = new OutSideMethod();
		OutSideMethod.OutSide out = method.new OutSide();
		out.show();*/
		
		OutSideMethod.StaticNested nested = new OutSideMethod.StaticNested();
		nested.show();
	}

}
