package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class P10 {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(10,"Senthil",23));
		list.add(new Student(11,"Guna",34));
		list.add(new Student(12,"Velu",42));
		list.add(new Student(13,"Anbu",26));
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
		System.out.println();
		
		Collections.sort(list);
		
		System.out.println("After Sorting with compareTo()");
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
	}
	
}
