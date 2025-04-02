package Collections;

import java.util.ArrayList;
public class P1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grape");
		fruits.add("Pineapple");
		
		System.out.println("Fruist in 2nd Position : " + fruits.get(1));
		
		fruits.add(2,"Banana");
		System.out.println("After Inserted a new fruit : " + fruits);
		
		for(String f : fruits) {
			
			System.out.print(f + ",");
			
		}
		
		
	}
	
}
