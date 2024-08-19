package com.java.fibo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int i=0, j=1, k=1;
		int num =10;
		System.out.println(i);
		System.out.println(j);
		while(num!=0) {
			
			k = i+j;
			System.out.println(k);
			i =j;
			j=k;
			num--;
		}
		
		System.out.println();
		int isPrime = 39;
		boolean  result = IntStream.range(2, isPrime/2).noneMatch(n ->isPrime%n==0);
		System.out.println(result);
		
		int isPalindrom  = 121;
		int pResult =  IntStream.iterate(isPalindrom, l-> l!=0, l->l/10).map(n -> n%10).reduce(0, (a, b)-> a*10+b);
		System.out.println(pResult);
		
		int isArmStrong =  153;
		int len = String.valueOf(isArmStrong).length();
		int result1 = IntStream.iterate(isArmStrong, b ->b!=0, b ->b/10).limit(len).map(n -> (int)Math.pow(n%10, len)).sum();
		System.out.println(result1);
		
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
		
		System.out.println();
		int fact =5;
		int factTotal = IntStream.rangeClosed(1, fact).reduce(1, (a, b) -> a*b);
		System.out.println(factTotal);
		
		
		String mam = "ROTATOR";
		
	    boolean isPalString =    IntStream.range(0, mam.length()/2).noneMatch(s ->mam.charAt(s) !=mam.charAt(mam.length()-1-s));
		System.out.println(isPalString);
	}

}
