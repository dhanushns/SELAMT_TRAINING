package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2D {
	
	@DataProvider(name = "loginData")
	public Object[][] getData(){
		
		Object[][] data = {
				
				{"user1","pwd1"},
				{"user2","pwd2"},
				{"user3","pwd3"}
				
		};
		
		return data;
		
	}
	
	@Test(dataProvider = "loginData")
	public void test(String username, String password) {
		
		System.out.println("Username : " + username + " password :" + password);
		
	}

}
