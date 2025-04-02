package Collections;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class P9 {
	
	public static void main(String[] args) {
		
//		int[] num_arr = {5,90,11,2,50,43};
		List<Integer> list = Arrays.asList(12,89,56,33,44);
		
		System.out.println("Original List : " + list);
		
		Collections.sort(list);
		System.out.println("List after sorting : " + list);
		
		Collections.reverse(list);
		System.out.println("After Reversing the List : " + list);
		
	}

}
