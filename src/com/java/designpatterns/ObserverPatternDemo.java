package com.java.designpatterns;
/* Observer pattern is used when there is one to many relationship between objects
 * such that if one object is modified, its dependent objects are to be notified automatically
 * Observer pattern falls under Behavior pattern.
 * 
 * 
 */
public class ObserverPatternDemo {
	
	public static void main(String args[]) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new HexaObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
