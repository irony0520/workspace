package chapter_3;

import java.util.Scanner;

public class Newyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연도를 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		int leapYear = Integer.parseInt(scanner.nextLine()); 
		
		if(leapYear%4==0 && leapYear%100 != 0) {
			System.out.println("윤년입니다.");
		}
		
		else if(leapYear%4==0 && leapYear%400 == 0) {
			System.out.println("윤년입니다.");
		}
		
		else {
			System.out.println("윤년이 아닙니다.");
		}
			//연도 입력
		//if 4의 배수인가 
		
		
	}

}
