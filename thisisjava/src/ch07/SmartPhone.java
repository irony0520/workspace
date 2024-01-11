package ch07;

public class SmartPhone extends Phone{
	//Phone 클래스에서 생성자 만들어줘야 실행 
	//필드 선언
	public boolean wifi;
	
	
	SmartPhone(){	
		super();
		System.out.println("SmartPhone의 기본 생성자"); //super위에 입력할시 에러(super먼저 실행되어야함)
	} //여기까진 자동으로 생성 (부모의 기본생성자)
	
	SmartPhone(String model, String color) {
//		super.color = color;
//	super.model = model; 이것도 가능은함
		super(model,color);
		System.out.println(("SmartPhone(String,String)의 기본 생성자"));
		
	}
	
	
	SmartPhone(String model, String color, boolean wifi){
		super(model,color);
		this.wifi = wifi;
		
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경합니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	
}
