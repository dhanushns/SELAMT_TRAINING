package stepdef_2;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

public class Orders extends Helpers{
	
	@When("user clicks order link")
	public void clickOrders() {
		
		d.findElement(By.xpath("//div[@class = 'column my-account']//li[2]/a")).click();
		
	}
	
	@Then("verify the order number")
	public void veifyOrder() {
		
		String exp_Ordernum = (String)TextContext.map.get(ScenarioContext.ORDER_NO.toString());
		String res = d.findElement(By.xpath("//div[@class = 'section order-item'][1]/div/strong")).getText();
		res = res.split(":")[1].trim();
		assertEquals(exp_Ordernum,res);
		
	}
	
}
