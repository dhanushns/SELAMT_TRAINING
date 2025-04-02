package JUNIT;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PARAM_CONS {

	private int num1, num2, excpected_result;
	
	public PARAM_CONS (int num1, int num2, int excpected_result){
		
		this.num1 = num1;
		this.num2 = num2;
		this.excpected_result  = excpected_result;
		
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data(){
		
		Object[][] tc = {
				{1,2,3},
				{5,10,15},
				{-6,-12,-18},
				{20,100,120}
		};
		
		List<Object[]> list = Arrays.asList(tc);
		
		return list;
		
	}
	
	public int add(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
	@Test
	public void t1() {
		assertEquals(excpected_result, add(num1,num2));
	}
	
	

}
