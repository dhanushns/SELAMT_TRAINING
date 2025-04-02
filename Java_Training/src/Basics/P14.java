package Basics;

import java.util.Arrays;

public class P14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,45,12,23};
		
		//binary search
		Arrays.sort(numbers);
		System.out.println("\nBinary Search");
		System.out.println("Position of 45 : " +  Arrays.binarySearch(numbers, 45));
				
	}
}
