package impl.practice;

import java.util.Scanner;

public class DogDriver {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog haru = new Dog();
		haru.nameEnter();
		haru.ageEnter();
		haru.setWd();
		haru.setcure();
		
		
		Dog tomorrow = new Dog();
		tomorrow.nameEnter();
		tomorrow.ageEnter();
		tomorrow.setWd();
		tomorrow.setcure();
	}
	
//	public static boolean alertCure(Pet age, Dog setcure) {
//		if(age > 2 && )
		
//	}
	public static String enterResult(Pet p) {

		return "이름: " + p.name + "나이: " + p.age;
		
		
	}
	
	public static String enterResult2(Dog wd) {
		
	}
	
	
	
}
