package com.arihant;

import java.util.*;

public class ATMInterface 
{

	// Oasis Infobyte Task1 :- ATM Iterface.
	// By Arihant Jain .
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		int deposite;
		int balance = 80000;
		double Withdraw;
	    int Transaction = 0;
		double Password;
		String AccountHolderName;
		int AccountNumber;
		double amount;
		String TransactionHistory = null;
		
		System.out.println("ATM INTERFACE:");
		System.out.println("\n1.Login:");
		System.out.println("\n2.Withdraw:");
		System.out.println("\n3.Balance:");
		System.out.println("\n4.Deposite:");
		System.out.println("\n5.Transfer:");
		System.out.println("\nEnter Your Choice:");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			    System.out.println("Enter your name here :");
			    AccountHolderName = sc.next();
			    System.out.println("Enter your password here:");
			    Password = sc.nextDouble();
			    System.out.println("Enter your Account number onli 4 digit:");
			    AccountNumber = sc.nextInt();
			    System.out.println("Login Completed.");
			    break;
			    
		case 2:
			    System.out.println("Enter the amount to be withdrawn:");
			    amount = sc.nextDouble();
			    
			    try
			    {
			    	if(balance >= amount)
			    	{
			    		balance -= amount;
			    		System.out.println("\n Withdrawl successfully done:");
			    		String remove = "Rs" + amount + "Withdrawn";
			    		TransactionHistory = TransactionHistory.concat(remove);	
			    	}
			    	else
			    	{
			    		System.out.println("Insufficent Balance.");
			    	}
			    }
			    catch (Exception e)
			    {
			    	
			    }
			    break;
			    
		case 3:
			    System.out.println("Balance :"+ balance);
			    break;
			    
		case 4:
			    System.out.println("\n Enter money to be deposited:");
			    deposite = sc.nextInt();
			    balance = balance + deposite;
			    System.out.println("\nYour money has been successfully deposited:");
			    System.out.println("");
			    break;
			    
		case 5:
			   System.out.println("Enter account holder name :\n");
			   AccountHolderName = sc.next();
			   System.out.println("\nEnter the amount to be transfeered :");
			   amount = sc.nextDouble();
			   try
			   {
				   if(balance >= amount)
				   {
					   if(amount <= 80000.00)
					   {
						   Transaction++;
						   balance -= amount;
						   System.out.println("Amount Successfully transfered to :"+AccountHolderName);
						   String string = "Rs" + amount + "Transfered";
						   TransactionHistory = TransactionHistory.concat(string);					   
					   }
					   else
					   {
						   System.out.println("Sorry it has gone failed.");
					   }
				   }
					   else
					   {
						   System.out.println("Insufficent Balance:");
					   }
					   
			   }
			   catch (Exception e)
			   {
				   
			   }
			   break;
		}
		System.exit(0);
		}
		

	}

}
