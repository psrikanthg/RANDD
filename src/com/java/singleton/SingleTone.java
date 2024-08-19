package com.java.singleton;

public class SingleTone {
	private static SingleTone singleTone = null;
	
	private SingleTone(){
		
		System.out.println("creating object..");
	}

	 static SingleTone getInstance(){
		 
		 return SingleTone.Holder.singleTone;
	 }
	 
	 static class Holder{
		 
		 static final SingleTone singleTone = new SingleTone();
	 }
}
