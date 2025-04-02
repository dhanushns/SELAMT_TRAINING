package testNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"F1","F2"})
	public void test1() {
		
		System.out.println("Test Execution of F1 & F2 Groups");
		
	}
	
	@Test(groups = {"F2"})
	public void tets2() {
		System.out.println("Test Excetion of F2 Group");
	}
	
	@Test(groups = {"F1"})
	public void test3() {
		
		System.out.println("Test Execution of F1 group");
		
	}
	
	@Test(groups = {"F2"})
	public void test4() {
		
		System.out.println("Test Execution of F2 group");
		
	}
	
	@Test(groups = {"F3"})
	public void test5() {
		
		System.out.println("Test Execution of F3 group"); // not included in xml
		
	}

}
