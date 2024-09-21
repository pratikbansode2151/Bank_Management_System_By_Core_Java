package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.serviceImpl.Sbi;

	 import java.util.*;
public class Test {

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		Sbi s = new Sbi();
		
		int choice;
		
		do {
		System.out.println("Enter the choice "+"1.Create Account \n"+"2.Display All Details of Account Holders \n"+"3. Deposite Money \n"+"4.Withdrawel Money\n"+"5.Check Balance\n");
		
		choice = sc.nextInt();
		switch(choice)
		{
		
		case 1 :
			s.createAccount();
		    break;
		    
		case 2 :
		
			s.displayAllDetails();
            break;
		     
		case 3 :
	
			s.depositeMoney();
			break;
		
		case 4 :
		
			s.withdrawal();
			break;

		
		case 5 :
		
			
			s.balanceCheck();
		    break;
		
		}
		}
		while(choice!=5);
	
	}
}
