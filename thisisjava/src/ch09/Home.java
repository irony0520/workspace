package ch09;

public class Home {

	RemoteControl rc = new RemoteControl() {//new 인터페이스() --> 리턴:"구현"객체(인스턴스)
		@Override 
		public void turnOn() {
			System.out.println("전원을 켭니다.");
			}
			
		public void turnOff() {
			System.out.println("전원을 끕니다.");
			}
		
		};
	//1회성
	
	
	RemoteControl rc2 = new RemoteControlImpl() {	//new 클래스() -> 리턴: 상속객체(인스턴스)
		
		public void volumeUp() {
			System.out.println("볼륨을 높입니다.");
		}
	};
	//rc, rc2 = 필드선언



public void useRemoteControl(RemoteControl rc) {
	rc.turnOn();
	rc.turnOff();
};



}