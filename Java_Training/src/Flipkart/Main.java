package Flipkart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Map.Entry;

public class Main {
	
	static HashMap<Integer,Flipkart_Inventry> products = new HashMap<>();
	static Scanner input = new Scanner(System.in);
	static HashMap<Integer,Users> users = new HashMap<>();
	static HashMap<Integer,Bills> bills = new HashMap<Integer,Bills>();
	static int user_count = 0;
	static int id = 0;
	
	public static void add_products() {
		
		products.put(785, new Flipkart_Inventry(785,"Desktop  ",14000,10,"Hp"));
		products.put(895, new Flipkart_Inventry(895,"Playstation 5",48000,3,"Soney"));
		products.put(955, new Flipkart_Inventry(955,"XBox Controller",12000,4,"Xbox"));
		products.put(234, new Flipkart_Inventry(234,"T - Shirts",200,25,"Nike"));
		products.put(967, new Flipkart_Inventry(967,"Apple 6 Pro",42000,10,"Apple"));
		products.put(908, new Flipkart_Inventry(908,"Omen Mouse",8000,15,"Omen"));
		products.put(100, new Flipkart_Inventry(100,"AMD Ryzen",12000,16,"AMD"));
		products.put(667, new Flipkart_Inventry(667,"ASUS Zyphire",98000,2,"Asus"));
		products.put(998, new Flipkart_Inventry(998,"Titan Watch",5000,25,"Titan"));
		products.put(675, new Flipkart_Inventry(675,"Oppo A54",11500,20,"Oppo"));
		
	}
	
	
	public static void login() {
		
		System.out.print("Username : ");
		input.nextLine();
		String username = input.nextLine();
		System.out.print("Password : ");
		int pass = input.nextInt();
		
		boolean flag = false;
		for(Entry<Integer,Users> e : users.entrySet()) {
			
			if(e.getValue().getName().equals(username) && e.getValue().getPass() == pass) {
				
				id = e.getKey();
				menu();
				flag = false;
				break;
			}
			else {
				flag = true;
			}
			
		}
		
		if(!flag) {
			System.out.println("Invalid Password/Username");
		}
		
	}
	
	public static void register() {
		
		System.out.print("Enter Username : ");
		input.nextLine();
		String username = input.nextLine();
		System.out.print("Set Password : ");
		int pass = input.nextInt();
		
		users.put(++user_count, new Users(username,pass));
		id = user_count;
		
	}
	
	public static void menu() {
		
		System.out.println();
		
		int op = 0;
		
		do {
			
			System.out.println("1. Display Products");
			System.out.println("2. Purchase History");
			System.out.println("3. Display Offers");
			System.out.println("4. Exit");
			
			System.out.print("Enter the option : ");
			op = input.nextInt();
			
			switch(op) {
				
				case 1 : display_products();
				break;
				case 2 : purchase_history();
				break;
				case 3 : display_offer();
				break;
				case 4 : System.out.println("Logged out!");
				break;
				default: System.out.println("Invalid Option");
			}
			
		}while(op != 4);
		
	}
	
	public static void display_products() {
		
		int ch_id = 0;
		do {
			
			System.out.println("| \tID \t | \tname \t\t | \tQTY \t | \tPrice \t\t | \tBrand \t|");
			for(Entry<Integer,Flipkart_Inventry> e : products.entrySet()) {
				
				Flipkart_Inventry product = e.getValue();
				System.out.println("|\t" + product.product_id + "\t |\t" + product.product_name + "\t |\t" + product.quantity + "\t |\t" + product.price + "\t\t |\t" + product.brand + " \t|"); 
				
			}
			System.out.println("| \t999 \t | \t Exit \t\t |");
			System.out.print("\nEnter the product id you want to purchase : ");
			ch_id = input.nextInt();
			
			boolean flag_id = true;
			
			if(ch_id == 999) {
				display_bill();
				break;
			}
			else {
				for(Entry<Integer,Flipkart_Inventry> e : products.entrySet()) {
					
					Flipkart_Inventry product = e.getValue();
					if(product.product_id == ch_id) {
						flag_id = false;
						System.out.print("Enter the quantity you required : ");
						int unit = input.nextInt();
						place_order(ch_id, unit);
					}
					else {
						flag_id = true;
					}
					
				}
				
				if(flag_id) {
					System.out.println("Invalid Product ID");
				}
			}
			
		}while(ch_id != 999);
		
	}
	
