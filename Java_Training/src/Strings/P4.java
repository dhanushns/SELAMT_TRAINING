package Strings;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Hi Suriya, when are you visiting us?");
		int end = s.indexOf(",");
		
		int start = 0;
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == ' ') {
				start = i;
			}
			if(i == end) break;
			
		}
		
		System.out.println(s.substring(start+1,end));
	}

}
