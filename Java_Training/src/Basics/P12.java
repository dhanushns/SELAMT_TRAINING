package Basics;

import java.util.Arrays;

public class P12 {
	
	public static void main(String[] args) {
		int[] numbers = {10,45,12,23};
		
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		
		//Built-in method for array for sorting
		Arrays.sort(numbers);
		System.out.print("\nSorted Array : ");
		for(int n : numbers) {
			System.out.print(n + " ");
		}
		
		
	}

}
