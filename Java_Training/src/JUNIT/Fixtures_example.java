package JUNIT;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures_example {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforeMethod() {
		
		System.out.println("Before Method");
		
	}
	
	@After
	public void afterMethod() {
		
		System.out.println("After Method");
		
	}
	
	@Test
	public void test1() {
		System.out.println("Test Method 1");
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("Test Method 2");
		assertTrue(true);
	}

}
