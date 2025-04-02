package JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArraySum {
	
	ArraySum arr_sum;
	
	@Test
	public void t1() {
		
		int[] t1 = {10,20,30,40,50};
		
		arr_sum = new ArraySum();
		int result = arr_sum.compute_sum(t1);
		assertEquals(result,150); 
		
	}
	
	@Test
	public void t2() {
		
		int[] t1 = {56,12,80,100};
		
		arr_sum = new ArraySum();
		int result = arr_sum.compute_sum(t1);
		assertEquals(result,248); 
		
	}
	
}
