package ch13;

public class HomeAgency implements Rentable<Home>{
	
	
	public Home rent() {
		return new Home();
	}

}
