package OOPS;

public class P12_RP {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.start();
		
		Bike b = new Bike();
		b.start();
		
	}
	
}


class Vehicle{
	
	public void start() {
		
		System.out.println("Vehicle Started from Parent Class");
		
	}
	
}

class Bike extends Vehicle{
	
	public void start() {
		
		System.out.println("Bike Started from Child Class");
		
	}
	
}