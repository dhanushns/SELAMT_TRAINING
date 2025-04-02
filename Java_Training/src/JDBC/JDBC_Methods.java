package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.HashMap;
import java.util.Map.Entry;

public class JDBC_Methods {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	private String username = "root";
	private String dbPass = "Password@12";
	private Connection con;
	private ResultSet res;
	private PreparedStatement ps;
	private Statement stmt;
	private HashMap<Integer, Student> data;
	
	
	
	public void createConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection(jdbcURL, username, dbPass);
		this.stmt = con.createStatement();
		this.data = new HashMap<>();
		
	}
	
	public boolean insertAll(String query) throws SQLException {
		this.ps = this.con.prepareStatement(query);
		return this.ps.executeUpdate() > 0;
	}
	
	private void readData() throws SQLException {
		
		this.res = this.stmt.executeQuery("SELECT * FROM STUD");
		while(this.res.next()) {
			
			int id = this.res.getInt("sid");
			String sname = this.res.getString("sname");
			int phy = this.res.getInt("phy");
			int chem = this.res.getInt("chem");
			double avg = this.res.getDouble("avg");
			
			Student s = new Student(id, sname, phy, chem,avg);
			this.data.put(id, s);
			
		}
		
	}
	
	public void computeAverage() throws SQLException {
		
		this.res = this.stmt.executeQuery("SELECT * FROM STUD");
		while(this.res.next()) {
			
			int id = this.res.getInt("sid");
			int phy = this.res.getInt("phy");
			int chem = this.res.getInt("chem");
			
			double avg = (phy + chem)/2;
			this.data.get(id).setAvg(avg);
			
			String q = "UPDATE STUD SET avg = " + avg + " WHERE sid = " + id;
			this.ps = this.con.prepareStatement(q);
			this.ps.executeUpdate();
			
		}
		
	}
	
	public void displayData() throws SQLException {
		
		readData();
		System.out.println("SID\tSNAME\t\tPHY\tCHEM\tAVG");
		for(Entry<Integer,Student> e : this.data.entrySet()) {
			Student student = e.getValue();
			System.out.println(student.getSid() + "\t" + student.getSname() + "\t\t" + student.getPhy() + "\t" + student.getChem() + "\t" + student.getAvg());
		}
		
	}
	
	public void closeConnetion() throws SQLException {
		this.con.close();
	}

}
