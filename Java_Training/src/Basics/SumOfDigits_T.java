package Basics;

public class SumOfDigits_T {

	public static int compute(int num) {
		
		int rem = 0, sum = 0;
		
		while(num > 0) {
			rem = num % 10;
			sum += rem;
			num/=10;
		}
		return sum;
	}

}
