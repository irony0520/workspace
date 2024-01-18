package ch13;

public class Container<T,S> {
	

//	public T content;
//	
//	public T get() {
//		return this.content;
//		
//	}
//	
//	public void set(T content) {
//		this.content = content;
//	}

	private T key;
	private S value;

	public T getKey() {
		return this.key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public S getValue() {
		return this.value;
	}
	public void setValue(S value) {
		this.value = value;
	}
	
	
	
	
}
