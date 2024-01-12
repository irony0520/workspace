package impl.practice;

public class Car extends Vehicle{

	
	int gas;
	
	
	public Car(String model, int price, int gas) {
		
		this.model = model;
		this.price = price;
		this.gas = gas;
			
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
		if(gas>=3000) {
			tax = (int)(getPrice()*0.05);
		}
		else if(gas<3000 && gas >=1500) {
			tax =  (int) (getPrice()*0.03);
		}else {
			tax =  (int) (getPrice()*0.01);
		}
		return tax;
	}
	
	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		
    return "모델명: " + model +", 가격: " + getPrice() + ", 배기량: " + gas;	
		}

}
	

//@Override
//public String getModel() {
//	// TODO Auto-generated method stub
//	return super.getModel();
//}
//
//@Override
//public void setModel(String model) {
//	// TODO Auto-generated method stub
//	super.setModel(model);
//}
//
//@Override
//public int getPrice() {
//	// TODO Auto-generated method stub
//	return super.getPrice();
//}
//
//@Override
//public void setPrice(int price) {
//	// TODO Auto-generated method stub
//	super.setPrice(price);
//}
	
