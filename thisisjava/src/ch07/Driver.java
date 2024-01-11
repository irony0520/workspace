package ch07;

public class Driver {

	
	public String name;
	public Vehicle vehicle;
	
	//has a 관계(driver가 vehicle을 소유)
	//bus taxi 는 is a 관계 
	
	Driver(String name) {
		this.name = name;
	}
	
	
	public void drive() {
		
		this.vehicle.run(this.name);
		
	}
	
}
