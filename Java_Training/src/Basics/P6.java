package Basics;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382, rem = 0, sum = 0;
		int n = num;
		while(num > 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				sum+=rem;
			}
			num/=10;
		}
		System.out.println("The Sum of even digits of " + n + " : " + sum);
	}

}
