package Collections;

import java.util.LinkedList;

public class P5_LL {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> node = new LinkedList<>();
		node.add(10);
		node.add(20);
		node.add(30);
		node.add(40);
		node.add(50);
		
		System.out.println("Linked List : " + node);
		node.addFirst(100);
		System.out.println("First Element : " + node.getFirst());
		System.out.println("Last Element : " + node.getLast());
		
		node.removeLast();
		node.removeFirst();
		System.out.println("Removed Last and First : " + node);
		 
	}
	
}
