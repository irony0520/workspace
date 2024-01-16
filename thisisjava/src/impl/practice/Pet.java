package impl.practice;

import java.util.Scanner;

public  class Pet {
	
	
	String name;
	int age;
	Scanner scanner = new Scanner(System.in);
	public void nameEnter() {
		System.out.println("개의 이름을 입력하세요: ");
		name = scanner.nextLine();
	}
	
	public void ageEnter() {
		System.out.println("개의 나이를 입력하세요: ");
		age = scanner.nextInt();
	}
	
}
