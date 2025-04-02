package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DepondsOnMethod {
	
	@Test
	public void Login() {
		
		assertEquals(true,false);
		System.out.println("Login Successfully Done");
		
	}
	
	@Test(dependsOnMethods = "Login")
	public void dashboard() {
		
		System.out.println("In Dashboard Method");
		
	}

	
}
