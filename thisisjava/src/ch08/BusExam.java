package ch08;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 안됨
		
		Bus bus = (Bus) vehicle; //강제형변환 bus(변수이름) 
		
		
		bus.run();
		bus.checkFare();
		
		Vehicle taxi  = new Taxi();
		taxi.run();
		
		System.out.println();
		
		ride(taxi); //false라 checkFare 실행안함
		ride(bus); // true라 checkFare 실행 
		
	}

	static void ride(Vehicle v) {
		v.run();
		if(v instanceof Bus b) {
			//Bus b= (Bus) v 가 생략됨(자바 12부터)
			b.checkFare();
		}
		// v.checkFare(); 실행안됨
		
	}
	
}
