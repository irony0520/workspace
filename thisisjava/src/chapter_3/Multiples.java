package chapter_3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 ->");
		Scanner scanner = new Scanner(System.in);
		double num = Double.parseDouble(scanner.nextLine()); 

		if(num%3==0){
		System.out.println("3의 배수이다.");
	
		
		
		if(num%4==0){
		System.out.println("4의 배수이다.");}
		
		if(num%6==0){
		System.out.println("6의 배수이다.");}
		
		if(num%8==0){
		System.out.println("8의 배수이다.");}
		}
		else {
		System.out.println("어느 배수도 아니다.");}
	}

}

