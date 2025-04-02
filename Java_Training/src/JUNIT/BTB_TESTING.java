package JUNIT;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;

import BTB.*;

import org.junit.Test;

public class BTB_TESTING extends data_functions{
	
	
	@BeforeClass
	public static void TestData() {
		
		try {
			TicketBooking.main(null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void test() {
		assertEquals(29, data.get("r01").rem_seats);
	}

}
