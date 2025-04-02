package testsPOM;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom_pages.*;
import utilities.Helpers;

public class Test1 extends Helpers {
	
	@DataProvider(name = "loginData")
	public Iterator<String[]> getData() throws IOException{
		
		readFile("loginData.xlsx","Sheet1");
		
		 ArrayList<String[]> data = new ArrayList<>();
		 for(int i = 1; i <= 6; i++) {
			 
			 String username = readExcelCell(i,0);
			 String pwd = readExcelCell(i,1);
			 data.add(new String[] {username,pwd});
			 
		 }
		 Iterator<String[]> list = data.iterator();
		 return list;
		
	}
	
	@BeforeMethod
	public void setup() {
		
		LaunchChrome("https://www.saucedemo.com/");
		
	}
	
	@Test(dataProvider = "loginData")
	public void testLoginFeature(String username, String pwd) {
		
		LoginPage login = new LoginPage(d);
		login.sendUsername(username);
		login.sendPassword(pwd);
		login.clickLogin();
		
		ProductPage product = new ProductPage(d);
		assertEquals(product.getTitle(),"Products","Passed as Expected");
		
		
	}
	
	@AfterMethod
	public void close() {
		
		CloseLaunchers();
		
	}
	
}
