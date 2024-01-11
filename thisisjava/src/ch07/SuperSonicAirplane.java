package ch07;

public class SuperSonicAirplane extends Airplane{

	
//	public static final int NORMAL = 1; // 1, 2를넣는거보다 명시적인 효과가 강함
//	public static final int SUPERSONIC = 2; //상수로 상태만드는경우 많음, enum으로 대체가능
	
	public Flymode flymode = Flymode.NORMAL;
	
	
	@Override
	
	public void fly() {
		if(flymode == Flymode.SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
			
		}else {
			super.fly();
		}
	}
	
	
	
}
