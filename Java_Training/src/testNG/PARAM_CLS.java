package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class PARAM_CLS {
	
	@Test
	@Parameters({"OS"})
	public void test(String OS) {
		
		System.out.println("Test Running at OS :  " + OS);
		
	}
	
}
