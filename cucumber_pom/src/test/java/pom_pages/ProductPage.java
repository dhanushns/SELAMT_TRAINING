package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver d;
	
	@FindBy(xpath=("//span[@class = 'title']"))
	WebElement title;
	
	
	public ProductPage(WebDriver d) {
		
		this.d = d;
		PageFactory.initElements(d, this);
		
	}
	
	public String getTitle() {
		
		return title.getText();
		
	}
	
}
