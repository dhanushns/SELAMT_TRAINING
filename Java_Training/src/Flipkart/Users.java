package Flipkart;

import java.util.ArrayList;

public class Users {
	
	private String username;
	private int pass;
	
	Users(String username,int pass){
		
		this.username  = username;
		this.pass = pass;
		
	}
	
	Users(){}

	
	public String getName() {
		return username;
	}
	
	public int getPass() {
		return pass;
	}
	
}

class Bills{
	
	private ArrayList<Flipkart_Inventry> bills = new  ArrayList<Flipkart_Inventry>();
	
	
	Bills(Flipkart_Inventry newProduct) {
		this.bills.add(newProduct);
	}
	
	Bills(){}
	
	
	public void addBill(Flipkart_Inventry newProduct) {
		this.bills.add(newProduct);
	}
	
	public ArrayList<Flipkart_Inventry> getBill(){
		return this.bills;
	}
	
}
