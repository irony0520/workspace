package ch08.example;

public class TV implements Remocon{
	
	
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remocon r = new TV();
		r.powerOn();

	}
	}


