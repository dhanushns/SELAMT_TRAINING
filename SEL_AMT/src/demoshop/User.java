package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User {
	
	
	String fn,ln,email,pass,conf_pass;
	WebDriver d;
	
	User(String fn, String ln, String email, String pass, String conf_pass, WebDriver d){
		
		this.fn = fn;
		this.ln= ln;
		this.email = email;
		this.pass = pass;
		this.conf_pass = conf_pass;
		this.d = d;
		
	}
	
	public void register() {
		
		this.d.findElement(By.linkText("Register")).click();
		if(this.d.findElement(By.tagName("h1")).getText().equals("Register")) {
			this.d.findElement(By.id("FirstName")).sendKeys(this.fn);;
			this.d.findElement(By.id("LastName")).sendKeys(this.ln);
			this.d.findElement(By.id("Email")).sendKeys(this.email);
			this.d.findElement(By.id("Password")).sendKeys(this.pass);
			this.d.findElement(By.id("ConfirmPassword")).sendKeys(this.conf_pass);
		}
		else {
			System.out.println("The expected Register page in not found");
			return;
		}
		
		this.d.findElement(By.id("register-button")).click();
		String res = this.d.findElement(By.className("result")).getText();
		if(res.equals("Your registration completed")) {
			d.findElement(By.className("register-continue-button")).click();
		}
		else {
			System.out.println("The Ex[ected Registration is failed");
		}
		
	}
	
	public void login() {
		
		this.d.findElement(By.linkText("Log in")).click();
		String res = this.d.findElement(By.tagName("h1")).getText();
		if(res.equals("Welcome, Please Sign In!")) {
			this.d.findElement(By.id("Email")).sendKeys(this.email);
			this.d.findElement(By.id("Password")).sendKeys(this.pass);
			this.d.findElement(By.className("login-button")).click();
			
		}
		if(this.d.findElement(By.className("account")).getText().equals(this.email)) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("The Expected login is not done");
		}
		
	}
	
	public void purchaseBook(String bookName,String q) {
		
		this.d.findElement(By.xpath("//ul[@class = 'list']//a[@href='/books']")).click();
		if(this.d.findElement(By.tagName("h1")).getText().equals("Books")) {
			System.out.println("The Books products page is opened as expected");
			this.d.findElement(By.id("products-orderby")).click();
			this.d.findElement(By.xpath("//div[@class = 'product-sorting']/select/option[4]")).click();
			this.d.findElement(By.linkText(bookName)).click();
			
			if(this.d.findElement(By.tagName("h1")).getText().equals(bookName)) {
				System.out.println("The Product Details as opened as expected");
				this.d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[1]")).clear();
				this.d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[1]")).sendKeys(q);
				this.d.findElement(By.xpath("//div[@class = 'add-to-cart']//input[2]")).click();
				if(this.d.findElement(By.xpath("//span[@class = 'close']")).isEnabled()) {
					System.out.println("The message is displayed as expected");
				}
				else {
					System.out.println("The message is not displayed as expected");
				}
			}
		}
		
	}

}
