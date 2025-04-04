package testNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class ListenersExample {
	
	@Test
	public void test1() {
		
		assertTrue(true);
		
	}
	
	@Test
	public void test2() {
		
		assertTrue(false);
		
	}
	
}
