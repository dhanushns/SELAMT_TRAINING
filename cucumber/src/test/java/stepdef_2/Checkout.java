package stepdef_2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class Checkout extends Helpers {
	
	WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(5));
	
	@When("user clicks the tick-box of terms and services")
	public void checkTermsAndServices() {
		
		d.findElement(By.id("termsofservice")).click();
		
	}
	
	@When("user clicks the checkout button")
	public void clickCheckout() {
		
		d.findElement(By.id("checkout")).click();
		
	}
	
	@When("user clicks the select country option")
	public void clickCountryOption() {
		
		d.findElement(By.id("BillingNewAddress_CountryId")).click();
		
	}
	
	@When("user choose the country {string}")
	public void chooseCountry(String country) {
		
		WebElement we = d.findElement(By.id("BillingNewAddress_CountryId"));
		Select s = new Select(we);
		s.selectByVisibleText(country);
		
	}
	
	@When("user enters the city {string}")
	public void enterCity(String city) {
		
		d.findElement(By.id("BillingNewAddress_City")).sendKeys(city);
		
	}
	
	@When("user enters the address_line {string}")
	public void enterAddress(String address) {
		
		d.findElement(By.id("BillingNewAddress_Address1")).sendKeys(address);
		
	}
	
	@When("user enters the postal code {string}")
	public void enterCode(String code) {
		
		d.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(code);
		
	}
	
	@When("user enters the phone number {string}")
	public void enterPhoneNumber(String phn) {
		
		d.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(phn);
		
	}
	
	@When("user clicks the billing address continue button")
	public void clickContinue() {
		
		d.findElement(By.xpath("//div[@id = 'billing-buttons-container']/input")).click();
		
	}
	
	@When("user clicks the shipping address continue button")
	public void user_clicks_the_shipping_address_continue_button() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'shipping-buttons-container']/input")));
		we.click();
	}
	@When("user clicks the shipping method continue button")
	public void user_clicks_the_shipping_method_continue_button() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'shipping-method-buttons-container']/input")));
		we.click();
	}
	@When("user clicks the payment option")
	public void user_clicks_the_payment_option() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'section payment-method']/ul/li[2]//input")));
		we.click();
	}
	@When("user clicks the payment method continue button")
	public void user_clicks_the_payment_method_continue_button() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'payment-method-buttons-container']/input")));
		we.click();
	}
	@When("user clicks the payment information continue button")
	public void user_clicks_the_payment_information_continue_button() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'payment-info-buttons-container']/input")));
		we.click();
	}
	@When("user clicks the confirm order button")
	public void user_clicks_the_confirm_order_button() {
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'confirm-order-buttons-container']/input")));
		we.click();
	
	}
	
	
	@Then("the order confirmation message is displayed {string}")
	public void orderMessage(String message) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'section order-completed']//strong")));
		String res = d.findElement(By.xpath("//div[@class = 'section order-completed']//strong")).getText();
		assertEquals(res,message);
		
	}
	
	@Then("the order number is displayed")
	public void orderNumber() {
		
		boolean res = d.findElement(By.xpath("//div[@class = 'section order-completed']//li[1]")).isDisplayed();
		String orderNum = d.findElement(By.xpath("//div[@class = 'section order-completed']//li[1]")).getText();
		orderNum = orderNum.split(":")[1].trim();
		TextContext textContext = new TextContext();
		textContext.setOrder(ScenarioContext.ORDER_NO.toString(), orderNum);
		assertTrue(res);
		
		
	}
	
	
}
