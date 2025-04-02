package OOPS;

public class P3 {
	public static void main(String[] args) {
	
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
		d1.bark();
		
	}
}

class Animal{
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("Barking");
	}
	
}
