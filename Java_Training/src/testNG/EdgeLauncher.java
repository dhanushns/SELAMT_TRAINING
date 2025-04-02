package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;
import browsers.*;


public class EdgeLauncher extends Launchers {
	
	@Test
	public void login() {
		
		LaunchEdge("https://demowebshop.tricentis.com/");
		LocalDateTime current_dateTime = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
		String time = current_dateTime.format(formater);
		
		System.out.println(time);
		
	}
	
}
