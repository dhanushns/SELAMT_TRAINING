package syncronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browsers.*;

public class ExplicitWait extends Launchers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://practice.expandtesting.com/slow");
		
		WebDriverWait wt = new WebDriverWait(d,Duration.ofSeconds(15));
		
		WebElement we = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class = 'alert alert-info']/strong")));
		
		System.out.println(we.getText());
		
		
		
	}
	
}
