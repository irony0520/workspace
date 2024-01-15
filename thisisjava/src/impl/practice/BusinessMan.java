package impl.practice;

public class BusinessMan extends NameTag{

	int wholeProfit;
	int wholeCost;
	
	public BusinessMan(String name,int tag,int wholeProfit,int wholeCost) {
		this.name = name;
		this.tag = tag;
		this.wholeProfit = wholeProfit;
		this.wholeCost = wholeCost;
	}
	
	
	
	
	
	
	
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