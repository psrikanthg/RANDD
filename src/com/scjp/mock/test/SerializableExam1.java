package com.scjp.mock.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExam1 extends SerializableExam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SerializableExam1(){
		System.out.println(" SerializableExam1 ..");
	}
	
	public static void main(String... args) throws Exception{
		SerializableExam1 exam1 =new SerializableExam1();
		File f1=  new File("datafile");
		exam1.a=30;
		ObjectOutputStream save= new ObjectOutputStream(new FileOutputStream(f1));
		
		save.writeObject(exam1);
		save.flush();
		
		ObjectInputStream read = new ObjectInputStream(new FileInputStream(f1));
		
		SerializableExam1 b = (SerializableExam1)read.readObject();
		System.out.println(b.a);
		//java.io.NotSerializableException
		
	}
	

}
