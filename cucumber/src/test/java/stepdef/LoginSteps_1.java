package stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class LoginSteps_1 extends Helpers {
	
	@Given("The login page is diplayed")
	public void initiateLogin() {
	    
		LaunchChrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed");
		
	}
	
	@When("user enters the valid username and password")
	public void userAction() {
		
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}
	
	@When("user clicks the login button")
	public void clickLogin() {
		
		d.findElement(By.id("login-button")).click();
		
	}
	
	@Then("The products title is displayed")
	public void testPageTitle() {
		
		String pageTitle = d.findElement(By.xpath("//span[@class='title']")).getText();
		assertEquals(pageTitle, "Products");
		CloseLaunchers();
		
	}

	
}
