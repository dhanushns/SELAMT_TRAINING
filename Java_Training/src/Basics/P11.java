package Basics;

public class P11 {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int product(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		
		int x, y;
		
		x = add(13,56);
		System.out.println("Sum = " + x);
		
		y = product(5,6);
		System.out.println("Product = " + y);
		
	}
}
