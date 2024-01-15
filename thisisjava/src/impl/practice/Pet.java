package impl.practice;

import java.util.Scanner;

public  class Pet {

	static String name;
	static int age;
	
	public Pet() {}
		
	static Scanner scanner = new Scanner(System.in);
	public static void name() {
		System.out.println("개의 이름을 입력하세요->");
		name = scanner.nextLine();
	};
	
	public static void age() { 
		System.out.println("개의 나이를 입력하세요:");
		age = scanner.nextInt();
	}
	
}
