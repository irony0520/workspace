package ch07;

public class Computer extends Calculator{
	
	@Override //생략가능
	
	public double areaCircle(double r) {
		//super.areaCircle(r);
		System.out.println("Computer의 areaCircle 메소드");
		return Math.PI*r*r;
	}
	

}