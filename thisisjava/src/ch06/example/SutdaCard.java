package ch06.example;

public class SutdaCard {

	int num;
	boolean isKwang = false;
	
	SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = 3;
		this.isKwang = false;
	}
	
	
	String info() {
		if(isKwang ==true) {
			return this.num + "K";
			
		}else {
			return this.num + " "; 
		}
	}
	
}
