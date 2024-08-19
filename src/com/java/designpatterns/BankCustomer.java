package com.java.designpatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Adapter class, this is wrapper class which implements the desired target Interface
//modifies the specific request available for the Adaptee class.
public class BankCustomer extends BankDetails implements CreditCard {

	 
	@Override
	public void getBankDetails() {
		try{  
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			      
			   System.out.print("Enter the account holder name :");  
			   String customername=br.readLine();  
			   System.out.print("\n");  
			      
			   System.out.print("Enter the account number:");  
			   long accno=Long.parseLong(br.readLine());  
			   System.out.print("\n");  
			      
			   System.out.print("Enter the bank name :");  
			   String bankname=br.readLine();  
			      
			   setAccHolderName(customername);  
			   setAccNumber(accno);  
			   setBankName(bankname);  
	 }catch(Exception e){  
			        e.printStackTrace();  
			   }  
		
	}

	@Override
	public String getCreditCard() {
		   long accno=getAccNumber();  
		   String accholdername=getAccHolderName();  
		   String bname=getBankName();  
		          
		   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. "); 
	}

	 
}
