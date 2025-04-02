package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String jdbURL = "jdbc:mysql://localhost:3306/mydb1";
		String username = "root";
		String dbpass = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(jdbURL,username,dbpass);
		Statement stmt = con.createStatement();
		
		String q = "delete from s5 where sid = (?)";
		PreparedStatement ptmt = con.prepareStatement(q);
		
		ptmt.setInt(1, 114);
		
		if(ptmt.executeUpdate() > 0) {
			System.out.println("One Row Deleted successfully");
		}
		
		q = "select * from s5";
		ResultSet res = stmt.executeQuery(q);
		
		System.out.println("ID\tName\t\tMarks\tDep Id");
		
		while(res.next()) {
			
			int id = res.getInt("sid");
			String name = res.getString("sname");
			int marks = res.getInt("marks");
			int deptid = res.getInt("deptid");
			
			if(id == 100 || id == 101) {
				System.out.println(id + "\t" + name + "\t" + marks + "\t" + deptid);
			}
			else {
				System.out.println(id + "\t" + name + "\t\t" + marks + "\t" + deptid);
			}
			
		}
		
				
		
	}

}
