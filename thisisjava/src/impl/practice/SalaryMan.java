package impl.practice;

public class SalaryMan extends NameTag{

	int salary;
	
	public SalaryMan(String name,int tag,int salary) {
		this.name = name;
		this.tag = tag;
		this.salary = salary;
		
	}
	
	
	public String getInfo() {
		return "이름: " + name + "번호: " + tag + "월급: " + salary;
		
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
		// TODO Auto-generated method stub
		double tax =0.0;
		if(salary>80000000) {
			tax = salary*0.3;
		}
		else if(salary>60000000) {
			tax = salary*0.2;
		}
		else if(salary>40000000) {
			tax = salary*0.15;
		}
		else if(salary>20000000) {
			tax = salary*0.1;
		}
		else {
			tax = salary*0.05;
		}
		return tax;
		
	}

 	@Override 
	public String getinfo () {
		return "이름 : " + Salary.getName() + ", 번호: " + Salary.getTag() + ", 월급: " + salary 
		
	
}
