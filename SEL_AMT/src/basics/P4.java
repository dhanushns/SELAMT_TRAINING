package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import browsers.*;

public class P4 extends Launchers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaunchChrome("https://demoqa.com/alerts");
		
		d.findElement(By.xpath("//div[@id= \"javascriptAlertsWrapper\"]/div[1]/div[2]/button")).click();
		Alert a1 = d.switchTo().alert();
		System.out.println("Alert Text : " + a1.getText());
		a1.accept();
		
	}

}
