package com.scjp.mock.test;

public class MethodOverloadingWithByte {
	
	public static void printvalue(int a, int b, int c){
		
		System.out.println("int ");
	}
	
	public static void printvalue(byte ...a){
		
		System.out.println("byte");
	}
	
/*	Primitive widening uses the smallest method argument possible. (For Example if you
			pass short value to a method but method with short argument is not available then
			compiler choose method with int argument). But in this case compiler will prefer the
			older style before it chooses the newer style, to keep existing code more robust. var-args
			method is looser than widen. */
	
	public static void main(String args[]){
		byte  a=8;
		printvalue(a, a, a);
	}

}
