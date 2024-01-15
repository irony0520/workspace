package impl.practice;

public class SalaryOrCeoExam {

	
	
	public static void main(String[] args) {
		
		SalaryMan salary = new SalaryMan("선남",100,3000000);
		System.out.println(salary.getInfo());
		System.out.println(Salary.getName() + "의 세금 = " + SalaryTaxPayer(salary)) ;
		

		BusinessMan Business = new BusinessMan("선녀",200,12000000,75000000);
		System.out.println(Business.getInfo());
		System.out.println(Business.getName() + "의 세금 = " + BusinessTaxPayer(Business);
	}
	


private static double SalaryTaxPayer(SalaryMan s) {
	  return s.calcTax();
	}



private static double BusinessTaxPayer(BusinessMan b) {
	  return b.calcTax();
	}
}



