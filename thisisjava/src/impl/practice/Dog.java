package impl.practice;

import java.util.Scanner;

public class Dog extends Pet{
	
	static String wd;
	static String cure;
	
	
	public Dog() {}
	
	static Scanner scanner = new Scanner(System.in);
	public static void setWd() {
		System.out.println("개의 품종을 입력하세요: ");
		 wd = scanner.nextLine();
	}
	
	public  static void setcure() {
		System.out.println("예방주사를 맞았나요?(예 혹은 아니오)");
		cure = scanner.nextLine();
		
	}
	
}
