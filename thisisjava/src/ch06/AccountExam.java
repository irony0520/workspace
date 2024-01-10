package ch06;

public class AccountExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		int myBalance = ac.getBalance();
		System.out.println(myBalance);
		
		//ac.setBalance(900);
		ac.setBalance(10000);
		ac.withdraw(1200);
		myBalance = ac.getBalance();
		System.out.println(myBalance);
	}

}
