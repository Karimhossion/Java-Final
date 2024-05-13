/*
 * Problem Statement : Write a java program to create a class named “ BankAccount ” .
 *  The class contains the property such its.
		--- The name of the account holder
		--- Address of the account holder 
		--- Account holder 
		--- Balance
And methods such as :
	--- Generate unique account number 
	--- Display information and balance
	--- Deposit amount 
	--- Withdraw amount 
	--- Change address 

 */
package Lab_1;

import java.util.Scanner;

class BankAccount {
	private static int accountCounter = 0;
	private String accountNumber;
	private String holderName;
	private String address;
	private double balance;

	public BankAccount(String holderName, String address, double balance) {
		this.accountNumber = accountNumber();
		this.holderName = holderName;
		this.address = address;
		this.balance = balance;
	}

	private String accountNumber() {
		return "AS45DF34" + accountCounter++;
	}

	public void displayInfo() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + holderName);
		System.out.println("Address : " + address);
		System.out.println("Balance : " + balance);
	}

	public void deposit(double amount) {
		if (amount >= 500) {
			balance += amount;
			System.out.println("Deposit Successful.");
		} else {
			System.out.println("Invalid deposit.");
		}
	}

	public void withdraw(double amount) {
		if (amount >= 500 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw successful.");
		} else {
			System.out.println("Invalid withdraw.");
		}
	}

	public void changeAddress(String address) {
		this.address = address;
		System.out.println("Address updated successfully.");
	}
}

public class Lab_5 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String holderName, address, newAddress;
			double initialBalance;

			System.out.print("Enter Account Holder Name : ");
			holderName = input.nextLine();
			System.out.print("Enter Address : ");
			address = input.nextLine();
			System.out.print("Enter Initial Balance : ");
			initialBalance = input.nextDouble();
			BankAccount obj = new BankAccount(holderName, address, initialBalance);
			System.out.println("\n_________Initial Account Information_________:");
			obj.displayInfo();
			System.out.println("\n_________Deposit_________:");
			System.out.print("Enter Deposit Amount:");
			double depositAmount = input.nextDouble();
			obj.deposit(depositAmount);
			System.out.println("\n___________Withdraw_________:");
			System.out.print("Enter Withdraw Amount:");
			double withdrawalAmount = input.nextDouble();

			obj.withdraw(withdrawalAmount);
			input.nextLine();
			System.out.println("\n____________Address________:");
			System.out.print("Enter New Address:");
			newAddress = input.nextLine();

			obj.changeAddress(newAddress);

			System.out.println("\n_______Account Information________:");
			obj.displayInfo();
		}
	}
}
