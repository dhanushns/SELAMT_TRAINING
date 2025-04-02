package Collections;

public class P4_Generic {
	
	public static void main(String[] args) {
		
		DataStore<Integer> numStore = new DataStore<>();
		numStore.add(20);
		System.out.println("Integer Store : " + numStore.get());
		
		DataStore<String> strStore = new DataStore<>();
		strStore.add("Mphasis");
		System.out.println("String Store : " + strStore.get());
		
	}

}
