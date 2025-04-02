package JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class Test_Comp_AVG {

	private int m1, m2, m3;
	private float expected_result;
	
	public Test_Comp_AVG(int m1, int m2, int m3,float expected_result) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.expected_result = expected_result;
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data(){
		
		Object[][] tc = {
				{80,86,90,84},
				{92,97,75,95},
				{80,92,79,88},
				{82,88,87,86},
				{72,78,90,76}
		};
		
		List<Object[]> list = Arrays.asList(tc);
		
		return list;
		
	}
	
	@Test
	public void test() {
		System.out.println("m1 = " + m1 + " m2 = " + m3 + " m3 = " + m3 + " avg = " + expected_result);
		assertEquals(expected_result, Compute_AVG.getAvg(m1, m2, m3),0);
	}
	
}
