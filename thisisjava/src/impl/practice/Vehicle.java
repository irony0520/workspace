package impl.practice;
	
	public abstract class Vehicle {
		
		
		String model;
		int price;
		
		public Vehicle() {}
	
		public Vehicle(String model,int price,int a){			
		}
		
	public abstract String getModel();


	public abstract void setModel(String model); 


	public abstract int getPrice(); 


	public abstract void setPrice(int price);
		
		
	public abstract double calcTax();
		

    abstract String getInfo();
	
//	public String getInfo(String model) {
//		
//		return model, price, calcTax
//		
//	}
//	
	
	
}