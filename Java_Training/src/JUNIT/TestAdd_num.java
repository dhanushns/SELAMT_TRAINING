package JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd_num {

	@Test
	public void t1() {
		add_num a = new add_num();
		System.out.println("Inside the t1 add class");
		assertEquals(10, a.sum(5, 5));
	}
	
	@Test
	public void t2() {
		add_num a = new add_num();
		System.out.println("Inside the t1 add class");
		assertEquals(5, a.sum(5, 0));
	}
	
	@Test
	public void t3() {
		add_num a = new add_num();
		System.out.println("Inside the t1 add class");
		assertEquals(10, a.sum(8,11));
	}

}
