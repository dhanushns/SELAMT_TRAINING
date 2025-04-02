package OOPS;

class Student{
	
	private String name;
	private int id, mark_cc, mark_ml;
	
	private double avgScore;
	
	Student(String name, int id, int mark_cc, int mark_ml){
		this.name = name;
		this.id = id;
		this.mark_cc = mark_cc;
		this.mark_ml = mark_ml;
	}
	
	Student() {}


	public int getMark_cc() {
		return mark_cc;
	}


	public void setMark_cc(int mark_cc) {
		this.mark_cc = mark_cc;
	}


	public int getMark_ml() {
		return mark_ml;
	}


	public void setMark_ml(int mark_ml) {
		this.mark_ml = mark_ml;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
	
	public double getAvg() {
		return avgScore;
	}
	
	public void setAvg(double avgScore) {
		
		this.avgScore = avgScore;
		
	}
	
	
	public void computeAvearge() {
		
		this.avgScore = (this.mark_cc + this.mark_ml)/2;
		
	}
	
	
}
