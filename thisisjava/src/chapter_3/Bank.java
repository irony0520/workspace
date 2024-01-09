package thisisjava;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int bankAccount = 10000;
		int deposit = 0;
		int withdraw = 0;
			
		do {
			System.out.print("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("\n선택>");
			number = scanner.nextInt();
			
			switch(number) {
			case 1: 
				System.out.print("예금액>");
				deposit = scanner.nextInt(); 
				bankAccount += deposit;
				
				break;
				
				
			case 2:
				System.out.print("출금액>");
				withdraw = scanner.nextInt();
				if(withdraw>bankAccount) {
					System.out.print("잔고부족");
					System.out.printf("\n부족금액: %d\n",withdraw-bankAccount);
				}
				else {
				
				
				bankAccount -= withdraw;
				}
				break;
				
			case 3:
				
					System.out.printf("\n잔고> %d\n",bankAccount-withdraw);
				
					
				break;
			case 4 : 
				System.out.print("프로그램 종료");
				break;
			
		}
	}while(number !=4); 

}
}
