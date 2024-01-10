package thisisjava;

import java.util.Scanner;

public class HappySejong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int money = 10000;
	

		
		System.out.printf("현재 가진 돈은 %d원 입니다." ,money);
		
		
		
		while(money>0) {
			System.out.printf("\n얼마를 사용하시겠습니까? - >");
			
			int usedMoney = Integer.parseInt(scanner.nextLine()); 
			
			if(usedMoney<=0) {
				System.out.printf("다시 입력해주세요, 사용 범위가 틀렸습니다.");
			}
				
			else {
			
			 money -= usedMoney;
			 System.out.printf("현재 가진 돈은 %,d원 입니다",money);
			 
			}
		}

		
	
		
		System.out.printf("\n모든 돈을 사용하였습니다... 종료");
		
		
	}


	
}
