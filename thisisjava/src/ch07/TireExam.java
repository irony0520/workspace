package ch07;

public class TireExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankoonTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
		
	}

}