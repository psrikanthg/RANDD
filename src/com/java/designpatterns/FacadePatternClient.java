package com.java.designpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * it promotes loose coupling between two subsystems and its clients. 
 * Facade Pattern describes a higher level of interface that makes subsystem easier to use.
 * it hides complexities of the subsystems from the client
 * 
 * Facade design pattern hides the complexisties of the system n provides an interface to the client
 * using which, client can access the system.
 */

public class FacadePatternClient {
	
	private static  int choice;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
	do {
		System.out.println("=========Mobile Shop ====================");
		System.out.println(" 1 Iphone");
		System.out.println(" 2 Samsung ");
		System.out.println(" 3 Black Berry ");
		System.out.println(" 4.Exit ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		choice = Integer.parseInt(reader.readLine());
		ShopKeeper sp = new ShopKeeper();
		switch(choice){
		case 1: {
			sp.iphoneSale();
		}
		break;
		case 2: {
			sp.samsungSale();
		}
		break;
		case 3:{
			sp.blacBerry();
			
		}
		default:
		case 4:{
			System.out.println("Nothing You purchased");  
		}
		return;
		}
	  }while(choice!=4); 
	
	}
  }
