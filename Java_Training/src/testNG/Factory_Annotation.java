package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Factory;

public class Factory_Annotation {
	
	String browser;
	
	Factory_Annotation(String browser){
		
		this.browser = browser;
		
	}
	
	@Factory
	public static Object[] factory() {
		
		Object[] brw = {
				
				new Factory_Annotation("Chrome"),
				new Factory_Annotation("Edge"),
				new Factory_Annotation("Firefox")
				
		};
		
		return brw;
		
	}
	
	@Test
	public void test() {
		
		System.out.println("Running Test Browser : " + browser);
		
	}
	

}
