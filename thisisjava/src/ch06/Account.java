package ch06;

class Account {
	
	private int balance;
	
	public int getBalance() {//잔고
		return this.balance;
		
	}

	
	public void setBalance(int money) {//계좌 개설시 초기값
		if(money>=1000) {
			this.balance = money;		
		}else {
			System.out.println("금액을 1000원 이상 입금해주세요");
		}
		
	}
	
	public int withdraw(int money) {//잔고
		if(money>=this.balance) {
			System.out.println("출금액이 잔고보다 큽니다.");
			return -1; //무조건 리턴값이 필요하고 정상적인 리턴값이 아닐때 return -1을 자주쓴다
			
		}else {
		this.balance -= money;
		return this.balance;
		}
	}
		
	
	
	
	
}
