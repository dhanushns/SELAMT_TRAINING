package JDBC;

public class JDBC_CLS extends JDBC_Methods {
	
	public static void main(String[] args) throws Exception {
		
		JDBC_Methods db = new JDBC_Methods();
		
		// Create a connection to database
		db.createConnection();
		
		// Inserting student data
		@SuppressWarnings("unused")
		String query = "INSERT INTO STUD (sid, sname, phy, chem) VALUES "
				+ "(10,'Dhanush',89,91), "
				+ "(11,'Dinesh',90,93),"
				+ "(12,'Karthi',93,89),"
				+ "(13,'Priya', 78, 85),"
				+ "(14,'Naveen',90,83)";
		//if(db.insertAll(query)) System.out.println("All rows inserted successfully");

		// Reading and Displaying the data
		db.displayData();
		
		//Computing the average for all students
		db.computeAverage();
		
		System.out.println("\nAfter computing the average\n");
		db.displayData();
		
		db.closeConnetion();
		
		
	}
	

}
