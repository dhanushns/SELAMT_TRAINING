package Collections;

import java.util.Vector;

public class P6_VEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Vector : " + v);
		v.remove(0);
		System.out.println("After Removing the element at 0 : " + v);
		v.add(0,100);
		System.out.println(v);
		  
	}

}
