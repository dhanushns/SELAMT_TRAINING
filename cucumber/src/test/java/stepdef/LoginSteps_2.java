package stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.*;

public class LoginSteps_2 extends Helpers {
	
	TextContext textContext;
	
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void userActions(String username, String password) {
		
		d.findElement(By.id("user-name")).sendKeys(username);
		d.findElement(By.id("password")).sendKeys(password);
		
		textContext = new TextContext();
		textContext.set(ScenarioContext.USERNAME.toString(), username);
		textContext.set(ScenarioContext.PASSWORD.toString(), password);
		textContext.set(ScenarioContext.SESSION_ID.toString(), "LKJHLSDIFH");
		
	}
	
	@When("user click the login button")
	public void user_click_the_login_button() {
	   d.findElement(By.id("login-button")).click();
	}
	
	@Then("the message is displayed {string}")
	public void testPageTitle(String message) {
		if(message.equals("Products")) {
			String pageTitle = d.findElement(By.xpath("//span[@class='title']")).getText();
			assertEquals(pageTitle, "Products");
		}
		else {
			String err_msg = d.findElement(By.tagName("h3")).getText();
			assertEquals(err_msg,message);
		}
		CloseLaunchers();
		
		String username = (String) textContext.get(ScenarioContext.USERNAME.toString());
		String pwd = (String) textContext.get(ScenarioContext.PASSWORD.toString());
		String session_id = (String) textContext.get(ScenarioContext.SESSION_ID.toString());
		
		System.out.println("Username : " + username);
		System.out.println("Password : " + pwd);
		System.out.println("Session Id : " + session_id);
		
		System.out.println(textContext.map);
		
		
	}
	
}
