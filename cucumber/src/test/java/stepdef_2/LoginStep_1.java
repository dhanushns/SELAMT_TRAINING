package stepdef_2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class LoginStep_1 extends Helpers{
	
	@Given("The login page is displayed")
	public void initializeLogin() {
		
		LaunchChrome("https://demowebshop.tricentis.com/");
		d.findElement(By.linkText("Log in")).click();
		
	}
	
	@When("User enters the {string} and {string}")
	public void enterCredentials(String username, String password) {
	    
		d.findElement(By.id("Email")).sendKeys(username);
		d.findElement(By.id("Password")).sendKeys(password);
		
	}
	
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    
		d.findElement(By.className("login-button")).click();
		
	}
	
	@Then("the user-id is displayed {string}")
	public void verifyLogin(String message) {
	    
		String res = d.findElement(By.className("account")).getText();
		assertEquals(message,res);
		
	}
	
	@Then("the error message is displayed {string}")
	public void verifyError(String message) {
	    
		String res = d.findElement(By.xpath("//div[@class = 'validation-summary-errors']//li")).getText();
		assertEquals(message,res);
		
	}
	
}
