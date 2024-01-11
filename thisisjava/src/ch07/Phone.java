package ch07;

public class Phone {

	//필드 선언
	public String model;
	public String color;
	
	
	
	public Phone() {
		System.out.println("Phone 기본 생성자");
	}
	//생성자 
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String,String)의 기본 생성자");
	}
	
	//메소드 선언
	
	public void bell() {
		System.out.println("벨이 울립니다.");
		}
	
	public void sendVoice(String message ) {
		System.out.println("나: " + message);
		}
	
	public void receiveVoice(String message) {
		System.out.println("상대: " + message);
		}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
		}
	
}
