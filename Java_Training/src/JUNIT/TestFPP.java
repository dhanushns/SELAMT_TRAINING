package JUNIT;

import static org.junit.Assert.*;

import AUT_FPP.Main;
import AUT_FPP.Flipkart_Inventry;

import org.junit.Test;

import java.util.ArrayList;

public class TestFPP {

	@Test
	public void t() {
		
		ArrayList<Flipkart_Inventry> testBill = new ArrayList<Flipkart_Inventry>();
		testBill.add(new Flipkart_Inventry(785,"Desktops",14000,2,"Hp"));
		
		
		ArrayList<Flipkart_Inventry> userBill = Main.display_products();
		
		assertTrue(testBill.get(0).product_id == userBill.get(0).product_id);
		
		
	}

}
