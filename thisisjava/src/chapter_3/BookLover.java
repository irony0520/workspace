package chapter_3;

import java.util.Scanner;

public class BookLover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
		System.out.print("1년동안 읽은 책 수를 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		int books = Integer.parseInt(scanner.nextLine());
		int booksDivision = books/10;
		
		
		switch(booksDivision) {
		
		case 0:
			System.out.println(" ");
			break;
		case 1:
			System.out.println("책 읽는 것을 즐기는 분이시네요!");
			break;
		case 2: 
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default: 
			System.out.println("당신은 다독왕입니다!");
		}
		
		
		
		
	}

}
