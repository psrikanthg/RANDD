package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	
	private List<Pack> pack = new ArrayList<>();
	
	public void add(Pack pack1) {
		pack.add(pack1);
	}
	
	public void showPrice() {
		for(Pack p: pack) {
			System.out.println(" Price: "+p.price());
		}
	}
	
	public void showItems() {
		for(Pack p: pack) {
			System.out.println(" CD Price: "+p.price());
			System.out.println(" CD Name: "+p.pack());
		}
	}

}
