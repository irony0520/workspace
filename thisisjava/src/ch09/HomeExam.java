package ch09;

public class HomeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Home home = new Home();
		
		home.rc.turnOn();
		home.rc.turnOff();
		
		
		//RemoteControl rc = new RemoteControlImpl();
		
		RemoteControl rc = (new RemoteControl() {
			@Override 
			public void turnOn() {
				System.out.println("전원을 켭니다");
			}
			
			@Override 
			public void turnOff() {
				System.out.println("전원을 끕니다");
			}
		
		
		home.useRemoteControl(rc);
	

			}
	});
}
