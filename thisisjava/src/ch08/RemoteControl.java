package ch08;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; //(public static final)이 붙어있는상태

	public void turnOn();
	void turnOff();
	void getVolume();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음모드를 해제합니다");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

		
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//라디오, 티비의 실행법
	//라디오 텔레비전 객체를 알 필요도 없고 알지도 못하는 상황 인터페이스라는 벽이 가로막고있고 인터페이스가 존재한다는것만 중요
	
	

