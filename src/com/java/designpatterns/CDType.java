package com.java.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class CDType {

	 List<Packing> items = new ArrayList<>();
	 
	 public void addItem(Packing packs) {
		 items.add(packs);
	 }
	 
	 public void getCost() {
		 items.forEach(p -> System.out.println(p.price()));
	 }
	 
	 public void showItems() {
		 items.forEach(p -> System.out.println("CD Name: "+p.pack()+" , Price:  "+p.price()));
	 }
}
