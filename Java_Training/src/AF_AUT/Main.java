package AF_AUT;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<String> union_ter = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		union_ter.add("ladakh");
		union_ter.add("andaman");
		union_ter.add("delhi");
		union_ter.add("bangalore");
		union_ter.add("goa");
		union_ter.add("pondicherry");
		union_ter.add("jammu and kashmir");
		union_ter.add("mumbai");
		
		
		String name,location;
		int age;
		boolean isPWD;
		
		System.out.println("Welcome to the Armed Force Requirement Process\n");
		System.out.print("Enter your name : ");
		name = input.nextLine();
		System.out.print("Enter your age : ");
		age = input.nextInt();
		System.out.print("Enter your location : ");
		input.nextLine();
		location = input.nextLine();
		System.out.println("Are you person with disablitiy (y / n) : ");
		isPWD = input.next().charAt(0) == 'y';
		
		if(isValid(age) && isValid(location) && !isPWD ) {
			System.out.println(name.toUpperCase() + " your are eligible");
		}
		else {
			System.out.println(name.toUpperCase() + " you are not eligible");
		}
		
		
		
		input.close();
		
		
	}
	
	public static boolean isValid(int age) {
		
		return (age >= 18 && age <= 37);
		
	}
	
	public static boolean isValid(String location) {
		return !union_ter.contains(location);
	}
	
	

}
