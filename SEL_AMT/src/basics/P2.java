package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver ch = new ChromeDriver();
		
		ch.get("https://www.saucedemo.com/");
		
		ch.findElement(By.id("user-name")).sendKeys("standard_user");
		ch.findElement(By.id("password")).sendKeys("secret_sauce");
		ch.findElement(By.id("login-button")).click();
		
		// Using XPath locator
		String titleByXpath = ch.findElement(By.xpath("//span[@class = 'title']")).getText();
		
		//Using CSS locator
		String titleByCss = ch.findElement(By.cssSelector("span.title")).getText();
		
		System.out.println("Xpath : " + titleByXpath);
		System.out.println("CSS : " + titleByCss);
		
		if(titleByXpath.equals("Products")) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Failed");
		}
		
	}

}
