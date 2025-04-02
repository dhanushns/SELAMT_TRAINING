package stepdef_2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class AddToCart_1 extends Helpers {
	
	static HashMap<String,Object[]> products = new HashMap<>();
	static List<WebElement> cartProducts;
	String pre_xpath = "//tr[@class = 'cart-item-row'][";
	String post_xpath_1 = "]//td[@class = 'product']";
	String post_xpath_2 = "]//td[@class = 'qty nobr']//input";
	String post_xpath_3 = "]//td[@class = 'subtotal nobr end']/span[2]";
	String productName;
	int unit;
	
	@When("user clicks {string} categories section")
	public void user_clicks_categories_section(String category) {
	    
		d.findElement(By.xpath("//ul[@class = 'list']//a[@href='/" + category + "']")).click();
		
	}
	@When("user clicks the sortBy option and choose the option")
	public void user_clicks_the_sort_by_option() {
		
		d.findElement(By.id("products-orderby")).click();
		d.findElement(By.xpath("//div[@class = 'product-sorting']/select/option[4]")).click();
	}
	
	@When("user clicks the product {string}")
	public void chooseProduct(String productName) {
	   
		d.findElement(By.linkText(productName)).click();
		this.productName = productName.trim();
	}
	
	@When("user adds the {string} and price {string}")
	public void addQuantity(String unit, String price) {
	    
		d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[1]")).clear();
		d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[1]")).sendKeys(unit);
		products.put(productName, new Object[] {Integer.parseInt(unit),Double.parseDouble(price)});
		
		
	}
	
	@When("user clicks the add to cart button")
	public void addToCart() {
		d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[2]")).click();
	}
	
	@Then("the confirmation message should be displayed")
	public void testMessage() {
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofMillis(800));
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class = 'content']")));
		
		assertEquals(we.getText(),"The product has been added to your shopping cart");
		
	}
	
	@When("user clicks the shopping cart")
	public void viewShoppingCart() {
	    
		d.findElement(By.xpath("//div[@class = 'header-links']//a[@href='/cart']")).click();
		
	}
	
	@Then("verify the products in the cart")
	public void testCart() {
		
		cartProducts = d.findElements(By.className("cart-item-row"));
		double grandTotal = 0;
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(2));
		for(int i = 0; i < cartProducts.size(); i++) {
			
			String path = pre_xpath + (i+1) + post_xpath_1;
			WebElement productNameElement = d.findElement(By.xpath(path));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
			String cartProductName = productNameElement.getText();
			
			if(products.containsKey(cartProductName)) {
				
				path = pre_xpath + (i+1) + post_xpath_2;
				WebElement unitValueElement = d.findElement(By.xpath(path));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
				int productUnit = Integer.parseInt(unitValueElement.getDomAttribute("value"));
				int exp_unit = (int)products.get(cartProductName)[0];
				
				if(productUnit == exp_unit) {
					
					path = pre_xpath + (i+1) + post_xpath_3;
					WebElement totalValueElement = d.findElement(By.xpath(path));
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
					double productTotal = Double.parseDouble(totalValueElement.getText());
					
					double exp_total = ((int)products.get(cartProductName)[0]) * ((double)products.get(cartProductName)[1]);
					
					if(exp_total != productTotal) {
						assertEquals(productTotal,exp_total);
					}
					else {
						
						grandTotal += exp_total;
					}
				}
				else {
					assertEquals(productUnit,exp_unit);
				}
			}
			else {
				assertTrue(false,"Product mismatch");
			}
		}
		double cartTotal = Double.parseDouble(d.findElement(By.xpath("//span[@class = 'product-price order-total']/strong")).getText());
		if(cartTotal != grandTotal) {
			
			assertEquals(grandTotal,cartTotal);
			
		}
	}
	
	@When("user changes the unit of {string} to {string}")
	public void verifyUnitChanges(String product_name, String unit) {
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofMillis(1500));
		
		for(int i = 0; i < cartProducts.size(); i++) {	
			
			String path = pre_xpath + (i+1) + post_xpath_1;
			WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
			String product = we.getText();
			if(product.equals(product_name)) {
				
				path = pre_xpath + (i+1) + "]//td[@class = 'qty nobr']//input";
				d.findElement(By.xpath(path)).clear();
				d.findElement(By.xpath(path)).sendKeys(unit);
				products.get(product)[0] = Integer.parseInt(unit);
			}
			
		}
		
	}
	
	@When("user clicks the update cart button")
	public void updateCart() {
		d.findElement(By.name("updatecart")).click();
	}
	
	@When("user clicks the selection button of {string}")
	public void removeCart(String product_name) {
		
		for(int i = 0; i < cartProducts.size(); i++) {	
			
			String path = pre_xpath + (i+1) + post_xpath_1;
			String product = d.findElement(By.xpath(path)).getText();
			if(product.equals(product_name)) {
				
				path = pre_xpath + (i+1) + "]//td[@class = 'remove-from-cart']//input";
				d.findElement(By.xpath(path)).click();
				products.remove(product_name);
			}
			
		}
	}
}
