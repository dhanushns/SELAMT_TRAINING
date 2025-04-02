package BTB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

public class data_functions {
	
	private static String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	private static String username = "root";
	private static String dbpass = "Password@12";
	private static Connection con;
	private static Statement stmt;
	private static ResultSet res;
	private static PreparedStatement ps;
	
	protected static HashMap<String,busroute> data;
	protected static HashMap<String,booking> booking;
	
	private static int bookingCounter = 0;
	
	protected static void connectDB() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(jdbcURL,username,dbpass);
		stmt = con.createStatement();
		
		data = new HashMap<String,busroute>();
		booking = new HashMap<String, booking>();
		
	}
	
	
	public static void getData() throws SQLException, ClassNotFoundException{
		
		String q = "SELECT * FROM busroute";
		res = stmt.executeQuery(q);
		while(res.next()) {
			
			String rid = res.getString("rid");
			String from_l = res.getString("from_l");
			String to_l = res.getString("to_l");
			int total_seats = res.getInt("totalseats");
			int rem_seats = res.getInt("r_seats");
			double cost = res.getDouble("cost");
			
			busroute br = new busroute(rid,from_l,to_l,total_seats,rem_seats,cost);
			data.put(rid, br);
			
		}
		
	}
	
	public static boolean putData() throws SQLException, ClassNotFoundException {
		
		for(Entry<String,booking> e : booking.entrySet()) {
			
			booking br = e.getValue();
			
			String q = "INSERT INTO booking values (?, ?, ?, ?)";
			ps = con.prepareStatement(q);
			ps.setString(1, br.bid);
			ps.setString(2, br.rid);
			ps.setInt(3, br.no_of_seats);
			ps.setDouble(4, br.totalAmount);
			if(ps.executeUpdate() > 0) {
				
				int r_seats = (data.get(br.rid).rem_seats - br.no_of_seats);
				q = "UPDATE busroute SET r_seats = ? WHERE rid = ?";
				ps = con.prepareStatement(q);
				ps.setInt(1, r_seats);
				ps.setString(2, br.rid);
				if(ps.executeUpdate() > 0) {
					data.get(br.rid).total_seats -= br.no_of_seats;
					return true;
					
				}
			}
		}
		
		return false;
	}
	
	public static boolean putData(String rid, int seats, double totalAmount) throws SQLException, ClassNotFoundException {
		
		String bookingId = "b" + ++bookingCounter;
		String q = "INSERT INTO booking values (?, ?, ?, ?)";
		ps = con.prepareStatement(q);
		ps.setString(1, bookingId);
		ps.setString(2, rid);
		ps.setInt(3, seats);
		ps.setDouble(4, totalAmount);
		if(ps.executeUpdate() > 0) {
			
			int r_seats = (data.get(rid).rem_seats - seats);
			q = "UPDATE busroute SET r_seats = ? WHERE rid = ?";
			ps = con.prepareStatement(q);
			ps.setInt(1, r_seats);
			ps.setString(2, rid);
			if(ps.executeUpdate() > 0) {
				
				booking.put(bookingId, new booking(bookingId, rid, seats, totalAmount));
				data.get(rid).rem_seats -= seats;
				return true;
				
			}
		}
		
		return false;
	}

}
