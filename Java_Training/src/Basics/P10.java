package Basics;

import java.util.Scanner;

public class P10 {
	
	static int pin = 1056;
	static double balance = 5000;
	static Scanner input = new Scanner(System.in);
	
	public static boolean authenticateUser() {
		
		System.out.print("Enter your pin : ");
		int userPin = input.nextInt();
		return userPin == pin;
		
	}
	
	public static void checkBalance() {
		
		if(authenticateUser()) {
			System.out.println("This is your current account balance.");
			System.out.println("Rs." + balance);
		}
		else {
			System.out.println("Invalid Pin");
		}
		
	}
	
	public static void withdrawMoney(double withdrawAmount) {
		
		if(authenticateUser()) {
			if(withdrawAmount <= balance) {
				balance -= withdrawAmount;
				System.out.println("The Amount Sucessfully withdrawed");
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		else {
			System.out.println("Invalid Pin");
		}
		
	}
	
	public static void depositeMoney(double amount) {
		if(authenticateUser()) {
			balance += amount;
			System.out.println("Your Amount has been deposited sucessfully");
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	
	public  static void menu() {
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
	}
	
	
	public static void main(String[] args) {
		
		int op;
		System.out.println("Welcome to HDFC Bank!\nPlease select the below option to continue with your account.");
		do {
			
			menu();
			op = input.nextInt();
			
			switch(op) {
					
				case 1 : checkBalance();
				break;
				
				case 2 : 
					System.out.print("Enter the amount to withdraw : ");
					double withdrawAmount = input.nextDouble();
					withdrawMoney(withdrawAmount);
				break;
				
				case 3 : 
					System.out.print("Enter the amount to deposite : ");
					double amount = input.nextDouble();
					depositeMoney(amount);
					break;
				
				case 4 : System.out.println("Sucessfully Loged out! Thankyou");
				break;
				
				default:
					System.out.println("Invalid Option choosen, Please try again.");
				
			}
			
		}while(op != 4);
		
		input.close();
	}

}
