package syncronizations;

import java.time.Duration;

import org.openqa.selenium.By;

import browsers.*;

public class ImplicitWait extends Launchers {
	
	public static void main(String[] args) {
		
		
		LaunchChrome("https://practice.expandtesting.com/slow");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(d.findElement(By.xpath("//p[@class = \"alert alert-info\"]/strong")).getText());
		
		
	}
	
}
