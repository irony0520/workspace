package impl.practice;

import java.util.Scanner;

public class DogDriver {
	
	
	String name;
	int age;
	String wd;
	String cure;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Dog haru = new Dog();
		
		 for(int i =1; i <3; i++ ) {
		haru.name();
		haru.age();
		haru.setWd();
		haru.setcure();
		 }
		System.out.println("이름: " + Pet.name);
		System.out.println("나이:" + Pet.age );
		
		System.out.println("품종:" + Dog.wd); 
		if(Dog.cure.equals("예")) {
			System.out.println("예방주사를 맞았다.");
		}
		else {System.out.println("예방주사를 맞지 않았었다.");
	}

//
//		System.out.println("이름: " + Pet.name);
//		System.out.println("나이:" + Pet.age );
//		
//	    System.out.println("품종:" + Dog.wd); 
//		if(Dog.cure.equals("예")) {
//			System.out.println("예방주사를 맞았다.");
//		}
//		else {System.out.println("예방주사를 맞지 않았었다.");
//	}
//		
		
 }
}
