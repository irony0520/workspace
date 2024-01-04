package chapter_3;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int d1 = (int)(Math.random() * 6 )+1;
		int d2 = (int)(Math.random() * 6 )+1;
		int d3 = (int)(Math.random() * 6 )+1;
		
		System.out.print("첫 번째 주사위를 굴리시겠습니까? -> ");
		System.out.println(d1);
		System.out.print("\n두 번째 주사위를 굴리시겠습니까? ->");
		System.out.println(d2);
		System.out.print("\n세 번째 주사위를 굴리시겠습니까? ->");
		System.out.println(d3);
		
		
//		if (d1==d2 && d2==d3) {
//			System.out.println(10000+d1*1000);
//		}
	}

}
