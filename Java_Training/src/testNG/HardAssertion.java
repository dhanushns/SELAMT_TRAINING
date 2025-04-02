package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void test1() {
		
		assertEquals(true,true);
		System.out.println("Test 1 Method");
		
	}
	
	@Test
	public void test2() {
		
		assertEquals(true,false);
		System.out.println("Test 2 Method");
		
	}
	
	@Test
	public void test3() {
		
		assertEquals(false,false);
		System.out.println("Test 3 Method");
		
	}
	
}
