package OOPS;

public class P9 {
	public static void main(String[] args) {
		
		int a = 5, b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occured. Can't divide by zero");
		}
		finally {
			System.out.println("Finally block executed");
		}
		
	}
}
