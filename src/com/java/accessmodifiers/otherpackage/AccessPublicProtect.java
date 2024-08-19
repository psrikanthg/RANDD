package com.java.accessmodifiers.otherpackage;

import com.java.accessmodifiers.AccessModifierExample;

public class AccessPublicProtect extends AccessModifierExample {
	
	public static void main(String args[]) {
		AccessModifierExample acc = new AccessModifierExample();
		System.out.println(acc.c); //only public access modifier available in other package
		//if we want to access protected modifier, we need to extend that class
		
		AccessPublicProtect accessProjected = new AccessPublicProtect();
		System.out.println(accessProjected.c);
		System.out.println(accessProjected.d);//we able to access protected modifier by extending that class
	}

}
