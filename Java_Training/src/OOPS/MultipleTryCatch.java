package OOPS;

public class MultipleTryCatch {
	
	public static void main(String[] args) {
		
		int a = 5,b=0;
		int[] arr = new int[5];
		
		try {
			int c = a/b;
			System.out.println(c);			
			System.out.println(arr[10]);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Occurred. Divison by zero");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid Index.");
			
		}
		catch(Exception e) {
			
			System.out.println("An Exception Occured");
			
		}
		
	}

}
