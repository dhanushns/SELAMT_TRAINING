package Collections;

import java.util.Arrays;

public class Arrays_Utility {
	
	
	public static void display(int[] a) {
		
		for(int e : a) {
			
			System.out.println(e + " ");
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int[] ar = {20,19,18,16,15,10};
		
		display(ar);
		
		Arrays.sort(ar);
		
		int pos = Arrays.binarySearch(ar, 18);
		System.out.println("Position : " + pos);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 5);
		
		System.out.println("Arrays Fill");
		display(arr1);
		
		boolean f = Arrays.equals(arr1,arr2);
		System.out.println("Array Equal : " + f);
		
		String s = Arrays.toString(arr1);
		System.out.println("Arrays to String : " + s);
		
		
	}

}
