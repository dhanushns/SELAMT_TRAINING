package Collections;

import java.util.ArrayList;

public class P2 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(35,"Anbu"));
		students.add(new Student(56,"Guna"));
		students.add(new Student(12,"Velu"));
		
		students.get(0).display();
		
		for(Student s : students) {
			
			if(s.getId() == 35) {
				
				System.out.println("Student name : " + s.getName() + " with id " + s.getId());
				
			}
			
		}
		
		
	}
	

}
