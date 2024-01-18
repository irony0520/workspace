package ch13;

public class Fruits<K>{

	
	private K kind;
	
	
	private K[] arr; //제네릭으로 객체 선언 불가능,참조변수는 가능
	
	
	public static <T,K> String method1(T t, K k) {
		return t + " " + k;
	}
	
	
	public <K> K method2(K k) {
		return k;
	}
	
	public void set(K obj) {
		this.kind = obj;
		
		
	}
	
	public K get() {
		return this.kind;
	}
	
	
}
