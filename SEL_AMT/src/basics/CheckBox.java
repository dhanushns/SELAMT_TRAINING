package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/");
		d.findElement(By.linkText("Checkboxradio")).click();
		WebElement we = d.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		d.switchTo().frame(we);
		
		d.findElement(By.xpath("//fieldset[1]/label[1]")).click();
		d.findElement(By.xpath("//fieldset[1]/label[2]")).click();
		d.findElement(By.xpath("//fieldset[1]/label[3]")).click();
		
		d.findElement(By.xpath("//fieldset[2]/label[1]")).click();
		d.findElement(By.xpath("//fieldset[2]/label[2]")).click();
		d.findElement(By.xpath("//fieldset[2]/label[3]")).click();
		d.findElement(By.xpath("//fieldset[2]/label[4]")).click();
		
		d.findElement(By.xpath("//fieldset[3]/label[1]")).click();
		d.findElement(By.xpath("//fieldset[3]/label[2]")).click();
		d.findElement(By.xpath("//fieldset[3]/label[3]")).click();
		d.findElement(By.xpath("//fieldset[3]/label[4]")).click();
		
	}

}
