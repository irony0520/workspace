package ch13;

public class Box<T> {

	public T content;
	
	public T get() {
		return this.content;
		
	}
	
	public void set(T t) {
		this.content = t;
	}
	
	
}
