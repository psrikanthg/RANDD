package com.java.test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers18 {
	
	public static void main(String args[]) {
		
		//prime numbers are 2, 3, 5, 7, 11, 13, 17, 0 & 1 is not prime numbers
		//The 2 is the only even prime number because all the other even numbers can be divided by 2.
		int  m, i, flag=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scanner.nextInt();
		m =n/2; //need to check prime or not
		
		if(n==1 || n==0) {
			System.out.println("Not a Prime Number "+n);
		}else {
			for(i=2; i<=m; i++) {
				if(n%i==0) {
					System.out.println("Not a prime number");
					flag =1;
					break;
				}
			}
		}
		
		if(flag ==0) {
			System.out.println(n+" is prime number");
		}
		
		//using java 1.8
		System.out.println("isPrime(5): "+isPrime(19));
		
		System.out.println(" 545 is palindrom or not: "+isPalindrom(545));
		
		System.out.println(" 153 is is Armstrong or not: "+isArmStrong(153));
		System.out.println(" 125 is is Armstrong or not: "+isArmStrong(125));
		
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.sqrt(8));
		
		//convert list of strings to int
		List<String> strs = Arrays.asList("1", "2", "3", "4");
		System.out.println("conver string to int");
		 strs.stream().map(Integer::parseInt).forEach(System.out::println);
		 
		 List<String> sortStrg = Arrays.asList("srikanth", "bhavani", "Anjaneyoulu", "Tapas", "Tarush");
		 System.out.println("Sorting strings");
		 sortStrg.stream().sorted().forEach(System.out::println);
		 System.out.println("Sort strings in reverse order");
		 sortStrg.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		
		if(num == 2) {
			return true;
		}
		
		return   IntStream.rangeClosed(2, num/2).noneMatch(i -> num % i == 0);
		
	}
	
	public static int isPalindrom(int num) {
		return IntStream.iterate(num, i-> i!=0, i->i/10).map(n -> n%10).reduce(0, (a, b)->a*10+b);
	}
	
	public static boolean isArmStrong(int num) {
		return num == getArmStrongNumber(num);
	}
	
	public static int getArmStrongNumber(int num) {
		int pow = String.valueOf(num).length();
		return IntStream.iterate(num, i->i!=0, i -> i/10).limit(pow).map(n -> (int) Math.pow(n%10, pow)).sum();
	}
	
	
}
