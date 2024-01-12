package impl.practice;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle genesis = new Car("제네시스",50000000,3500);
		System.out.println(genesis.getInfo());
		System.out.println("세금: " + calculate(genesis));
		
		Vehicle bongo = new Truck("봉고",20000000,2500.0);
		System.out.println(bongo.getInfo());
		System.out.println("세금: " + calculate(bongo));
		
		Vehicle soul = new Car("쏘울",15000000,1000);
		System.out.println(soul.getInfo());
		System.out.println("세금: " + calculate(soul));

	}
	
	private static double calculate(Vehicle v) {
	  return v.calcTax();
	}

	}
