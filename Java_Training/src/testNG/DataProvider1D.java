package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1D {
	
	@DataProvider(name = "loginData")
	public Object[] getData(){
		
		Object[] data = {
				"user1",
				"user2",
				"user3"
		};
		
		return data;
		
	}
	
	@Test(dataProvider = "loginData")
	public void test(String username) {
		
		System.out.println("Username : " + username);
		
	}

}
