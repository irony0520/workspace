package ch06;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		
		cal.plus(10, 10);
		cal.powerOn();
		System.out.println(cal.plus(10, 20)); 
		System.out.println(cal.minus(20, 10));
		System.out.println(cal.plus(15.5, 17.5));  
		System.out.println(cal.sum(2,3,5,6,7)); 
		System.out.println(cal.sum(new int[]{2,3,5,6,7})); 
		cal.powerOff();
		
	}

	
	
	
}
