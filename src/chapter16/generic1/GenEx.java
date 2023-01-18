package chapter16.generic1;

public class GenEx<T> { //type

	T value;
	
	public T getValue() {
		
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
		
	}
	
}
