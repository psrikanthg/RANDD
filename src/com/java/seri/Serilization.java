package com.java.seri;
import static java.lang.System.out;

import com.java.nested.OutSideMethod;


/**
 * @author p7164686
 *
 */
public class Serilization implements java.io.Serializable{

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 9204174275734100108L;
	
	
	public transient static String name;
	
	int d;

	public Serilization(String name){
		this.name = name;
	}
	public void show(){
		out.println(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Serilization.name = name;
	}
	
	public String toString(){
		return "Name is "+name;
	}
	
	public static void main(String args[]) throws java.io.IOException,  java.lang.ClassNotFoundException{
		
		Serilization serilization = new Serilization("Srikanth");
		
		out.println("Before Serializble "+serilization);
		serilization.d =20;
		java.io.ObjectOutputStream ops = new java.io.ObjectOutputStream(new java.io.FileOutputStream("Employee.ser"));
		ops.writeObject(serilization);
		serilization.setName("Bubby");
		serilization.d=30;
		ops.close();
		java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("Employee.ser"));
		serilization = null;
		serilization =  (Serilization)ois.readObject();
		ois.close();
		
		out.println("after serialization  "+serilization+" "+serilization.d);
	}

	  
}
