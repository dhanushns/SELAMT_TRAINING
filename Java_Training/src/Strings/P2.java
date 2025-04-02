package Strings;

public class P2 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("I am Work With Mphasis at Bangalore");
		int count = 1;
		for(int i = 0 ; i < sb.length(); i++) {
			
			if(sb.charAt(i) == ' ') {
				count++;
			}
			
		}
		
		System.out.println("No.of Words : " + count);
		
	}
	
}
