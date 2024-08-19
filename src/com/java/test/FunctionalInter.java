package com.java.test;
public class FunctionalInter implements sayable {

	@Override
	public void say(String msg) {
		System.out.println(msg);
		
	}
	
	public static void main(String args[]) {
		sayable say = new FunctionalInter();
		say.say("welcome to Functional Interface::");
		
		sayable sb = (var s) ->{
			System.out.println("Name is:: "+s);
		};
		
		sb.say("Srikanth");
	}

	
}

@FunctionalInterface
interface sayable{
	void say(String msg);
	
}
