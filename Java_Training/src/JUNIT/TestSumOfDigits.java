package JUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSumOfDigits {

	@Test
	public void t1() {
		int result = Basics.SumOfDigits_T.compute(9876);
		assertEquals(30,result);
	}
	
	@Test
	public void t2() {
		int result = Basics.SumOfDigits_T.compute(55201);
		assertEquals(13,result);
	}
	
	@Test
	public void t3() {
		int result = Basics.SumOfDigits_T.compute(99552);
		assertEquals(31,result);
	}

}
