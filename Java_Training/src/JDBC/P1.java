package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpass = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpass);
		Statement smt = con.createStatement();
		
		String q = "select * from s5";
		ResultSet rs = smt.executeQuery(q);
		
		while(rs.next()) {
			int id = rs.getInt("sid");
			String name = rs.getString("sname");
			System.out.println(id + " " + name);
		}
		
		con.close();
		

	}

}
