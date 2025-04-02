package Collections;

import java.util.ArrayList;

public class P3_ASS_1 {
	
public static void main(String[] args) {
	
		ArrayList<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile("Samsung","X1",8000,8));
		mobiles.add(new Mobile("Oppo","A54",11000,4));
		mobiles.add(new Mobile("Samsung","X2",15000,4));
		mobiles.add(new Mobile("Apple","pro",30000,16));
		mobiles.add(new Mobile("Apple","mini-pro",35000,16));
		mobiles.add(new Mobile("Samsung","X3",25000,8));
		mobiles.add(new Mobile("Redmi","R2",9000,8));
		mobiles.add(new Mobile("Samsung","F4",10000,4));
		mobiles.add(new Mobile("Apple","15-pro",45000,16));
		mobiles.add(new Mobile("Oppo","A11",17000,8));
		
		ASS_1.find_mobile_by_brand("Samsung",mobiles);
		ASS_1.display_mobile_details(15000.0,20000.0,mobiles);
		ASS_1.display_mobile_details(6,10000,mobiles);
		
	}

}
