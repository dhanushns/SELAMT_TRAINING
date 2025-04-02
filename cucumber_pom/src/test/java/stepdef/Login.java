package stepdef;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.LoginPage;
import pom_pages.ProductPage;
import utilities.*;

public class Login extends Helpers{	
	
	LoginPage login;
	
	@Given("The login page is diplayed")
	public void initiateLogin() {
	    
		LaunchChrome("https://www.saucedemo.com/");
		login = new LoginPage(d);
		
	}
	@When("user enters {string} and {string}")
	public void enterCredentials(String username, String pwd) {
	    
		login.sendUsername(username);
		login.sendPassword(pwd);
		
	}
	@When("user click the login button")
	public void clickLogin() {
	   
		login.clickLogin();
		
	}
	@Then("the page title is displayed {string}")
	public void verifyMessage(String message) {
		
		ProductPage page = new ProductPage(d);
		String res = page.getTitle();
		assertEquals(res,message);
		CloseLaunchers();
		
	}
	
	@Then("the error message is displayed {string}")
	public void verifyErrorMessage(String message) {
		
		String res = login.getErrorMessage();
		assertEquals(res,message);
		CloseLaunchers();
		
	}
	
}
