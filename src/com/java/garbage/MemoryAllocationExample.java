package com.java.garbage;

import java.util.ArrayList;
import java.util.List;

public class MemoryAllocationExample {
	
	public static void main(String args[]) {
		
		//objects allocation in Eden space(Young Generation)
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		System.gc();
		
		// Long-lived objects may be moved to Old Generation
        List<Object> longLivedObjects = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            longLivedObjects.add(new Object());
        }
	}

}
