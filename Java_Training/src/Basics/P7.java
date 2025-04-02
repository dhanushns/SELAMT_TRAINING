package Basics;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382, rem = 0, sum = 0;
		int n = num;
		int pos = 1;
		while(num > 0) {
			if(pos % 2 != 0) {
				rem = num % 10;
				sum += rem;
			}
			num/=10;
			pos++;
		}
		System.out.println("The sum of digits in Odd positions of " + n + " : " + sum);
	}

}
