package JUNIT;

public class ArraySum {
	
	public int compute_sum(int[] arr) {
		
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		return sum;
		
	}
	

}
