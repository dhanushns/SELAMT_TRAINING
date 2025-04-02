package cookies;

import org.openqa.selenium.Cookie;

import browsers.*;

public class Basic extends Launchers{
	
	public static void deleteCookie(String cookieName) {
		
		d.manage().deleteCookieNamed(cookieName);
		
	}
	
	public static void displayCookies() {
		
		for(Cookie c : d.manage().getCookies()) {
			
			System.out.println("Cookie Name : " + c.getName() + "| Cookie Value : " + c.getValue());
			
		}
		
	}
	
	public static void addCookie(String name, String value) {
		
		Cookie cookie = new Cookie(name,value);
		d.manage().addCookie(cookie);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://flipkart.com");
		addCookie("UserSession","1234");
		addCookie("Place","Bangalore");
		addCookie("Page","Product Page");
		
		displayCookies();
		deleteCookie("Place");
		
		if(d.manage().getCookieNamed("Place") == null) {
			System.out.println("Cookie Deleted Successfully");
		}
		else {
			System.out.println("Cookie not deleted");
		}
		
		CloseLaunchers();
		
	}
	
}
