package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	
	private int id;
	private String name;
	private String degree;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	public static void main(String args[]) {
		
		List<ComparatorEx> ex = new ArrayList<>();
		ComparatorEx ex1= new ComparatorEx();
		ex1.setId(100);;
		ex1.setName("Sreekanth");
		ex1.setDegree("Bsc");
		
		ComparatorEx ex2= new ComparatorEx();
		ex2.setId(50);;
		ex2.setName("Bhavai");
		ex2.setDegree("Mtech");
		
		ComparatorEx ex3= new ComparatorEx();
		ex3.setId(200);;
		ex3.setName("Anju");
		ex3.setDegree("Bsc");
		
		ComparatorEx ex4= new ComparatorEx();
		ex4.setId(400);;
		ex4.setName("Tapas");
		ex4.setDegree("Second");
		
		ComparatorEx ex5= new ComparatorEx();
		ex5.setId(300);;
		ex5.setName("Tarush");
		ex5.setDegree("NoSchool");
		
		ex.add(ex1);
		ex.add(ex2);
		ex.add(ex3);
		ex.add(ex4);
		ex.add(ex5);
		
		ex.forEach(n -> System.out.println(n.getId()+"  "+n.getDegree()+"  "+n.getName()));
		
		Collections.sort(ex, new Comparator<ComparatorEx>() {

			@Override
			public int compare(ComparatorEx arg0, ComparatorEx arg1) {
				if(arg0.getId() == arg1.getId()) {
					return 0;
				}
				if(arg0.getId() < arg1.getId()) {
					return 1;
				}
				if(arg0.getId() > arg1.getId()) {
					return -1;
				}
				
				return 0;
			}
			
		});
		
		System.out.println("After Sorting:::");
		
		ex.forEach(n -> System.out.println(n.getId()+"  "+n.getDegree()+"  "+n.getName()));
	}

}
