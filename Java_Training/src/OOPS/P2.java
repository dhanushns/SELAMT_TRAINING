package OOPS;

public class P2 {
	
	
	public static void main(String[] args) {
		
		Account[] account = new Account[3];
		
		account[0] = new Account(12290, "adam",5000);
		account[1] = new Account(1056,"Priya", 500);
		
		
		account[0].show_details();
		account[1].deposite(3000);
		account[1].show_details();
		
		
	}

}