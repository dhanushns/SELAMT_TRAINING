package JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSub_num {

	@Test
	public void t1() {
		sub_num s = new sub_num();
		System.out.println("Inside the t1 sub class");
		assertEquals(0, s.sub(5, 5));
	}
	
	@Test
	public void t2() {
		sub_num s = new sub_num();
		System.out.println("Inside the t1 sub class");
		assertEquals(-20, s.sub(-40, -20));
	}
	
	@Test
	public void t3() {
		sub_num s = new sub_num();
		System.out.println("Inside the t1 sub class");
		assertEquals(20, s.sub(0, -20));
	}
	
}
