package ch13;

public class RentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HomeAgency ha = new HomeAgency();
		Home home = ha.rent();
		home.turnOnLight();
		
		CarAgency ca = new CarAgency();
		Car car = ca.rent();
		car.run();
		
	}

}
