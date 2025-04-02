package OOPS;

public class P10 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured. Invalid Inedex Value");
		}
		finally {
			System.out.println("Finally block exceuted");
		}
		
	}
}
