package ch06;

public class CalculatorStaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CalculatorStatic cal = new CalculatorStatic();
		double result1 = 10*10*CalculatorStatic.pi;		
		int result2 = CalculatorStatic.plus(10, 5);
		int result3 = CalculatorStatic.minus(10, 5);
		
		System.out.println(result1 + " " + result2 + " " + result3);
		
	}

}
