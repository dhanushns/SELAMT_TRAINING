package Basics;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20, b = 15, ans = 0;
		Scanner input = new Scanner(System.in);
		char op = input.next().charAt(0);
		
		switch(op) {
			case '+' : 
				System.out.println("Addition");
				ans = a + b;
				break;
			
			case '-' : 
				System.out.println("Difference");
				ans = a - b;
				break;
			
			case '/' : 
				System.out.println("Division");
				ans = a / b;
				break;
			
			case '*' : 
				System.out.println("Multiplication");
				ans = a * b;
				break;
			
			default :
				System.out.println("No matching");
		
		}
		System.out.println(a + " " + op + " " + b + " = " + ans);
		input.close();
		
	}

}
