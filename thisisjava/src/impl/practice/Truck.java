package impl.practice;

public class Truck extends Vehicle{
	
double weight;
	
	
	public Truck(String model, int price, double weight) {
		this.model = model;
		this.price = price;
		this.weight = weight;
			
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice() {
		
		return this.price;
	}

	@Override
	public void setPrice(int price) {
		
	}

	@Override
	public double calcTax() {
		double tax = 0.0;
		if(weight>=10000) {
			tax = (int)(getPrice()*0.04);
		}
		else if(weight<10000 && weight >=5000) {
			tax =  (int) (getPrice()*0.02);
		}else {
			tax =  (int) (getPrice()*0.01);
		}
		return tax;
	}
	
	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		
    return "모델명: " + model +", 가격: " + getPrice() + ", 배기량: " + weight;	
		}

}