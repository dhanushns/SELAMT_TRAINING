package BTB;

public class busroute {
	
	public String rid, from_l, to_l,bid;
	public int total_seats,rem_seats, no_of_seats;
	public double cost;
	
	busroute(String rid, String from_l, String to_l, int total_seats, int rem_seats, double cost){
		
		this.rid = rid;
		this.from_l = from_l;
		this.to_l = to_l;
		this.total_seats = total_seats;
		this.rem_seats = rem_seats;
		this.cost = cost;
		
	}
	
	busroute(String bid, String rid, int no_of_seats, double cost){
		
		this.bid = bid;
		this.rid = rid;
		this.no_of_seats = no_of_seats;
		this.cost = cost;
	}
	
	
}
