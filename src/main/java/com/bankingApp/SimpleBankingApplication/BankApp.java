package com.bankingApp.SimpleBankingApplication;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		
	}

}

class BankAccount { 			// class with attributes 
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String cname, String cid){ // constructor
		customerName = cname;
		customerID = cid;
	}
	
	void deposit(int amount) {  // function deposit
		if(amount !=0) {
			balance = balance+amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount) {  //function withdraw
		if (amount !=0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransactions() {  //function to show what was the previous transaction realized 
		if(previousTransaction >0 ) {
			System.out.println("Deposited: "+previousTransaction);
		}
		else if (previousTransaction <0) {
			System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occurred");
		}
	}
	
	void showMenu() {  // show menu option to user
		
		char option= '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is "+customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("========================================");
			System.out.println("Enter an option: ");
			System.out.println("========================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("----------------------------------");
				System.out.println("Balance: "+balance);
				System.out.println("----------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("----------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("----------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------");
				getPreviousTransactions();
				System.out.println("----------------------------------");
				System.out.println("\n");
				break;
				
			default:
				System.out.println("Invalid option! Please enter again");
				break;
			}
		} while(option != 'E');
		System.out.println("Thank you for using out banking application!");
		
		
	}
}