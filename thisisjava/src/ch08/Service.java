package ch08;

public interface Service {
	
	default void defaultMethod1() {
		
		System.out.println("defaultMethod1의 종속 코드");
		defaultCommon();
	}

	
	default void defaultMethod2() {
		
		System.out.println("defaultMethod2의 종속 코드");
		defaultCommon();
	}

	
	private void defaultCommon() {
		System.out.println("defaultMethod의 중복 코드");
	}
	
	//인터페이스 구현 - 인스턴스화 해야 사용할 수 있는 메소드
	//--
	
	
	
	static void staticMethod1() {
		System.out.println("staticMethod1의 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2의 종속 코드");
		staticCommon();
		
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 의 중복 코드");
		
	}
	//구현객체가 필요없는 메소드 
	
}
