package chapter_3;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		int d1 = (int)(Math.random() * 6 )+1;
		int d2 = (int)(Math.random() * 6 )+1;
		int d3 = (int)(Math.random() * 6 )+1;
		int max = Math.max(Math.max(d1,d2),d3);
		
	

		
		
		System.out.print("첫 번째 주사위를 굴리시겠습니까? ->");
		String str = scanner.nextLine(); 
		System.out.printf("\n첫 번째 주사위의 값: %d",d1);
		
		System.out.print("\n두 번째 주사위를 굴리시겠습니까? ->");
		String str2 = scanner.nextLine(); 
		System.out.printf("\n두 번째 주사위의 값: %d",d2);
		
		System.out.print("\n세 번째 주사위를 굴리시겠습니까? ->");
		String str3= scanner.nextLine(); 
		System.out.printf("\n세 번째 주사위의 값: %d",d3);
		
		
		if(d1==d2 && d2==d3) {System.out.printf("\n총 상금은 %d원 입니다",10000+d1*1000);
		
		}
		else if(d1==d2 || d2==d3) {System.out.printf("\n총 상금은 %d원 입니다",1000+d2*100);
		}
		else if(d1==d2 || d1==d3) {System.out.printf("\n총 상금은 %d원 입니다",1000+d1*100);
		}
		else if(d1==d3 || d2==d3) {System.out.printf("\n총 상금은 %d원 입니다",1000+d3*100);
		}
		
		else{System.out.printf("\n총 상금은 %d원 입니다",max*100);}
		
	}
}
		
		
	
	

	


//if (d1==d2 && d2==d3) {
//	System.out.println(10000+d1*1000);
//}

//if 문이랑최댓값