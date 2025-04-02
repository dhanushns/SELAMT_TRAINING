package OOPS;

public class P7 {
	public static void main(String[] args) {
		
		ICICI icici = new ICICI();
		CITI citi = new CITI();
		
		System.out.println("ROI of ICICI" + icici.getRateOfInterest());
		System.out.println("ROI of ICICI" + citi.getRateOfInterest());
		
		icici.nonAbstractMehod();
		
	}
}


abstract class Abstract_Bank_Class{
	
	abstract int getRateOfInterest();
	
	public void nonAbstractMehod() {
		
		System.out.println("Non Abstract Method");
		
	}
	
}

class ICICI extends Abstract_Bank_Class{
	
	int getRateOfInterest() {
		
		return 2;
		
	}
	
}

class CITI extends Abstract_Bank_Class{
	
	int getRateOfInterest() {
		return 3;
	}
	
}