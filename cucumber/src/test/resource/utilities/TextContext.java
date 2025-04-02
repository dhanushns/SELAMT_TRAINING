package utilities;

import java.util.HashMap;
import java.util.Map;

public class TextContext {
	
	public static Map<String, Object> map;
	
	public TextContext(){
		
		map = new HashMap<String, Object>();
		
	}
	
	public void set(String key, Object value){
		
		map.put(key, value);
		
	}
	
	public Object get(String key) {
		
		return map.get(key);
		
	}
	
	public void setOrder(String key, Object value) {
		
		map.put(key, value);
		
	}
	
	
}
