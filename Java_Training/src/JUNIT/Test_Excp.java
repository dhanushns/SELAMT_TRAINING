package JUNIT;

import org.junit.Test;

public class Test_Excp {

	@Test(expected = ArithmeticException.class)
	public void test1() {
		
		int a = 10 / 0;
		System.out.println(a);
		
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		
		int[] a = new int [4];
		a[10] = 10;
		
	}

}
