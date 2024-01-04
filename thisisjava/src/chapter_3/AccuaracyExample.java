package chapter_3;

import java.math.*;

public class AccuaracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int apple =1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple -number*pieceUnit;
//		
//		
//		int apple = 1;
//		int number = 7;
//		double result =  (apple*10-number)/10.0;
//		
		BigDecimal apple = new BigDecimal(1);
		BigDecimal pieceUnit = new BigDecimal("0.1");
		BigDecimal number = new BigDecimal(7);
		
		BigDecimal tmp = number.multiply(pieceUnit);
		
		BigDecimal result = apple.subtract(tmp);
		
		System.out.println("사과 1개에서 남은 양:" + result);
	}

}
