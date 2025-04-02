package testNG;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoTest extends SauceDemoLogin {
	
	String pre_xpath = "//div[@class = 'inventory_list']/div[";
	String post_xpath = "]/div[2]//a";
	static int product_num = 1;
	
	@DataProvider(name = "ProductsName")
	public String[] getProducts() {
		
		int size = d.findElements(By.xpath("//div[@class = 'inventory_list']/div")).size();
		String[] products = new String[size];
		for(int i = 1; i <= size; i++) {
			String xpath = pre_xpath + i + post_xpath;
			products[i-1] = d.findElement(By.xpath(xpath)).getText();
		}
		products[size-1] = "Red Shirt";
		return products;
		
	}
	
	@BeforeClass
	public void initiateLogin() {
		
		login();
		
	}
	
	@Test(dataProvider = "ProductsName")
	public void test(String product_name) {
		
		String xpath = pre_xpath + (product_num++) + post_xpath;
		String pname = d.findElement(By.xpath(xpath)).getText();
		assertEquals(pname,product_name);
		
	}
	
	@AfterClass
	void close() {
		
		CloseLaunchers();
		
	}
	
	
}
