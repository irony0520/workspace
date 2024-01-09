package ch06;

public class Car {
	
	String model = "현대 자동차";
	int speed = 60;
	boolean start = true; //필드 선언
	
	{
		
		speed = 30;//
		model = "기아 자동차"; //디폴트 > 명시적 초기화 >초기화 블록 > 생성자 (오른쪽으로갈수록 우선순위증가)
	}

	Car () {  
		model = "자동차";   //메소드 선언
	}
	
//	Car (int s) {
//		speed = s;  //실행 클래스에서 변수가 하나 입력되면 이 생성자가 출력됨(알아서선택됨
//	}
	
	Car (int speed) {
		this.speed = speed;  //this는 이 위 클래스의 스피드, 오른쪽은 생성자의 매개변수
	}
	
	
	Car(String model) {
		this(model, 60, true);
	}
	
//	Car (String model) {
//		model = m;  //이름이 동일한경우 찾는게불가능
//	}
//	
//	
	
	Car (String model, int speed, boolean start) {
		this.model = model;
		this.speed = speed;
		this.start = start; //println같은 경우에도 정수 문자열 불리안 실수 다 알아서 출력해주는 오버로딩
	}
	
//	Car (String m, boolean st, int s) {
//		model = m;
//		speed = s;
//		start = st; //순서가 바뀌어도 가능
//	}
	
	String drive(String name) {
		return name + "을 태우고 " + this.speed + "의 속도로 출발합니다. ";
	}
	
	
}
