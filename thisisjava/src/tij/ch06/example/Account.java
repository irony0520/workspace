package tij.ch06.example;

public class Account {
	
	String accountNumber;
	String accountOwner;
	String bankAccount;
	
	
	private int balance;
	static final int MIN_BALANCE= 0;
	static final int MAX_BALANCE= 1000000;
	
	Account() {} //클래스 생성 해야 뱅크어카운트에서 돌아감
	
	
	public Account(String accountNumber, String accountOwner, int bankAccount) {
		this.accountNumber = accountNumber;
		this.accountOwner =accountOwner;
		this.setBalance(balance); //private 접근 제한을 가지므로 setBalance 를 사용
	}
	
	
	
	public int getBalance() {
		return balance;
	}
	
	
	public void setBalance(int balance) {
		if(balance <MIN_BALANCE) {
			balance = 0;
			return;
		}if(balance >MAX_BALANCE) {
			balance =0;
			return;
		}else  {
			
			this.balance = balance;
			
			
		}
		
	}
}
