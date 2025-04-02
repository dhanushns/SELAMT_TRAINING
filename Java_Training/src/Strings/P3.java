package Strings;

import java.util.ArrayList;

public class P3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder("I am Work With Mphasis at Bangalore");
		
		int start = -1, end = 0;
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(sb.charAt(i) != ' ' && start == -1) {
				start = i;
			}
			else if(sb.charAt(i) == ' '){
				end = i;
				res.add(sb.substring(start,end));
				start = -1;
			}
			
			if(i == sb.length()-1 && sb.charAt(i) != ' ') {
				
				res.add(sb.substring(start,i+1));
				
			}
			
			
		}
		
		System.out.println(res);
		
	}

}
