package tij.ch06.example;

import java.util.Scanner;

public class BankApplication {

	static final Scanner scanner = new Scanner(System.in);
	static Account[] accounts = new Account[100];
	static int capa = -1; 

	public static void main(String[] args) {
		int number =0;
		while(number<5 ){
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("선택>");	
		
		number = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(number) {
		
		case 1:
			System.out.println("계좌생성");
			createAccount();
			break;
			//createAccount 메소드
			
		case 2:
			System.out.println("계좌목록");
			listAccount();
			break;
			
		case 3:
		case 4:
		case 5:
			
		}
		System.out.println("프로그램 종료");
	}
}
		
	
	static void createAccount() {
	
	System.out.println("계좌번호:");
	String accountNumber = scanner.nextLine();
	System.out.println("계좌주:");
	String accountOwner= scanner.nextLine();
	System.out.println("초기입금액:");
	int bankAccount=Integer.parseInt(scanner.nextLine());
	System.out.println("계좌가 생성되었습니다.");
	
	accounts[++capa] = new Account(accountNumber,accountOwner,bankAccount);
	
	
	}
	
	
	static void listAccount() {
		
		for(int i=0;i<capa;i++) {
			System.out.println(accounts[i].accountNumber + 
					accounts[i].accountOwner + 
					accounts[i].getBalance());  //setbalance로 설정되어있어서 getBalance 로 호출
		}
		
	}
	
	static void deposit() {
		
	}
	
	static void withdraw() { 
		
	}
	
	
 }

