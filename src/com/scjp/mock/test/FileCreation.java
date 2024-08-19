package com.scjp.mock.test;

import java.io.File;

public class FileCreation {
	
	public static void main(String ...args) throws Exception{
		
		File f1= new File("srikanthtestfile");
		
		System.out.println(f1.exists());
		f1.createNewFile();
		
		System.out.println(f1.exists());
	}
	
	//byte can only hold up to 127. So compiler complain about possible loss of precision. 

}
