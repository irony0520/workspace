package ch08;

public class RemoteConExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		RemoteControl rc; //인터페이스(리모트컨트롤)타입은 그 구현 클래스를 모두 담을 수 있다. 명시된 메소드만 visible(super처럼)
		
		//RemoteControl rc = new RemoteControl(); (불가능,인스턴스로 못만듬)
		
		
		rc = new Audio (); //객체 선언
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		//rc.getVolume();
		
		
		System.out.println();
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		//rc.getVolume();
		RemoteControl.changeBattery();
		
		
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
		
	

	}

}
