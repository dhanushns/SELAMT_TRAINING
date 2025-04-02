package Flipkart;

public class Flipkart_Inventry {
	
	public int product_id, quantity;
	public double price;
	public String product_name, brand;
	
	Flipkart_Inventry (int product_id, String product_name, double price, int quantity, String brand){
		
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		
	}
	
	Flipkart_Inventry() {}
	

}
