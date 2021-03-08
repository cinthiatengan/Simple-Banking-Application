package com.bankingApp.SimpleBankingApplication;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		// int a = scanner.nextInt();
		char c = scanner.next().charAt(0); //get the first character input
		System.out.println("value = " +c);
	}

}
