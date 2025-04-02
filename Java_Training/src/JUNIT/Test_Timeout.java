package JUNIT;


import org.junit.Test;

public class Test_Timeout {

	@Test(timeout = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(1900);
	}

}
