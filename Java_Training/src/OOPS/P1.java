package OOPS;

public class P1 {
	
	
	public static void main(String[] args) {
		
		Account adam = new Account(10010, "Adam Smith",5000);
		adam.show_details();
		adam.withdraw(500);
		adam.show_details();
		adam.deposite(200);
		adam.show_details();
		
	}

}