package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver d;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id = 'login-button']")
	WebElement loginBtn;
	
	public LoginPage(WebDriver d){
		
		this.d = d;
		PageFactory.initElements(d,this);
		
	}
	
	public void sendUsername(String uname) {
		
		username.sendKeys(uname);
		
	}
	
	public void sendPassword(String pwd) {
		
		password.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		
		loginBtn.click();
		
	}
	
}
