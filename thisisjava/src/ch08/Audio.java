package ch08;

public class Audio implements RemoteControl{
	
	
	private int volume;
	private int memoryVolume;
	@Override
	
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	@Override
	
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}
	
	@Override
	
	public void getVolume() {
		System.out.println(this.volume);
	}
	
	
	@Override
	
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}  //상속이랑 똑같은 개념
		
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
		
		this.volume = volume;
		}
		System.out.println("현재 AUDIO 볼륨: " + this.volume);
	}

	@Override 
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			//원래 볼륨 저장
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음모드를 해제합니다");
			setVolume(this.memoryVolume);
					
		}
		
	}
	
}
