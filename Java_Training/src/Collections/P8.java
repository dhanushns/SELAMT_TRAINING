package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class P8 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		map.put(1045, new Student(1045,"Senthil"));
		map.put(2344, new Student(2344,"Guna"));
		map.put(7862, new Student(7862,"Nandhini"));
		
		System.out.println(map.get(2344).getName());
		
		//iterate over the map
		for(Entry<Integer, Student> e : map.entrySet() ) {
			
			System.out.println("Student Id : " + e.getKey());
			System.out.println("Student Name : " + e.getValue().getName());
			
		}
		
	}

}
