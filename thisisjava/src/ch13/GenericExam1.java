package ch13;

public class GenericExam1 {

	public static void main(String[] args) {
		
		Product<TV,String> product1 = new Product<>();
		
		
		product1.setKind(new TV());
		
		
		
		TV tv = product1.getKind();
		product1.setModel("삼성 티비");
		 System.out.println(product1.getModel());
		
		 
		 Product<Car,String> product2 = new Product<>();
		 
		 product2.setKind(new Car());
		 product2.setModel("현대 자동차");
		 
		 Car car = product2.getKind();
		 System.out.println(product2.getModel());
		 
		
	}

}
