package Collections;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private int age;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Student(int id, String name, int age){
		
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	Student() {}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void display() {
		
		System.out.println("Student name : " + this.name);
		System.out.println("Student ID   :" + this.id);
		
	}
	
	@Override
	public int compareTo(Student s) {
		return s.age - this.age; //descending order
	}
	
}
