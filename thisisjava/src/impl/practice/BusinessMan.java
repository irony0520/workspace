package impl.practice;

public class BusinessMan extends NameTag{

	int wholeProfit;
	int wholeCost;
	
	
	
	
	
	
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public int getTag() {
		return this.tag;
	}
	
	
	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		double tax =0.0;
		int taxCost = wholeProfit-wholeCost;
		if(taxCost>=40000000) {
			tax = taxCost*0.2;
		}
		else if(taxCost>0); {
			tax = taxCost*0.1;
		}else {
			tax = 0;
		}
		return tax;
		
	}
	
	
	
}
