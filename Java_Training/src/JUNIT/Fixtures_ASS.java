package JUNIT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Fixtures_ASS {

	static Object[][] tc = {
			{80,86,90,84},
			{92,97,75,95},
			{80,92,79,88},
	};
	
	
	static int m1, m2, m3, exp_res;
	static int pos = 0;
	
	@Before
	public void beforeMethod() {
		
		Object[] list = tc[pos++];
		m1 = (int) list[0];
		m2 = (int) list[1];
		m3 = (int) list[2];
		exp_res = (int) list[3];
		
	}
	
	
	@Test
	public void test1() {
		
		System.out.println("m1 = " + m2 + " m2 = " + m2 + " m3 = " + m3 + " exp_res = " + exp_res);
		
		assertEquals(exp_res,Compute_AVG.getAvg(m1, m2, m3),0);
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("m1 = " + m2 + " m2 = " + m2 + " m3 = " + m3 + " exp_res = " + exp_res);
		
		assertEquals(exp_res,Compute_AVG.getAvg(m1, m2, m3),0);
	}
	
	@Test
	public void test3() {
		
		System.out.println("m1 = " + m2 + " m2 = " + m2 + " m3 = " + m3 + " exp_res = " + exp_res);
		
		assertEquals(exp_res,Compute_AVG.getAvg(m1, m2, m3),0);
		
	}
	

}
