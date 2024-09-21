package com.braindata.bankmanagement.serviceImpl;

	import java.util.*;

import com.braindata.backmanagement.model.Account;
import com.braindata.bankmanagements.service.Rbi;
	
public class Sbi implements Rbi{
	Scanner sc = new Scanner(System.in);
	double balance;
	Account a = new Account();
	public void createAccount()
	{
		System.out.println("Enter the Account No of the person");
		a.setAccno(sc.nextLong());
		
		System.out.println("Enter the Name of the person");
		a.setName(sc.next());
		
		System.out.println("Enter the mobile no the person");
		a.setMobno(sc.next());
		
		System.out.println("Enter the adhar no of the  person");
		a.setAdharno(sc.next());
		
		System.out.println("Enter the gender of the person");
		a.setGender(sc.next());
		
		System.out.println("Enter the age of the person");
		a.setAge(sc.nextInt());
		
		//System.out.println("Enter the balance of the person");
	//	a.setBalance(sc.nextDouble());
	}
	
	@Override
	public void displayAllDetails() {
		
	System.out.println(a.getAccno());
	System.out.println(a.getName());
	System.out.println(a.getMobno());
	System.out.println(a.getAdharno());
	System.out.println(a.getGender());
	System.out.println(a.getAge());
	//System.out.println(a.getBalance());
		
	}
	@Override
	public void depositeMoney() {
	
		System.out.println("Enter the money to be deposited");
		double depositemoney = sc.nextDouble();
		  
		  balance = balance + depositemoney;
		 System.out.println("Your deposited amount is : "+depositemoney+" And the current amount is "+balance);
		
	}
	@Override
	public void withdrawal() {
	
		double withdrawal = sc.nextDouble();
		 balance = balance - withdrawal;
		System.out.println("The Amount is to be withdrawel : "+withdrawal+" And the current balance is : "+balance);
		
	}
	@Override
	public void balanceCheck() {
		
		System.out.println("Your Balance is to be check is :"+balance);
		
	}

}
