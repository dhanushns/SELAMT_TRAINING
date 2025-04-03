package testsPOM;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.Launchers;
import pom_pages.*;

public class Test1 extends Launchers {
	
	LoginPage login;
	
	@BeforeMethod
	public void setup() {
		
		LaunchChrome("https://www.saucedemo.com/");
		login = new LoginPage(d);
	}
	
	@Test
	public void test1() {
		
		
		login.sendUsername("standard_user");
		login.sendPassword("secret_sauce");
		login.clickLogin();
		
		ProductPage product = new ProductPage(d);
		assertEquals(product.getTitle(),"Products","Passed as Expected");
		
		
	}
	
	@Test
	public void test2() {
		
		login.sendUsername("standard_user");
		login.sendPassword("secret_sauce");
		login.clickLogin();
		
		ProductPage product = new ProductPage(d);
		assertEquals(product.getTitle(),"Products1","Failed as Expected");
		
	}
	
	@Test
	public void test3() {
		
		login.sendUsername("standard_user");
		login.sendPassword("secret_sauce");
		login.clickLogin();
		
		ProductPage product = new ProductPage(d);
		assertEquals(product.getTitle(),"Products123","Failed as Expected");
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		
		CloseLaunchers();
		
	}
	
}
