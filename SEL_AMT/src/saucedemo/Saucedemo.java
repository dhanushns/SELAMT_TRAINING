package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo extends MAIN {
	
	public String validLogin(String username,String pass) {
		
		WebDriver ch = new ChromeDriver();
		
		ch.get("https://www.saucedemo.com");
		
		ch.findElement(By.id("user-name")).sendKeys(username);
		ch.findElement(By.id("password")).sendKeys(pass);
		ch.findElement(By.id("login-button")).click();
		
		return ch.findElement(By.className("title")).getText();
	}
	
	public String inValidLogin(String username,String pass) {
		
		WebDriver ch = new ChromeDriver();
		
		ch.get("https://www.saucedemo.com");
		
		ch.findElement(By.id("user-name")).sendKeys(username);
		ch.findElement(By.id("password")).sendKeys(pass);
		ch.findElement(By.id("login-button")).click();
		
		return ch.findElement(By.tagName("h3")).getText();
	}

}
