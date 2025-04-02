package OOPS;

public class P11_CP {
	
	public static int add(int a, int b) {
		System.out.println("Add method with 2 parameters");
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("Add method with 3 parametres");
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(5,10));
		System.out.println(add(100,50,50));
		
	}

}
