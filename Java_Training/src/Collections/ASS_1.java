package Collections;

import java.util.ArrayList;

public class ASS_1 {
	
public static void find_mobile_by_brand(String brand, ArrayList<Mobile> mobiles) {
		
		System.out.println("\nMobile Of Brand Samsung");
		
		for(Mobile m : mobiles) {
			
			if(m.brand == brand) {
				
				System.out.println("###########################");
				System.out.println("Mobile Brand " + m.brand);
				System.out.println("Mobile Model " + m.Model);
				System.out.println("Mobile Ram " + m.ram);
				System.out.println("Mobile Price " + m.price);
				
			}
			
		}
		
	}
	
	public static void display_mobile_details(double price_ll, double price_ul, ArrayList<Mobile> mobiles) {
		
		System.out.println("\nMobile Price btw 15,000 - 20,000");
		
		for(Mobile m : mobiles) {
			
			if(m.price >= price_ll && m.price <= price_ul) {
				
				System.out.println("###########################");
				System.out.println("Mobile Brand " + m.brand);
				System.out.println("Mobile Model " + m.Model);
				System.out.println("Mobile Ram " + m.ram);
				System.out.println("Mobile Price " + m.price);
				
			}
			
		}
		
	}
	
	public static void display_mobile_details(int ram, double price, ArrayList<Mobile> mobiles) {
		
		System.out.println("\nMoblie details of ram > 6gb and price < 10,000");
		
		for(Mobile m : mobiles) {
			
			if(m.ram > 6 && m.price < price) {
				
				System.out.println("###########################");
				System.out.println("Mobile Brand " + m.brand);
				System.out.println("Mobile Model " + m.Model);
				System.out.println("Mobile Ram " + m.ram);
				System.out.println("Mobile Price " + m.price);
				
			}
			
		}
		
	}
	
}
