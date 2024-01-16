package thisisjava;

import java.util.Scanner;

public class Student {

	Scanner scanner = new Scanner(System.in);
	
	String name;
	int quiz;
	int middleExam;
	int finalExam;
	
	public Student(String name) {
		this.name = name;
	}
	
	
	public void quizEnter() {
		System.out.println(name + "의 퀴즈 점수를 입력하라 : ");
		quiz = scanner.nextInt();
		
	}
	
	public void middleExamEnter() {
		;
		System.out.println(name + "의 중간시험 점수를 입력하라 : ");
		middleExam = scanner.nextInt();
		if(middleExam > 100 && middleExam <0) {	
			System.out.println("중간시험 점수가 0보다 작거나 100보다 크다.");
		}
		
		 
		
	}
	
	
	public void finalExamEnter() {
		System.out.println(name + "의 기말시험 점수를 입력하라 : ");
		finalExam = scanner.nextInt();
		
	}
}
