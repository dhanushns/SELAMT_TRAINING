package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(10,"Senthil",23));
		list.add(new Student(29,"Guna",34));
		list.add(new Student(30,"Velu",42));
		list.add(new Student(1,"Anbu",26));
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
		System.out.println();
		
		// Method 1
		Collections.sort(list, new NameComparator());
		
		
		System.out.println("Sorting with name comparator");
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
		//Method 2 lambda expression based on age
		System.out.println();
		System.out.println("Sorting with age lambda exp");
		Collections.sort(list, (s1,s2) -> Integer.compare(s1.getAge(),s2.getAge()));
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
		//Method 3
		System.out.println();
		System.out.println("Sorting with name then by age");
		list.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
		
		
		for(Student l : list) {
					
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
					
		}
		
		System.out.println();
		
		Collections.sort(list, new IdComparator());
		
		System.out.println("Sorting with Id comparator");
		
		for(Student l : list) {
			
			System.out.println(l.getId() + " " + l.getName() + " " + l.getAge());
			
		}
		
	}

}
