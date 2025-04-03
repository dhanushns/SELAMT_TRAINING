
import org.openqa.selenium.By;

import utilities.*;

public class ASS_6 extends Helpers{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LaunchChrome("https://jqueryui.com/checkboxradio/");
		d.switchTo().frame(0);
		
		d.findElement(By.cssSelector("fieldset label[for='radio-3']")).click();
		d.findElement(By.cssSelector("fieldset label[for='checkbox-3']")).click();
		d.findElement(By.cssSelector("fieldset label[for='checkbox-4']")).click();
		
		CloseLaunchers();
		
	}

}
