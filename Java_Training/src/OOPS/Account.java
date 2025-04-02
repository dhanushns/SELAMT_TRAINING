package OOPS;

class Account{
	
	int acc_no;
	String username;
	double balance;
	
	
//	Constructor method to initialize the data members
	Account(int acc_no, String username, double balance){
		
		this.acc_no = acc_no;
		this.username = username;
		this.balance = balance;
		
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public void show_details() {
		
		System.out.println("######################################");
		System.out.println("Your Account Details");
		System.out.println("Your name       : " + this.username);
		System.out.println("Account No      :" + this.acc_no);
		System.out.println("Current Balance : " + this.balance);
		
	}
	
}
