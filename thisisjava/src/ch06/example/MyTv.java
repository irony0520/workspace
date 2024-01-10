package ch06.example;

public class MyTv {

	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		if(isPowerOn = true) {
			isPowerOn = false;
		}else {
			isPowerOn = true;
		}
	}
	
	void volumeUp() {
		if(this.volume < MAX_VOLUME) {
			volume =  volume +1;}
			else {
				volume = 100;
			}
		}
	void volumeDown() {
		if(this.volume > MIN_VOLUME) {
			volume =  volume -1;}
			else {
				volume = 0;
			}
	}
	
	void channelUp() {
		if(this.channel >MAX_CHANNEL) {
			channel = 1;
		}else {
			channel = channel+1;
		}
	}
	
	void channelDown() {
		if(this.channel < MIN_CHANNEL) {
			channel = 100;
		}else {
			channel = channel-1;
		}
	}
	
	
}
