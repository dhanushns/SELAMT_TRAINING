package JDBC;

public class Student extends JDBC_Methods{

	private int sid, phy, chem;
	private String sname;
	private double avg;
	
	Student(int sid, String sname, int phy, int chem, double avg){
		this.sid = sid;
		this.sname = sname;
		this.phy = phy;
		this.chem = chem;
		this.avg = avg;
	}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getSid() {
		return sid;
	}

	public int getPhy() {
		return phy;
	}

	public int getChem() {
		return chem;
	}
	
}
