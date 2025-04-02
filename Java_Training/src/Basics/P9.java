package Basics;

import java.util.Scanner;

public class P9 {
	
	public static int compute_factorial(int num) {
		int fact = 1;
		for(int j = 1 ; j <= num; j++) {
			fact *= j;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] fact_array = new int[5][2];
		for(int i = 0; i < 5 ; i++) {
			int num = input.nextInt();
			fact_array[i][0] = num;
			fact_array[i][1] = compute_factorial(num);
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(fact_array[i][0] + " factorial is : " + fact_array[i][1]);
		}
		input.close();
	}

}
