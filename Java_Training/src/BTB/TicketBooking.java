package BTB;

import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.Scanner;

public class TicketBooking extends data_functions{
	
	static Scanner input = new Scanner(System.in);
	
	public TicketBooking() throws SQLException, ClassNotFoundException{
		
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		connectDB();
		getData();
		
		String route = "exit";
		
		do {
			
			DisplayRoutes();
			System.out.print("\nEnter the route id (exit) : ");
			route = input.next();
			if(isValidRouteId(route) && !route.equals("exit")) {
				System.out.println("\nEnter no.of.seats : ");
				int seats = input.nextInt();
				book_seat(route,seats);
			}
			else {
				System.out.println("\n*** Invalid route id / Type exit to stop ***\n");
			}
			
		}while(!route.equals("exit"));
		
		
	}
	
	public static boolean isValidRouteId(String rid) {
		
		return data.keySet().contains(rid);
		
	}
	
	public static void book_seat(String rid, int seats) throws SQLException, ClassNotFoundException {
		
		double totalAmount = calculate_bookingAmount(rid,seats);
		if(putData(rid, seats, totalAmount)) {
			System.out.println("\n **** Your booking has been confirmed ****\n");
		}
		
	}
	
	public static double calculate_bookingAmount(String rid, int seats) {
		
		double cost = data.get(rid).cost;
		return cost * seats;
		
	}
	
	public static void DisplayRoutes() {
		
		System.out.println("RID\tFROM\t\tTO\tTOTAL_SEATS\tREM_SEATS\tCOST");
		for(Entry<String,busroute> e : data.entrySet()) {
			
			busroute br = e.getValue();
			System.out.println(br.rid + "\t" + br.from_l + "\t\t" + br.to_l + "\t\t" + br.total_seats + "\t\t" + br.rem_seats + "\t" + br.cost);
			
		}
		
	}

}
