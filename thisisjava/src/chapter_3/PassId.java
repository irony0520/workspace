package chapter_3;

import java.util.Scanner;

public class PassId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("출입증에 표기된 호수를 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		int idCard = Integer.parseInt(scanner.nextLine());

		int i = 1;
		switch(idCard) {
		
		case 302:
			
			
			System.out.printf("%d. %d호",i++,302);
		
		case 202:
			
			System.out.printf("\n%d. %d호",i++,202);
		
		case 201:
			
			System.out.printf("\n%d. %d호",i++,201);
		
		case 103:
			
			System.out.printf("\n%d. %d호",i++,103);
		
		case 102:
			
			System.out.printf("\n%d. %d호",i++,102);
		
		case 101:
			
			System.out.printf("\n%d. %d호",i++,101);
			
	
			break;
		}
		
	
		
	}

	
	
	
	


	
}