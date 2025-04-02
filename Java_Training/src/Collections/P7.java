package Collections;

import java.util.HashMap;

public class P7 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Senthil");
		map.put(2, "Guna");
		map.put(3, "Velu");
		
		//Hashmap allows null keys and values
		map.put(null, null);
		map.put(null, "Null Values");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
		
	}
	
}
