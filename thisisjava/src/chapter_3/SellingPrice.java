package chapter_3;

import java.util.Scanner;

public class SellingPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("구매 금액을 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		int price = Integer.parseInt(scanner.nextLine()); 
		int discount = 0;
		
		if(price>=300000) {
			discount = 30000;
		}
		else if(price>=100000) {
			discount = 5000;
		}
		else {
			discount = 0;
		}
		
		System.out.printf("구매금액: %d\n 할인액:%d\n 청구금액:%d\n",price,discount,price-discount);
		
		
		
	}

}
