package ch07;

public class AirplaneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = Flymode.SUPERSONIC;
	//enum Flymode의 값  //SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.land();
		
		
	}

}
