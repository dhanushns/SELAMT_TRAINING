package Collections;

public class DataStore<T> {
	
	T data;
	
	public void add(T data) {
		this.data = data;
	}
	
	public T get() {
		return this.data;
	}
	
}
