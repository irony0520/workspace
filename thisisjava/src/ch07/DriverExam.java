package ch07;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver = new Driver("홍길동");
		
		Bus bus = new Bus();
		
		driver.vehicle = bus;
		
		driver.drive();
		
		Taxi taxi = new Taxi();
		driver.vehicle = taxi;
		driver.drive();
		
		
		}
	}

