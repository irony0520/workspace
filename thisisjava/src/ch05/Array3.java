package ch05;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int classes = 0;
		int students = 0;
		//int height = 0;
		
		System.out.print("학급 수를 입력하세요-->");
		
		Scanner scanner = new Scanner(System.in);
		classes = scanner.nextInt();
		int heights [][] = new int[classes][]; //[{], {}, {]]
		
		for(int i =0;i<classes;i++) {
			System.out.print((i+1) + "반 학생 수를 입력하세요-->");
			students = scanner.nextInt();
			heights[i] = new int[students];
			for(int j =0;j<students;j++) {
				System.out.print((i+1) +"반의"+ (j+1) +"번 학생의 키를 입력하세요-->");
			
				heights[i][j] = scanner.nextInt();
				
			}
		}
		
		
		for(int i =0;i<classes;i++) {
			System.out.println((i+1)+"반");
			for(int j =0;j<students;j++) {
				System.out.println("학생들의 키:" +heights[i][j]);
			}
		} 
		
		
		
			
			
		
		
	
		}
		
		
	}


