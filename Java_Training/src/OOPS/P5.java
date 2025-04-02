package OOPS;

public class P5 {
	
	public static void main(String[] args) {
		bank_Account acc = new bank_Account(2241,"Priya");
		acc.setBalance(5000);
		System.out.println("Name :" + acc.getName());
		System.out.println("Account no : " + acc.getAcc_no());
		System.out.println("Balance : " + acc.getBalance());
	}
}

class bank_Account{
	
	private int acc_no;
	private String name;
	private double balance;
	
	bank_Account(int acc_no, String name){
		this.acc_no = acc_no;
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAcc_no() {
		return acc_no;
	}
	
	public String getName() {
		return name;
	}
	
	
}