	public static void place_order(int pr_id,int unit) {
		
		for(Entry<Integer,Flipkart_Inventry> e : products.entrySet()) {
			
			Flipkart_Inventry product = e.getValue();
			if(product.product_id == pr_id) {
				if(product.quantity >= unit) {
					if(bills.containsKey(id)) {
						bills.get(id).addBill(product);
					}
					else {
						bills.put(id,new Bills(product));
					}
					System.out.println("Your Order Placed Successfully");
					product.quantity -= unit;
					break;
				}
				else {
					System.out.println("Insufficient Quantity");
					break;
				}
			}
			
		}
			
	}
	
	
	public static void display_bill() {
		
		System.out.println("\n\n******* Your Bills *******\n");
		
		System.out.println("| \tname \t\t | \tQTY \t | \tPrice \t\t | \tTotal   |");
		
		ArrayList<Flipkart_Inventry> products = bills.get(id).getBill();
		
		double totalAmount = 0;
		int t_shirt_count = 0;
		
		for(int i = 0; i < products.size() ; i++) {
			double subprice = products.get(i).quantity * products.get(i).price;
			totalAmount += subprice;
			
			if(products.get(i).product_id == 234) {
				t_shirt_count += products.get(i).quantity;
			}
			
			System.out.println("|\t" + products.get(i).product_name + "\t |\t" + products.get(i).quantity + "\t |\t" + products.get(i).price + "\t\t |\t" + subprice + "  |"); 
			
		}
		double final_price = totalAmount;
		if(totalAmount >= 25000) {
			final_price = totalAmount - (totalAmount*0.2);
		}
		else if(totalAmount >= 15000 && totalAmount <= 20000) {
			final_price = totalAmount - (totalAmount*0.1);
		}
		else if(t_shirt_count >= 3) {
			final_price = totalAmount - (totalAmount*0.1);
		}
		
		System.out.println("\n----------------------------------------------");
		System.out.println("Sub-Total Amount : Rs." + totalAmount);
		System.out.println("Total Amount with Discount : Rs." + final_price);
		System.out.println("----------------------------------------------\n");
		
	}
	
	public static void purchase_history() {
		

		System.out.println("\n\n******* Your Purchases *******\n");
		
		System.out.println("| \tname \t\t | \tQTY \t | \tPrice \t\t | \tTotal   |");
		
		ArrayList<Flipkart_Inventry> products = bills.get(id).getBill();
		
		for(int i = 0; i < products.size() ; i++) {
			
			double subprice = products.get(i).quantity * products.get(i).price;
			
			System.out.println("|\t" + products.get(i).product_name + "\t |\t" + products.get(i).quantity + "\t |\t" + products.get(i).price + "\t\t |\t" + subprice + "  |"); 
			
		}
		
		System.out.println();
		
	}
	
	public static void display_offer() {
		
		System.out.println("\n ************** Discount & Offers *****************");
		System.out.println("1. 20% discount for purchase more then Rs.25,0000");
		System.out.println("2. 10% discount for purchase more than Rs.15,000 and less than Rs.20,000");
		System.out.println("3. 10% discount for purchase more then 3 T-shirts");
		System.out.println();
		
	}
	
	public static void start() {
		
		int op = 0;
		do {
			
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Exit");
			
			System.out.print("Enter the option : ");
			op = input.nextInt();
			
			switch(op) {
				case 1 : login();
				break;
				case 2 : register();
				menu();
				break;
				default : System.out.println("Invalid Option");
				break;
			}
			
		}while(op != 3);
		
	}
	
	
	public static void main(String[] args) {
		
		add_products();
		start();
		
	}
	
}
