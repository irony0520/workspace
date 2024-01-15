package impl.practice;

public class SalaryOrCeoExam {

	
	
	public static void main(String[] args) {
		
		SalaryMan salary = new SalaryMan("ㅇ",23,304943);
		System.out.println(salary.getInfo());
		System.out.println(SalaryTaxPayer(salary));
		

		BusinessMan Business = new BusinessMan("ㅇ",23,304943,234);
		System.out.println(Business.getInfo());
		System.out.println(BusinessTaxPayer(Business));
	}
	


private static double SalaryTaxPayer(SalaryMan s) {
	  return s.calcTax();
	}



private static double BusinessTaxPayer(BusinessMan b) {
	  return b.calcTax();
	}
}



