package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.*;

public class ASS_3 extends Helpers {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://practice.expandtesting.com/large");
		
		WebElement web1 = d.findElement(By.xpath("//table[@id='large-table']//tr[10]/td[10]"));
		
		System.out.println(web1.getText());
		
		CloseLaunchers();
		
	}
	
}
