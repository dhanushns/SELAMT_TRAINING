package saucedemo;


public class MAIN {
	
	public static void main(String[] args) {
		
		Saucedemo demo = new Saucedemo();
		
		//Valid data pass
		if(demo.validLogin("standard_user", "secret_sauce").equals("Products")) {
			System.out.println("Valid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("Valid Login Credentials : Test Case - Fail");
		}
		
		
		//valid data fail
		if(demo.validLogin("standard_user", "secret_sauce").equals("Flower")) {
			System.out.println("Valid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("Valid Login Credentials : Test Case - Fail");
		}
		
		
		//invalid data pass
		if(demo.inValidLogin("standard_user", "123").equals("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("In-Valid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("In-Valid Login Credentials : Test Case - Fail");
		}
		
		//invalid data pass
		if(demo.inValidLogin("standard_user", "123").equals("Sucess")) {
			System.out.println("In-valid Login Credentials : Test Case - Pass");
		}
				else {
			System.out.println("In-Valid Login Credentials : Test Case - Fail");
		}

	}

}
