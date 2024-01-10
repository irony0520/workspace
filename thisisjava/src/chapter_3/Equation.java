package thisisjava;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("a값을 입력하세요-->");
		a = scanner.nextInt();
		System.out.print("b값을 입력하세요-->");
		b = scanner.nextInt();
		System.out.print("c값을 입력하세요-->");
		c = scanner.nextInt();
		
//		a값 출력
//		scanner.nextint ..args 
//		b값입력
//		...a
//		c값입력 
		System.out.print("해당 방정식을 만족하는 모든 해를 출력합니다");
		for(int x=0;a*x<=c;x++) {
			for(int y=0;b*y<c;y++) {
				if(a*x+b*y==c) {
					System.out.print("("+ x +","+ y  + ")");
				}
			}
		
				

	}
		System.out.print("\n모든 해를 출력 후 종료합니다.");
		

}
}
